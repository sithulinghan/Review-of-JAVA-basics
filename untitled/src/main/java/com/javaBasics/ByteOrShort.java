package main.java.com.javaBasics;

public class ByteOrShort {//Byte和Short的区别
    public static void main(String[] args) {
        byte n1 = 3;//byte在内存开辟了一个字节的空间
        short n2 = 3;//short在内存开辟了2个内存空间
        System.out.println(n1);
        System.out.println(n2);
    }
}
