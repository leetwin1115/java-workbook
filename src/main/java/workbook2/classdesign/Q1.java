package main.java.workbook2.classdesign;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    // TODO: 생성자 작성
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea(int width, int height) {
        // TODO: 넓이 반환
        int result = width * height;
        return result;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가로를 입력하세요.");
        int w = sc.nextInt();
        System.out.println("세로를 입력하세요.");
        int h = sc.nextInt();

        Rectangle rect = new Rectangle(w, h); // TODO: 생성자 작성 후 주석 해제

        // TODO: rect.getArea() 출력
        System.out.println(rect.getArea(w, h));
    }
}
