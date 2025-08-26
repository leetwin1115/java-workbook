package main.java.workbook2.classdesign;

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    // TODO: 생성자 및 addSeconds 메서드 작성
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void addSeconds(int sec) {
        second += sec;

        minute += second / 60;
        second %= 60;

        hour += minute / 60;
        minute %= 60;

        hour %= 24;
    }

    void printTime() {
        System.out.println("시간: " + hour + "시 " + minute + "분 " + second + "초");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int add = sc.nextInt();

         Time time = new Time(h, m, s); // TODO: 생성자 작성 후 주석 해제
         time.addSeconds(add); // TODO: addSeconds 메서드 작성 후 주석 해제

        // TODO: time.hour time.minute time.second 출력
        time.printTime();

        sc.close();
    }
}