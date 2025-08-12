package main.java.com.javaBasics;

public class Var {//变量
    public static void main(String[] arge){
        //1，整型
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println("-----------");

        //2，字符串型，用‘+’可以将整型和字符串拼接起来
        String str = "一百";
        System.out.println(str);
        System.out.println(a + str);
        System.out.println(str + b);
    }
}
