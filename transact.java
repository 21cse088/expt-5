package com.transact;
import java.util.*;
public class bank {
 static void credit()
  {
      System.out.println("credited amount");
  }
  static void debit()
  {
      System.out.println("debited amount");
  }
     String accno;  
     String name;    
     long balance;  
    Scanner sc = new Scanner(System.in);  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
     
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "Transaction failed" );  
        }  
    }  
    
  }
    
    public static void main(String[] args) {
        System.out.println("transaction");
    }
    
}