package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner() {
        Scanner sc = new Scanner(System.in);

        System.out.print("byte 입력 : ");
        byte byteVar = sc.nextByte();
        System.out.print("char 입력 : ");
        char charVar = sc.next().charAt(0);
        System.out.print("short 입력 : ");
        short shortVar = sc.nextShort();
        System.out.print("int 입력 : ");
        int intVar = sc.nextInt();
        System.out.print("long 입력 : ");
        long longVar = sc.nextLong();
        System.out.print("float 입력 : ");
        float floatVar = sc.nextFloat();
        System.out.print("double 입력 : ");
        double doubleVar = sc.nextDouble();

        System.out.println("byte : " + byteVar);
        System.out.println("char : " + charVar);
        System.out.println("short : " + shortVar);
        System.out.println("int : " + intVar);
        System.out.println("long : " + longVar);
        System.out.println("float : " + floatVar);
        System.out.println("double : " + doubleVar);
    }

    public void testRandom() {
        Random rd = new Random();
        System.out.println("정수 난수 : " + rd.nextInt());
        System.out.println("실수 난수 : " + rd.nextDouble());
    }
}
