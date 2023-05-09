package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);

    public void sum1To10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void sumEven1To100() {
        int sum = 0;
        int num = 100;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1부터 100까지 짝수의 합 : " + sum);
    }

    public void oneGugudan() {
        int num;

        System.out.println("정수를 입력하세요 : ");
        num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public void sumMintoMax() {
        int sum = 0;
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                sum += i;
            }
        } else if (num2 > num1) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
        }
        System.out.println("합계 : " + sum);
    }

    public void printStar() {
        System.out.print("줄수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("칸수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printNumberStar() {
        int num = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
            }
            num++;
            System.out.println();
        }
    }

    public void printTriangleStar() {
        System.out.print("줄수를 입력해주세요 : ");
        int num = sc.nextInt();

        if (num > 0) {                              // 양수일 때 직각삼각형 출력
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (num < 0) {                       // 음수일 때 절대값 구하여 역삼각형 출력
            num = Math.abs(num);
            for (int i = num; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void guguDan() {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
