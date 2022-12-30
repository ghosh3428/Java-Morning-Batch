package calculatorexample;

import Sample.Calculator;

public class ScientificCalculator extends Calculator {

    private void acceptOne() {
        System.out.println("Enter a number : ");
        firstNumber = sc.nextDouble();
    }

    private void sqroot() {
        System.out.println("Square Root of the number is : " + Math.sqrt(firstNumber));
    }

    private void power() {
        System.out.println("Result of power is : " + Math.pow(firstNumber, secondNumber));
    }

    private void sinQ() {
        System.out.println("Result of SinQ is : " + Math.sin(firstNumber));
    }

    private void cosQ() {
        System.out.println("Result of CosQ is : " + Math.cos(firstNumber));
    }

    private void tanQ() {
        System.out.println("Result of TanQ is : " + Math.tan(firstNumber));
    }

    public void menu() {
        int ch = 1;
        while (ch != 0) {
            System.out.println("----------------CALCULATOR MENU-----------------");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Div");
            System.out.println("4. Mul");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. SinQ");
            System.out.println("8. CosQ");
            System.out.println("9. TanQ");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------------");

            ch = sc.nextInt();

            if (ch >= 1 && ch <= 5) {
                acceptTwo();
            } else if (ch >= 6 && ch <= 9) {
                acceptOne();
            }

            switch (ch) {
                case 1:
                    add();
                    break;

                case 2:
                    sub();
                    break;

                case 3:
                    div();
                    break;

                case 4:
                    mul();
                    break;
                    
                case 5:
                    power();
                    break;
                    
                case 6:
                    sqroot();
                    break;
                    
                case 7:
                    sinQ();
                    break;
                    
                case 8:
                    cosQ();
                    break;
                    
                case 9:
                    tanQ();
                    break;

                case 0:
                    System.out.println("\n\nTHANK YOU\n\n");
                    break;

                default:
                    System.out.println("!!! Invalid Input !!!");
            }
        }
    }

}
