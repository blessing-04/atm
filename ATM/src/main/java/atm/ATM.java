package atm;

import java.util.Scanner;

public class ATM{
    public static void main(String[] args){
        String[] defaultPins = {"79363","41346","04804","13601"};
        Scanner x = new Scanner(System.in);
        System.out.println("Enter PIN");
        String pin = x.nextLine();
        // information for account number 1
        double balance = 2300.09;
        String accHolder = "Mr SB Khumalo";
        String email = "khumalo@gmail.com";
        // information for account number 2
         double balance2 = 34865.78;
        String accHolder2 = "Mr PS Ngobeni";
        String email2 = "ngobeni@gmail.com"; 
         // information for account number 3
         double balance3 = 24945.48;
        String accHolder3 = "Ms PT Phiri";
        String email3 = "phiri@gmail.com"; 
        // information for account number 4
        double balance4 = 84549.42;
        String accHolder4 = "Mrs CW Khumalo";
        String email4 = "cwkhumalo@gmail.com";
        
        // Processing account 1
        for(int i = 0; i < defaultPins.length; i++){
            if(pin == defaultPins[0]){
                System.out.println("Available services: DEPOSIT CASH & CASH WITHDRAWAL");
                Scanner z = new Scanner(System.in);
                System.out.println("How can we help you");
                String serve = z.nextLine();
                String services = serve.toUpperCase();
                if(services == "DEPOSIT CASH"){
                    Scanner c = new Scanner(System.in);
                    System.out.println("Enter deposit amount");
                    double deposit = c.nextDouble();
                    double newBalance = balance + deposit;
                    System.out.println("Deposit Successful");
                    System.out.println(accHolder + " Your New Balance is: " + newBalance);
                }
                else if(services == "CASH WITHDRAWAL"){
                    Scanner v = new Scanner(System.in);
                    System.out.println("Enter Withdrawal Amount");
                    double withdrawal = v.nextDouble();
                    if(withdrawal < balance){
                        double newbalance = balance - withdrawal;
                        System.out.println("Withdrawal Successful");
                        System.out.println(accHolder + " Your New Balance is: " + newbalance);
                    }
                    else if(withdrawal > balance){
                        System.out.println("Insufficient Funds");
                    }
                }
            }
            // processing account number 2
            else if(pin == defaultPins[1]){
                System.out.println("Available services: DEPOSIT CASH & CASH WITHDRAWAL");
                Scanner z1 = new Scanner(System.in);
                System.out.println("How can we help you");
                String serve1 = z1.nextLine();
                String services1 = serve1.toUpperCase();
                if(services1 == "DEPOSIT CASH"){
                    Scanner c1 = new Scanner(System.in);
                    System.out.println("Enter deposit amount");
                    double deposit1 = c1.nextDouble();
                    double newBalance1 = balance2 + deposit1;
                    System.out.println("Deposit Successful");
                    System.out.println(accHolder2 + " Your New Balance is: " + newBalance1);
                }
                else if(services1 == "CASH WITHDRAWAL"){
                    Scanner v1 = new Scanner(System.in);
                    System.out.println("Enter Withdrawal Amount");
                    double withdrawal = v1.nextDouble();
                    if(withdrawal < balance2){
                        double newbalance1 = balance2 - withdrawal;
                        System.out.println("Withdrawal Successful");
                        System.out.println(accHolder2 + " Your New Balance is: " + newbalance1);
                    }
                    else if(withdrawal > balance2){
                        System.out.println("Insufficient Funds");
                    }
                }
            }    
            //Processing account number 3
            else if(pin == defaultPins[2]){
                System.out.println("Available services: DEPOSIT CASH & CASH WITHDRAWAL");
                Scanner z2 = new Scanner(System.in);
                System.out.println("How can we help you");
                String serve2 = z2.nextLine();
                String services2 = serve2.toUpperCase();
                if(services2 == "DEPOSIT CASH"){
                    Scanner c2 = new Scanner(System.in);
                    System.out.println("Enter deposit amount");
                    double deposit2 = c2.nextDouble();
                    double newBalance2 = balance3 + deposit2;
                    System.out.println("Deposit Successful");
                    System.out.println(accHolder + " Your New Balance is: " + newBalance2);
                }
                else if(services2 == "CASH WITHDRAWAL"){
                    Scanner v2 = new Scanner(System.in);
                    System.out.println("Enter Withdrawal Amount");
                    double withdrawal2 = v2.nextDouble();
                    if(withdrawal2 < balance3){
                        double newbalance = balance3 - withdrawal2;
                        System.out.println("Withdrawal Successful");
                        System.out.println(accHolder3 + " Your New Balance is: " + newbalance);
                    }
                    else if(withdrawal2 > balance3){
                        System.out.println("Insufficient Funds");
                    }
                }
            }
            else if(pin == defaultPins[3]){
                System.out.println("Available services: DEPOSIT CASH & CASH WITHDRAWAL");
                Scanner z3 = new Scanner(System.in);
                System.out.println("How can we help you");
                String serve3 = z3.nextLine();
                String services3 = serve3.toUpperCase();
                if(services3 == "DEPOSIT CASH"){
                    Scanner c3 = new Scanner(System.in);
                    System.out.println("Enter deposit amount");
                    double deposit3 = c3.nextDouble();
                    double newBalance3 = balance4 + deposit3;
                    System.out.println("Deposit Successful");
                    System.out.println(accHolder2 + " Your New Balance is: " + newBalance3);
                }
                else if(services3 == "CASH WITHDRAWAL"){
                    Scanner v3 = new Scanner(System.in);
                    System.out.println("Enter Withdrawal Amount");
                    double withdrawal3 = v3.nextDouble();
                    if(withdrawal3 < balance){
                        double newbalance3 = balance4 - withdrawal3;
                        System.out.println("Withdrawal Successful");
                        System.out.println(accHolder4 + " Your New Balance is: " + newbalance3);
                    }
                    else if(withdrawal3 > balance){
                        System.out.println("Insufficient Funds");
                    }
                }
           }     
        }
    }
}
    
