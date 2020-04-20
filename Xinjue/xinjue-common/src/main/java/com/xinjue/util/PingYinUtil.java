package com.xinjue.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
/**
 * @author tqf
 * @version 创建时间：2019-12-11 下午1:26:58
 * 类说明:
 */
public class PingYinUtil {
 /**
  * 获得所有拼音字母
  * @param args
  * @return
  */
 public static String getAllLeter(String args) {
  String result = "";
  char[] charArray = args.toCharArray();
  String[] strArr = new String[charArray.length];
  HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
  format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
  format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
  format.setVCharType(HanyuPinyinVCharType.WITH_V);
  int len = charArray.length;
  for (int i = 0; i <len ; i++) {
   try {
    strArr = PinyinHelper.toHanyuPinyinStringArray(charArray[i], format);
    if (strArr == null){
     result += charArray[i];
    }else {
     result += strArr[0];
    }
   } catch (BadHanyuPinyinOutputFormatCombination e) {
    e.printStackTrace();
   }
  }
  return result;
 }
 /**
  * 获得每个汉字的首字母
  * @param args
  * @return
  */
 public static String getFirstLeter(String args) {
  String result = "";
  char[] charArray = args.toCharArray();
  String[] strArr = new String[charArray.length];
  HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
  format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
  format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
  format.setVCharType(HanyuPinyinVCharType.WITH_V);
  int len = charArray.length;
  for (int i = 0; i <len ; i++) {
   try {
    strArr = PinyinHelper.toHanyuPinyinStringArray(charArray[i], format);
    if (strArr == null){
     result += charArray[i];
    }else {
     result += strArr[0].substring(0,1);
    }
   } catch (BadHanyuPinyinOutputFormatCombination e) {
    e.printStackTrace();
   }
  }
  return result;
 }
 public static void main(String[] args) {
	 //piccode = piccode.toLowerCase();//大写字母的话都转换为小写
		//piccode = piccode.toUpperCase();//小写字母转为大写
  System.out.println("脚本之家测试结果：");
  System.out.println("getAllLeter==" + getAllLeter("浙江省").toUpperCase());
  System.out.println("getFirstLeter==" + getFirstLeter("北京市").toUpperCase());
 }
}
 