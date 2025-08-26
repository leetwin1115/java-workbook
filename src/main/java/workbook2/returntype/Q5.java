package main.java.workbook2.returntype;

import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q5 {
    // TODO: olderPerson 메서드 작성 (두 Person 중 나이가 더 많은 객체를 반환)
    public static Person olderPerson(Person p1, Person p2) {
        if (p1.age >= p2.age) {
            return p1;
        } else {
            return p2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 사람 이름을 입력해주세요.");
        String name1 = sc.next();
        System.out.println("첫 번째 사람 나이를 입력해주세요.");
        int age1 = sc.nextInt();
        System.out.println("두 번째 사람 이름을 입력해주세요.");
        String name2 = sc.next();
        System.out.println("두 번째 사람 나이를 입력해주세요.");
        int age2 = sc.nextInt();

        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);
         Person older = olderPerson(p1, p2); // TODO: olderPerson 메서드 작성 후 주석 해제

        // TODO: older.name과 older.age 출력
        System.out.println("나이가 더 많은 사람: " + older.name + ", 나이: " + older.age);

        sc.close();
    }
}