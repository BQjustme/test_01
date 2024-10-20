package test_004;

import java.util.Scanner;
//虚拟货币类提供思路
public class Test_XuNi {
    public static int max;
    static Scanner sc = new Scanner(System.in);
    public static int sum;
    public static int input;

    public static void pao(){
        int SR = sc.nextInt();
        input = SR;
        sum = sum+input;
        System.out.println("一共有："+sum+"货币");

        switch (SR){
            case 18:
                System.out.println("减去了"+input+"个银币还剩"+(sum-input));
                pao();
                return;
        }

        pao();
    }
}
