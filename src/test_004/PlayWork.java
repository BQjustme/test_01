package test_004;

import java.util.Scanner;

public class PlayWork{

    /*  需要一个充值之后的虚拟货币
        每次抽奖消耗虚拟货币
        需要一个单词抽奖方法为 68/次
    */
//    保底方法Count
    public static int Count = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static int sum = 0;
    public static int input;
    public static int max ;

    public static void main(String[] args) {
        System.out.println("输入0000进行查询累充");

        QiDong();
        }
//        抽奖奖池方法
        public static void ChouJiang(){
//        随机在数组里写入“绝品”之后随机抽出int数作为数组下标 数组内为null则为凡品
            String[] JiangChi = new String[100];
            JiangChi[0] = "绝品";
            JiangChi[5] = "绝品";
            JiangChi[11] = "绝品";
            JiangChi[22] = "绝品";
            JiangChi[33] = "绝品";
            JiangChi[44] = "绝品";
            JiangChi[99] = "SSR";
            for (int i = 0; i <= 9; i++) {
                int num = (int) (Math.random()*100);
                if (JiangChi[num]==null){
                    System.out.println("R");
                }else if (JiangChi[num]!=null){
                    System.out.println("SR");
                }else if (JiangChi[num] == JiangChi[99]){
                    System.out.println("SSR");
                }
            }
        }
//        主要启动方法游戏开始
        public static void QiDong(){
            System.out.println("请充值：");
            int a = scanner.nextInt();
//            累计充值算法
            input = a;            // int sum = 0;  用于累加输入的值的变量
            sum = sum + input;    // int input; 用于存储每次输入的值的变量
            switch (a){
                case 0000 :
                    System.out.println("累计充值为"+sum);
                    QiDong();
                    break;

                case 2222 : sum=0;
                    System.out.println("累计充值清理为："+sum);
                    QiDong();
                    break;
            }
            System.out.println("充值金额为："+a);
//        判断充值金额
            if (a!=648){
                System.out.println("充值金额不足请重新充值");
//            不足重新调用主函数
                QiDong();
            }else if (a==648){
                System.out.println("奖品如下");
                ChouJiang();
                Count++;
                System.out.println("还需要"+Count+"次大保底");
                if (Count==200){
                    Count=0;
                    System.out.println("自选SSR已发放");
                }
                QiDong();
            }
        }
    }



