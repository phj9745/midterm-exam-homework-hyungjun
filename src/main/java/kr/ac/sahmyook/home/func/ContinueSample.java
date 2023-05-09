package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) continue;
            sum += i;
        }
        System.out.println("1부터 100까지 정수 중 3의 배수를 뺀 정수들의 합 : " + sum);
    }

    public void rowColJump() {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for (int i = 0; i < 3; i++) {                               // 행
            for (int j = 0; j < 5; j++) {                           // 열
                if (i == 0 && (j == 2 || j == 3 || j == 4)) {       // 1행 3열부터 1행 5열까지 생략
                    continue;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
