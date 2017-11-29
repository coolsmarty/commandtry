
package com.practice.maven002;
import java.util.Scanner;

public class aaa
{
//    public static void main(String[] args)
//    {
    	public static void main(String[] args)
        {
            int balance = 5000;            //Initializing the balance
     
            java.util.Scanner sc = new java.util.Scanner(System.in);     //Scanner variable to take input from user
     
            System.out.println("Entering Withdrawl Money");
     
            int withdrawlMoney = sc.nextInt();      
     
            try
            {
               
     
                if(withdrawlMoney > balance)
                {
                    //throwing exception using anonymous inner class
     
                    throw new ArithmeticException()
                    {
                        @Override
                        public String toString()
                        {
                            return "You don't have that much of money in your account";
                        }
                    };
                }
                else
                {
                    System.out.println("Transaction Successful");
                }
            }
            catch(ArithmeticException ex)
            {
                System.out.println(ex);
            }
        }
    }