package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak() {
        int sum = 0;
        int i = 0;
        while (true) {
            sum += i;
            i++;
            if (i == 100) {
                break;
            }
        }
        System.out.println("1부터 100까지 정수들의 합은 " + sum + "입니다.");
    }

    public void guguDanBreak() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                if (i == 5) break;
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
