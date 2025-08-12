package main.java.com.javaBasics;

public class ChangeChar {//转义字符
    public static void main(String[] args){
        //‘\t’：添加一定间隔
        System.out.println("你\t好\t呀");
        System.out.println("--------------------");
        //‘\n’：换行
        System.out.println("你\n好\n呀");
        System.out.println("--------------------");
        //‘\\’：添加'\'
        System.out.println("你\\好\\呀");
        System.out.println("--------------------");
        //‘\',\"’：添加‘单/双引号’
        System.out.println("你\'好\"呀");
        System.out.println("--------------------");
        //‘\r’：用后一个字替换前一个字
        System.out.println("你\r好\r呀");
        System.out.println("--------------------");
    }
}
