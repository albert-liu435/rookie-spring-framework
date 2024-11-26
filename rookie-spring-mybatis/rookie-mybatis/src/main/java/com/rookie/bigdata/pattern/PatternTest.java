package com.rookie.bigdata.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Class PatternTest
 * @Description
 * @Author rookie
 * @Date 2024/11/26 17:36
 * @Version 1.0
 */
public class PatternTest {

    public static void main(String[] args) {
//        String input = "Hello, my age is 25 and my friend's age is 30.";
//
//        // 定义正则表达式
//        String regex = "\\d+"; // 匹配一个或多个数字
//
//        // 编译正则表达式为 Pattern 对象
//        Pattern pattern = Pattern.compile(regex);
//
//        // 创建 Matcher 对象，并使用正则表达式匹配输入字符串
//        Matcher matcher = pattern.matcher(input);
//
//        // 查找匹配的数字
//        while (matcher.find()) {
//            System.out.println("Found: " + matcher.group());
//        }

        String sql=
                "        SELECT id, userId, userHead, createTime\n" +
                "        FROM user\n" +
                "        where id = #{id}\n" +
                "    ";
        Pattern pattern1 = Pattern.compile("(#\\{(.*?)})");
        Matcher matcher1 = pattern1.matcher(sql);
        System.out.println(matcher1.find());
        System.out.println(matcher1.group(0));
        System.out.println(matcher1.group(1));
        System.out.println(matcher1.group(2));
    }
}
