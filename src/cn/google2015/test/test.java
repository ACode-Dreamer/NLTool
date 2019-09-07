package cn.google2015.test;

import cn.google2015.utils.NLUtills;

/**
 * @author GWL
 * @date 2019/9/8-1:55
 */
public class test {
    public static int test() {
        try {
            String str = NLUtills.NLget("http://172.18.2.6/");
            int i = NLUtills.NLsearch(str);
            return i;
        } catch (Exception e) {
            return 0;
        }
    }
}
