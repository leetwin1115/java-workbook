package main.java.workbook2.classdesign;

import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    // TODO: 생성자 작성
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        // TODO: 정보 출력
        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
        System.out.println("-------------------");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 책 이름을 입력하세요 : ");
        String t1 = sc.next();
        System.out.println("첫 번째 책 작가를 입력하세요 : ");
        String a1 = sc.next();
        System.out.println("첫 번째 책 가격을 입력하세요 : ");
        int p1 = sc.nextInt();
        System.out.println("두 번째 책 이름을 입력하세요 : ");
        String t2 = sc.next();
        System.out.println("두 번째 책 작가를 입력하세요 : ");
        String a2 = sc.next();
        System.out.println("두 번째 책 가격을 입력하세요 : ");
        int p2 = sc.nextInt();

        Book b1 = new Book(t1, a1, p1); // TODO: 생성자 작성 후 주석 해제
        Book b2 = new Book(t2, a2, p2); // TODO: 생성자 작성 후 주석 해제
        b1.printInfo(); // TODO: 생성자 작성 후 주석 해제
        b2.printInfo(); // TODO: 생성자 작성 후 주석 해제
    }
}