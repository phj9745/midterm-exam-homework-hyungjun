package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);

    public void maxNumber() {
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("두 수의 값이 " + num1 + "로 같습니다.");
        }
    }

    public void minNumber() {
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num2);
        } else if (num2 > num1) {
            System.out.println(num1);
        } else {
            System.out.println("두 수의 값이 " + num1 + "로 같습니다.");
        }
    }

    public void threeMaxMin() {
        int max;
        int min;

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수를 입력해주세요 : ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 > num3) {
                    min = num3;
                } else {
                    min = num2;
                }
            } else {
                max = num3;
                min = num2;
            }
        } else {
            if (num2 > num3) {
                max = num2;
                if (num1 > num3) {
                    min = num3;
                } else {
                    min = num1;
                }
            } else {
                max = num3;
                min = num1;
            }
        }

        System.out.println("가장 큰 수 : " + max);
        System.out.println("가장 작은 수 : " + min);
    }

    public void checkEven() {
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }
    }

    public void isPassFail() {
        System.out.println("국어 점수를 입력하세요 : ");
        double koScore = sc.nextDouble();
        System.out.println("영어 점수를 입력하세요 : ");
        double engScore = sc.nextDouble();
        System.out.println("수학 점수를 입력하세요 : ");
        double mathScore = sc.nextDouble();

        if ((koScore + engScore + mathScore) / 3 < 60 || koScore < 40 || engScore < 40 || mathScore < 40) {
            if ((koScore + engScore + mathScore) / 3 < 60) System.out.println("평균 점수 미달로 불합격입니다.");
            if (koScore < 40) System.out.println("국어 점수 미달로 불합격입니다.");
            if (engScore < 40) System.out.println("영어 점수 미달로 불합격입니다.");
            if (mathScore < 40) System.out.println("수학 점수 미달로 불합격입니다.");
        } else System.out.println("합격입니다!");
    }

    public void scoreGrade() {
        System.out.println("점수를 입력해주세요 : ");
        int score = sc.nextInt();

        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A0");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B0");
        } else if (score >= 75) {
            System.out.println("C+");
        } else if (score >= 70) {
            System.out.println("C0");
        } else if (score >= 65) {
            System.out.println("D+");
        } else if (score >= 60) {
            System.out.println("D0");
        } else {
            System.out.println("F");
        }
    }

    public void checkPlusMinusZero() {
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("양수다.");
        } else if (num == 0) {
            System.out.println("0이다.");
        } else {
            System.out.println("음수다.");
        }
    }

    public void whatCharacter() {
        System.out.println("문자 하나를 입력하세요 : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("영어 소문자다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("영어 대문자다.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("숫자 문자다.");
        } else {
            System.out.println("기타 문자다.");
        }
    }

}
