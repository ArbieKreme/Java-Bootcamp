package com.company.Day02;

import java.util.Scanner;

public class Atm {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBalance = 10000;
        int confirmReceipt;
        int enteredPin;
        int pin = 1234;


        int i = 3;
        while(i != 0){
            System.out.println("Enter PIN");
            enteredPin = sc.nextInt();
            //Your code here
            if(enteredPin==pin){
                System.out.println("\nWELCOME\n");
                System.out.println("Choose a transaction");
                System.out.println("1 Balance Inquiry");
                System.out.println("2 Withdraw");
                System.out.println("3 Deposit\n");


                System.out.println("\nChoose Transaction");
                int transactionType = sc.nextInt();


                //Balance Inquiry
                if(transactionType==1){

                    System.out.println("\nBalance Inquiry");
                    System.out.println("Do you want a receipt?\n1) Yes\n2) No\n");
                    confirmReceipt = sc.nextInt();
                    if (confirmReceipt == 1) {
                        System.out.println("You have " + totalBalance + " in your account.");
                        break;
                    } else if (confirmReceipt == 2) {
                        System.out.println("Thank you for banking with us.");
                        break;
                    } else

                        System.out.println("Thank you for banking with us.");
                        break;
                    //attempts++;

                }

                //WITHDRAWAL
                else if(transactionType==2) {
                    System.out.println("\nWithdrawal");

                    System.out.println("Enter Amount");
                    int withdrawalAmount = sc.nextInt();
                    if (withdrawalAmount > totalBalance) {
                        System.out.println("You have insufficient funds");
                        break;
                    } else {

                        if(withdrawalAmount<200){
                            System.out.println("Minimum withdrawal amount is 200.");
                            break;
                        }else

                        totalBalance = totalBalance - withdrawalAmount;


                        System.out.println("Do you want a receipt?\n1) Yes\n2) No\n");
                        confirmReceipt = sc.nextInt();
                        if (confirmReceipt==1) {
                            System.out.println("You have " + totalBalance + " in your account.");
                            break;
                        } else if (confirmReceipt==2){
                            System.out.println("Thank you for banking with us.");
                            break;
                        }else

                            System.out.println("Thank you for banking with us.");
                        break;
                        //attempts++;
                    }


                }

                //DEPOSIT
                else if(transactionType==3) {
                    System.out.println("\nDeposit");

                    System.out.println("Enter Deposit Amount");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        totalBalance = totalBalance + depositAmount;
                        System.out.println("Do you want a receipt?\n1) Yes\n2) No\n");
                        confirmReceipt = sc.nextInt();
                        if (confirmReceipt==1) {
                            System.out.println("You have " + totalBalance + " in your account.");
                            break;
                        } else if (confirmReceipt==2){
                            System.out.println("Thank you for banking with us.");
                            break;
                        }else

                            System.out.println("Thank you for banking with us.");
                        break;
                        //attempts++;
                    }



                }

            }

            else

            i--;
            System.out.println("You have entered a wrong pin. \n"+i+" attempts remaining");

        }



                }

        }



