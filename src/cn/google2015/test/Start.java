package cn.google2015.test;

import java.util.Scanner;

/**
 * @author GWL
 * @date 2019/9/8-1:40
 */
public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("年轮校园网助手开始运行");
        int i = test.test();
        if (i == 1) {
            System.out.println("当前校园网已登录");
            return;
        }
        System.out.println("请输入校园网账号：");
        String user = sc.next();
        System.out.println("请输入校园网密码：");
        String pwd = sc.next();
        System.out.println("请设置延迟(建议500-1000毫秒)：");
        int time = sc.nextInt();
        try {
            new login(user, pwd, 1);
        } catch (Exception e) {
            //e.printStackTrace();
        }
        sc.close();
        int num = 1;
        while (true) {
            try {
                if(time==0){
                    Thread.sleep(500);
                }else{
                    Thread.sleep(time);
                }
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            if (test.test() == 1) {
                System.out.println("当前校园网已登录");
            } else {
                num++;
                try {
                    new login(user, pwd, num);
                } catch (Exception e) {
                    //e.printStackTrace();
                }
            }
        }

    }
}
