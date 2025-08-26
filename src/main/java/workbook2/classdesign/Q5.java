package main.java.workbook2.classdesign;

import java.util.Scanner;

class Account {
    String accountNo;
    int balance;

    // TODO: 생성자, deposit, withdraw 메서드 작성
    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액 부족! 출금 실패. 현재 잔액: " + balance + "원");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요.");
        String accNo = sc.next();
        System.out.println("잔고?를 입력하세요.");
        int bal = sc.nextInt();

        Account acc = new Account(accNo, bal); // TODO: 생성자 작성 후 주석 해제
        String cmd1 = sc.next();
        int amt1 = sc.nextInt();
        if (cmd1.equals("deposit")) {
             acc.deposit(amt1); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
             acc.withdraw(amt1); // TODO: withdraw 메서드 작성 후 주석 해제
        }
        String cmd2 = sc.next();
        int amt2 = sc.nextInt();
        if (cmd2.equals("deposit")) {
             acc.deposit(amt2); // TODO: deposit 메서드 작성 후 주석 해제
        } else {
             acc.withdraw(amt2); // TODO: withdraw 메서드 작성 후 주석 해제
        }
    }
}