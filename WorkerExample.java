/*
Develop a java application using Inheritance as per the following. 
Create a class Worker and derive two classes DailyWorker and 
SalariedWorker from it. Every worker has name, salary rate. 
Provide a method ComPay(int hours) to compute the week pay of 
every worker. A DailyWorker is paid on the basis of number of 
days he/she works. The SalariedWorker gets paid the wage for 40 
hours a week no matter what actual hours is. Implement this 
scenario to calculate the pay of workers. 
*/

import java.util.Scanner;
class Worker
{
    String name;
    double wage;
    double rate;
    Scanner sc = new Scanner(System.in);

    void accept()
    {
        System.out.println("Enter Worker name : ");
        name = sc.nextLine();

        System.out.println("Enter payment rate per hour : ");
        rate = sc.nextDouble();
    }

    void display()
    {
        System.out.println("Worker Name         : " + name);
        System.out.println("Rate of Pay         : " + rate);
        System.out.println("Weekly Wage         : " + wage); 
    }
}


class Daily extends Worker
{
    void comPay(int hours)
    {
        accept();
        wage = hours * rate;
        display();
        System.out.println("No. of hours worked : " + hours);
        System.out.println("Worker Type         : DAILY WORKER");
    }
}

class Salaried extends Worker
{
    void comPay(int hours)
    {
        accept();
        wage = 40 * rate;
        display();
        System.out.println("No. of hours worked : " + hours);
        System.out.println("Worker Type         : SALARIED WORKER");
    }
}


class WorkerExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Worker Menu-----------");
        System.out.println("1. Daily Worker");
        System.out.println("2. Salaried Worker");
        System.out.println("------------------------------");

        int ch = sc.nextInt();

        if(ch == 1)
        {
            Daily obj = new Daily();
            System.out.println("Enter the number of hours worked in a week : ");
            obj.comPay(sc.nextInt());
        }
        else if (ch == 2)
        {
            Salaried obj = new Salaried();
            System.out.println("Enter the number of hours worked in a week : ");
            obj.comPay(sc.nextInt());
        }
        else
        {
            System.out.println("\n!!!Invalid Input!!!");
        }
        
    }
}