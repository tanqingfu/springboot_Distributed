package com.xinjue.test;

/**
 * 手机号码格式处理方法
 */
public class Mobile {
    public static void main(String[] args) {
        String mobile = "13123456789";
        substring(mobile);
        regex(mobile);
        idCardNumber("123456789987654321");
    }

    /**
     * 通过substring字符截取
     * @param mobile
     */
    public static void substring(String mobile){
        String phone = mobile;
        String phoneNumber = phone.substring(0, 3) + "****" + phone.substring(7, phone.length());
        System.out.println("phone总长度：" + phone.length());
        System.out.println("phone前3位：" + phone.substring(0, 3));
        System.out.println("phone中4位：" + phone.substring(3, 7));
        System.out.println("phone后4位：" + phone.substring(7, phone.length()));
        System.out.println("phone中4*：" + phoneNumber);
    }

    /**
     * 通过正则表达式替换
     * @param mobile
     */
    public static void regex(String mobile){
        String phone = mobile;
        String reget_mobile = "(\\d{3})\\d{4}(\\d{4})";
        //$1、$2、……表示正则表达式里面第一个、第二个、……括号里面的匹配内容
        String phoneNumber = phone.replaceAll(reget_mobile,"$1****$2");
        System.out.println("正则phone中4*：" + phoneNumber);
    }

    /**
     * 正则表达式处理身份证号嘛
     * @param idcard
     */
    public static void idCardNumber(String idcard){
        String idCard = idcard;
        //$1、$2、……表示正则表达式里面第一个、第二个、……括号里面的匹配内容
        String regex_idcard = "(\\d{4})\\d{10}(\\w{4})";
        String idCardNumber = idCard.replaceAll(regex_idcard,"$1**********$2");
        System.out.println("身份证号长度："+idCard.length());
        System.out.println("正则idCard中4*：" + idCardNumber);
    }
}
