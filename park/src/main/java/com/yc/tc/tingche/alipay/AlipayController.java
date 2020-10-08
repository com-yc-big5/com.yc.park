package com.yc.tc.tingche.alipay;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.yc.tc.tingche.bean.Orders;
import com.yc.tc.tingche.biz.OrderBiz;
import com.yc.tc.tingche.util.AlipayConfig;

public class AlipayController {

	
	@Resource
	public OrderBiz  orderService;
	/** 
	* @Description:  调用支付宝沙箱 --支付方法
	* @Author: zwt
	* @Date: 2019/10/16 
	*/
	@RequestMapping("alipaySum")
	public Object alipayIumpSum(Model model,String ordId, HttpServletResponse response)
	        throws Exception {

	    //根据前台传过来的订单 id 从数据库查出订单信息   然后把订单编号,订单金额,订单介绍放进请求
	    Orders order = orderService.getOrderByOrderId(ordId);
	    // 获得初始化的AlipayClient
	    AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
	            AlipayConfig.merchant_private_key, "json", AlipayConfig.charset,
	            AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
	    // 设置请求参数
	    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	    alipayRequest.setReturnUrl(AlipayConfig.return_url);
	 //   alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
	    alipayRequest.setBizContent("{\"out_trade_no\":\"" + order.getId() + "\"," + "\"total_amount\":\"" + order.getTotal()
	            + "\"," + "\"subject\":\"" + order.getUser_id() + "\"," + "\"body\":\"" + order.getPark_id() + "\","
	            + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
	    // 请求
	    String result = alipayClient.pageExecute(alipayRequest).getBody();
	    // System.out.println(result);
	//    AlipayConfig.logResult(result);// 记录支付日志
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter out = response.getWriter();
	    out.println(result);
	    return null;
	}
}
