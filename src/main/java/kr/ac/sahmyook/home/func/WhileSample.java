package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    Scanner sc = new Scanner(System.in);

    public void printUniCode() {
        System.out.print("문자를 하나 입력하세요 : ");
        char ch = sc.next().charAt(0);

        while (ch != '0') {
            System.out.format("0x%04X%n", (int) ch);
            ch = sc.next().charAt(0);
        }
    }

    public void sum1To100() {
        int sum = 0;
        int i = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1~100까지 합계 : " + sum);
    }

    public void numberGame() {
        int random = (int) (Math.random() * 100) + 1;       // 1부터 100 사이 난수 뽑기
        int num = 0;
        int count = 0;

        while (num != random) {
            System.out.println("정수를 입력하세요 : ");
            num = sc.nextInt();
            if (num < random) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else {
                System.out.println("입력하신 정수보다 작습니다.");
            }
            count++;
        }
        System.out.println("정답입니다. " + count + "회만에 정답을 맞추셨습니다.");
    }

    public void countCharacter() {
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.next();
        int i = 0;

        while (i < str.length()) {
            i++;
        }
        System.out.println("글자 개수 : " + i);
    }

    public void countInChar() {
        int count = 0;

        System.out.println("문자열 입력 : ");
        String str = sc.next();
        System.out.println("문자 입력 : ");
        char ch = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println(ch + " 문자가 포함된 갯수 : " + count + "개");
    }
}
