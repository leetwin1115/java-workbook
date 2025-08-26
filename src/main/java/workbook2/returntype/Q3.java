package main.java.workbook2.returntype;

import java.util.List;
import java.util.Scanner;

public class Q3 {
    // TODO: copyArray 메서드 작성 (int[] 배열을 받아 깊은 복사 후 반환)
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];

        System.out.println(n + "개의 숫자를 입력하세요:");
        for (int i = 0; i < n; i++) original[i] = sc.nextInt();
        int[] copy = copyArray(original); // TODO: copyArray 메서드 작성 후 주석 해제
        // 원본 배열 변경
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        // TODO: copy 배열을 출력
        System.out.println("복사된 배열 : ");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");
        }

        sc.close();
    }
}