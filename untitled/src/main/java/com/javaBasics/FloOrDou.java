package main.java.com.javaBasics;

public class FloOrDou {//float和double的区别
    public static void main(String[] args) {
        float n1 = 3.1415926353f;
        double n2 = 3.1415926535;
        System.out.println(n1 + "\n" + n2);
        /*结果为 3.1415927
        3.1415926535，因为float的精度比double小，所以后面的位数没显示*/
        double num1 = 2.7;
        double num2 = 8.1/3;
        System.out.println(num1 == num2);//不等于
        System.out.println(num1 + "\n" + num2);
        //由结果可知，计算机认为num2中是8.1000...1/3的

        //怎么忽略.00...1呢
        if(Math.abs(num1 - num2) < 0.000000001){//Math.abs() 取结果的绝对值
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
}
