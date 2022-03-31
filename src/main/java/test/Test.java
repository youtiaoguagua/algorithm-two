package test;

import java.util.Base64;

/**
 * @author 王祥飞
 * @time 2022/3/25 13:43
 */
public class Test {
    public static void main(String[] args) {
        String str = "moduleCode=CMSK_SRM&redirectUrl=https://srm-manager-sit.cmsk1979.com";
        String s = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(s);
    }
}
