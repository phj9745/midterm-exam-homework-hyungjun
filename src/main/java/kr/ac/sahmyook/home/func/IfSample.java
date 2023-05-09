package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    public void maxNumber() {
        System.out.println("maxNumber 메소드 실행");

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("두 수의 값이 " + num1 + "로 같습니다.");
        }
    }

    public void minNumber() {
        System.out.println("minNumber 메소드 실행");
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(num2);
        } else if (num2 > num1) {
            System.out.println(num1);
        } else {
            System.out.println("두 수의 값이 " + num1 + "로 같습니다.");
        }
    }

    public void threeMaxMin() {
        int bigNum;

        System.out.println("threeMaxMin 메소드 실행");
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수를 입력해주세요 : ");
        int num3 = sc.nextInt();

        if(num1 > num2) {
            bigNum = num1;

        }
    }

    public void checkEven() {
        System.out.println("checkEven 메소드 실행");
    }

    public void isPassFail() {
        System.out.println("isPassFail 메소드 실행");
    }

    public void scoreGrade() {
        System.out.println("scoreGrade 메소드 실행");
    }
    public void checkPlusMinusZero() {
        System.out.println("checkPlusMinusZero 메소드 실행");
    }

    public void whatCharacter() {
        System.out.println("whatCharacter 메소드 실행");
    }

}
