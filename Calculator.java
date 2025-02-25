package com.ashu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int answer = 0;
        while (true){
            System.out.println("Enter the Operator: ");
            char ch = sc.next().trim().charAt(0);
            if(ch== '+' ||ch== '-' ||ch== '*' ||ch== '/' ||ch== '%' ){
                System.out.println("Enter the first number: ");
                int num1= sc.nextInt();
                System.out.println("Enter the second number: ");
                int num2= sc.nextInt();
                if(ch == '+'){
                    answer = num1 + num2;
                }
                if(ch == '-'){
                    answer = num1 - num2;
                }
                if(ch == '*'){
                    answer = num1 * num2;
                }
                if(ch == '/'){
                    if(num2 !=0) {
                        answer = num1 / num2;
                    }
                }
                if(ch == '%'){
                    if(num2 !=0) {
                        answer = num1 % num2;
                    }
                }
                System.out.println("Answer is : "+ answer);
            }
            else if (ch == 'x' || ch == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }

        }
    }
}
