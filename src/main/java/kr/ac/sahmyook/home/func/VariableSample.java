package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    Scanner sc = new Scanner(System.in);

    public void myProfile() {
        String name = "박형준";
        final int AGE = 25;
        double height = 174.7;
        double weight = 73.2;

        System.out.println("저의 이름은 " + name + "이고, 나이는 " + AGE + "살 입니다." +
                "키는 " + height + "cm 이며, 몸무게는 " + weight + "kg 입니다.");
    }

    public void empInformation() {
        System.out.print("사원의 이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.print("부서를 입력해주세요 : ");
        String part = sc.next();
        System.out.println(part + "부서 " + name + "입니다.");
    }
}
