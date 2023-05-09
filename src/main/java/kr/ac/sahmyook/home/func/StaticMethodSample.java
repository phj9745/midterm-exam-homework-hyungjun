package kr.ac.sahmyook.home.func;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.random;

public class StaticMethodSample {

    public void testMathRandom() {
        int random = (int) (random() * 45) + 1;
        System.out.println("로또 번호 : " + random);
    }

    public void testMathAbs() {
        double num = -12.77;
        System.out.println(num + "의 절대값 : " + abs(num));
    }

    public void testMathMax() {
        int num1 = 120;
        int num2 = 54;
        System.out.println(num1 + "과 " + num2 + "중 큰 값 : " + max(num1, num2));
    }
}
