package cn.google2015.test;

import cn.google2015.utils.NLUtills;

/**
 * @author GWL
 * @date 2019/9/8-1:48
 */
public class login {
    public login(String user, String pwd, int num) {
        String str = NLUtills.NLpost("http://172.18.2.6/", "DDDDD=" + user + "%40unicom&upass=" + pwd + "&R1=0&R2=&R6=0&para=00&0MKKey=123456");
        int i = NLUtills.NLsearch("成功登录");
        if (i != 1) {
            System.out.println("校园网成功登录：" + num + "次");
        }
    }
}
