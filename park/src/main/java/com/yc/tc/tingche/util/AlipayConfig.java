package com.yc.tc.tingche.util;

public class AlipayConfig {
    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102500758102";//例：在沙箱网页中 信息部分中的必看部分2016101200671308

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCDsofxDeVCzL4Kfs1MhC1oimS4z5hvP3xmXlRO5ISlwz5kcCzjT5QTbEwIQyBhyJzkFLJbHRNfV+DjjIVKLERGAzRlbaWXMazP6Jy/md1f5zPtMhLxxU30X6XSlyqEX2RUohfr0GZqF/7PrXahQUnmwTBW0H6jdd7ThZfxChc2pnc8eu8SOLrfpD5KRqrynJBbMLiHNlmW55s41/TiUahoGXSrwEvI0LqeJNKVXL8pDG65kwLo0wf3oOEPi2JF8f3ydyEyphUwLKo1oWeszJVaYAXno7x6SuFXmzua9vLhWRdt1XY4TPGZzKN5m2Zu2IkeK7jptHwI7nSflyzPGs95AgMBAAECggEAXSeqmur+UQrsHhZld4tDZ2AFMOi+5Wodv3dX4VopLet2NatXRQ6kKjz/ZxS8Ug6KU5cENgjSDC3oCGz8V2QKgw9/P4OYjuL3XzUlsy3N9ilfhJdX6SZsJsCFVfnRfELRgEAL9aS63K7Oce48LII3GP9sBuyBt3QHws0LlddSZjfAVY+4vfnsDUi5BWRkXm/wqMoY3xZcECnNZ6VlbzqE/EEdRBMk0oggzU+9OcM7vq8LdcXVhsyV+RvSpbTcRgGN6Gsv6a2LtweR9LVWZMVkbZA8I2bcwhkwHmt1RYvdVCRlDKHDco6WukW6Yb009JGdiefB6klMtXQ5Qthcxc1X0QKBgQDZEKXSj38orgQwwWsphndoDN1TgOjZuHxycaVesu9VU8YjM+tu7+NSHHPw7LiwaIbCVw2OxmCnGayW14zbTVKeGIjhscoD4NTmYHLdwYJKwODqnvwVlXhxCCm4MDTs2kYFEitC8OdPOYSnjZKz9TqgyMRZIaawAnMkfpMr0KcYNQKBgQCbUeioqg0shUM4Z28QdqndXnl3t39VGc0fb/TbdxTEcCf+EYFkjjzcsdIiWEsjqmlrkebKAl9Pmavh0MuM6fpsCg63uzvlGxVK28B0mimTauw8TdLliilovchQxBNm1w8iGid1QLQmTO2mtwbxV8RjAotxEPKmKla3yIQyTsYqtQKBgB1Mf/Vx5QoKowopsVtDiS6EPgOdbNCmdDXGXTnxERkFW8M4qNiqjJZyvLuSWEOHeFkXAv94i2dCsecSZTLctwAb863zH39yg4otDpQcIIgSjMleeEw5hq5LGcaAy0QFGlpo32oDtlUdQGiVVW3w9d7p+obFYghz7DLK2vaZDVTZAoGBAIv6rewUFfthvss+rOHxj/VqB57VSXSw5CTJCawhDh5b1i8sJ6kwZ7meqPs7B70FAC1qOM0mhi9/F2FUg55j4MUt60W7AKfiWLY2hqSPq5iobG+M09z7P4aeQ8JGdBXjDEh3ucf6oGFEQ4pUuXUY3G0/BdzIoWcQEUdg94M/a2lhAoGAPfa6P3bs4nvVf3afaY7lgnJoePRPJnxTzuuZXk7Q7HbxuTfU15jYkHa8I92JMJqTS7XUfwA51w3c111ebUMpnMD2N7vBIYnSwD/ku9S83dq7JJfo/gDCsvee0Ll2eKN0wFc0yqSwp+LRJoKPspZiKXPYtlE27yXJhctOFqkb7Vs=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgE/TeR/nCrGzjOKAMVt6SbMGz4koULX7UmW//qM+zWLCWrw77JCaHDmiGZAJeTKl1I8ZvS8IQlL7yb6DtyZC1po3knb3zRAPJrzmVCClHS51nMFOqUz03gSdhE6XCsnsKmAkViHDfmUsCUvTuV9Aay1YwLwZaq2fzGuwzMgSmS4S4H+mV9g5Nf2P1dl6TV3GrM3V996vWNipChqOkxHRMTpZycOyxLfglnBI0HdwWzTPQdW9K8xOlizALdPEg/xR4JMsApZdjxWyoeSwphkLplp9PjI92/RiI6gOKW6JUNYOMCnMKkJugXmCPJ6WyFE9NiqdFQyHd8u4LqnkkXQQ9QIDAQAB";
    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
   // public static String notify_url = "127.0.0.1:8080/index.html";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    /**
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作，谢谢
     * 要是看不懂就找度娘，或者多读几遍，或者去看支付宝第三方接口API，不看API直接拿去就用，遇坑不怪别人
     */
    public static String return_url = "127.0.0.1:8080/index.html";
    
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 日志地址
    //public static String log_path = "D:/logs/";
    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


}