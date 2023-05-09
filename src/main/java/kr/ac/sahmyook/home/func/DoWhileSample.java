package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    Scanner sc = new Scanner(System.in);

    public void addDashToken() {
        String dashStr = "";
        int i = 0;
        System.out.println("문자열을 입력해주세요 : ");
        String str = sc.next();
        do {
            dashStr += str.charAt(i);
            if (i != str.length() - 1) dashStr += '-';
            i++;
        } while (i < str.length());

        System.out.println(dashStr);
    }

    public void burgerKingMenu() {
        int price = 0;
        String choiceMenu = "";
        int no;

        System.out.println("=== 버거킹 메뉴판 ===");
        System.out.println("메뉴를 선택해주세요.");

        do {
            System.out.println("1. 와퍼 - 5900원");
            System.out.println("2. 치즈와퍼 - 6900원");
            System.out.println("3. 통새우와퍼 - 7900원");
            System.out.println("4. 와퍼주니어 - 3500원");
            System.out.println("5. 어니언링 - 2000원");
            System.out.println("9. 주문 끝내기");
            System.out.print("주문할 메뉴 선택 : ");
            no = sc.nextInt();

            switch (no) {
                case 1:
                    price += 5900;
                    choiceMenu += "와퍼, ";
                    System.out.println("와퍼를 주문하셨습니다. 현재까지 " + price + "원 주문하셨습니다.");
                    break;
                case 2:
                    price += 6900;
                    choiceMenu += "치즈와퍼, ";
                    System.out.println("치즈와퍼를 주문하셨습니다. 현재까지 " + price + "원 주문하셨습니다.");
                    break;
                case 3:
                    price += 7900;
                    choiceMenu += "통새우와퍼, ";
                    System.out.println("통새우와퍼를 주문하셨습니다. 현재까지 " + price + "원 주문하셨습니다.");
                    break;
                case 4:
                    price += 3500;
                    choiceMenu += "와퍼주니어, ";
                    System.out.println("와퍼주니어를 주문하셨습니다. 현재까지 " + price + "원 주문하셨습니다.");
                    break;
                case 5:
                    price += 2000;
                    choiceMenu += "어니언링, ";
                    System.out.println("어니언링을 주문하셨습니다. 현재까지 " + price + "원 주문하셨습니다.");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        } while (no != 9);
        System.out.println("주문하신 메뉴는 " + choiceMenu + "입니다.");
        System.out.println("총 가격은 " + price + "원입니다.");
    }

    public void isStringAlphabet() {
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.next();
        boolean isAlpabet = true;
        int i = 0;
        do {
            if (str.charAt(i) < 'A' || str.charAt(i) > 'z') isAlpabet = false;
            i++;
        } while (isAlpabet && i < str.length());

        if(isAlpabet) System.out.println("모든 글자 영문자다.");
        else System.out.println("영문자 아니다.");
    }
}
