package com.zh.program.Common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtils {
	/**验证是否为手机号*/
    public static boolean isPhone(String userPhone){
    	if(StrUtils.isBlank(userPhone)) return true;
        String regexPhone = "^1\\d{10}$";
        Pattern p = Pattern.compile(regexPhone);
        Matcher m = p.matcher(userPhone);
        return m.matches();
    }

    /**验证是否为6-18位数字和字母的组合*/
    public static boolean isDigitalAndWord(String userInput){
        if (StrUtils.isBlank(userInput)){
            return false;
        }
        //用户代码必须为数字或字母，只能为6~18位
        String regexLoginPwd = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,18}$";
        return userInput.matches(regexLoginPwd);
    }

    /**验证是否为6位数字的交易密码*/
    public static boolean isTradePwd(String userPwd){
        if (StrUtils.isBlank(userPwd)){
            return false;
        }
        String regexTradePwd = "^\\d{6}$";
        return userPwd.matches(regexTradePwd);
    }

    /**验证是否为6位数字的验证码*/
    public static boolean isVerificationCode(String verificationCode){
        if (StrUtils.isBlank(verificationCode)){
            return false;
        }
        String regexTradePwd = "^\\d{6}$";
        return verificationCode.matches(regexTradePwd);
    }

    /** 验证邮箱格式是否正确*/
    public static boolean isEmail(String userEmail){
        if (StrUtils.isBlank(userEmail)){
            return false;
        }
        String email ="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
        return userEmail.matches(email);
    }
    
    
    public static String replacePwdOfLog(String str){
    	String pwdStr = replaceAll(str, "\"password\":\".+?\"", "\"password\":\"***\"");
    	return replaceAll(pwdStr, "\"oldPassword\":\".+?\"", "\"oldPassword\":\"***\"");
    }


    /**
     * 替换匹配到的字符串为目标字符串
     * @param str
     * @param pattern 正则表达式
     * @param replace 目标字符串
     * @return String
     * @date 2018-2-2
     * @author lina
     */
    public static String replaceAll(String str,String pattern,String replace){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        String dest = m.replaceAll(replace);
        return dest;
    }
}
