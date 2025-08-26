package main.java.workbook2.returntype;

import java.util.Scanner;

public class Q1 {
    // TODO: add 메서드 작성
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요.");
        int b = sc.nextInt();

        // TODO: add 호출 후 결과 출력
        int result = add(a, b);
        System.out.println("결과 : " + result);

        sc.close();
    }
}