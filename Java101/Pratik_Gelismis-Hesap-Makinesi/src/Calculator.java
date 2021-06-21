import java.util.Scanner;

public class Calculator {

	static Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {
		int select;
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";

        do {
            System.out.println(menu);
            System.out.print("L�tfen bir i�lem se�iniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

	}
	
    static void plus() {
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". say� :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonu� : " + result);
    }

    static void minus() {
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". say� :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void divided() {
        System.out.print("Ka� adet say� gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". say� :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("B�leni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonu� : " + result);
    }

    static void power() {
        System.out.print("Taban de�eri giriniz :");
        int base = scan.nextInt();
        System.out.print("�s de�eri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonu� : " + result);
    }

    static void factorial() {
        System.out.print("Say� giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonu� : " + result);
    }
    
    static void mod() {
    	System.out.println("Say�1 % Say�2 i�in");
    	System.out.print("1. Say�y� giriniz :");
        int n = scan.nextInt();
        System.out.print("2. Say�y� giriniz :");
        int m = scan.nextInt();
        
        System.out.println("Sonu� : " + n%m);
    }
    
    static void rectangle() {
    	System.out.print("Dikd�rtgenin 1. Kenar� :");
        int a = scan.nextInt();
        System.out.print("Dikd�rtgenin 2. Kenar� :");
        int b = scan.nextInt();
        
        System.out.println("Alan : " + (a*b));
        System.out.println("�evre : " + 2*(a+b));
    }


}
