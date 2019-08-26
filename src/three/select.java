package three;

/**
 * Author : XiaoBa
 * Time : 2019/8/26 14:27
 * function:第三章-选择语句
 * 选择就要用到条件,条件就是布尔表达式.
 */

import java.math.*;
import java.util.Scanner;

public class select {
    public static void main(String[] args){
        //boolean数据类型:变量在比较过程中产生的结果为布尔值,True/False.
        double radius=1;
        System.out.println(radius>1);

        //定义一个布尔变量.
        boolean light=true;
        System.out.println("布尔变量light:"+light);

        // 主方法中调用calculation()方法.
        calculation();
    }

    // 案例：简单的计算器.
    public static void calculation(){
        // System.currentTimeMillis(): 产生当前的毫秒.
//        int number1=(int)(System.currentTimeMillis() % 10);
//        int number2=(int)(System.currentTimeMillis() % 10);

        // 产生随机数的第二个方法.
        // random:产生一个[0.0,1.0]的随机数.
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);

        // Create a Scanner.
        Scanner input=new Scanner(System.in);

        String text="What is "+number1+"+"+number2+"?";
        System.out.println(text);

        int answer=input.nextInt();
        String answer_text=number1+"+"+number2+"="+answer+" is "+(number1+number2==answer)+"!";
        System.out.println(answer_text);
    }
}


