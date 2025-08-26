package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Q6 {
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public static Student bestStudent(Student s1, Student s2, Student s3) {
        Student best = s1; // 첫 번째 학생을 기준으로 시작
        if (s2.score > best.score) best = s2;
        if (s3.score > best.score) best = s3;
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 학생 이름을 입력해주세요.");
        String n1 = sc.next();
        System.out.println("첫 번째 학생 점수를 입력해주세요.");
        int s1 = sc.nextInt();
        System.out.println("두 번째 학생 이름을 입력해주세요.");
        String n2 = sc.next();
        System.out.println("두 번째 학생 점수를 입력해주세요.");
        int s2 = sc.nextInt();
        System.out.println("세 번째 학생 이름을 입력해주세요.");
        String n3 = sc.next();
        System.out.println("세 번째 학생 점수를 입력해주세요.");
        int s3 = sc.nextInt();

        Student st = bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3)); // TODO: bestStudent 메서드 작성 후 주석 해제

        // TODO: st.name과 st.score 출력
        System.out.println("우수학생 이름 : " + st.name + "우수학생 성적" + st.score);
    }
}
