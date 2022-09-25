package rekki_academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giai Phuong Trinh Bac Nhat");
        System.out.println(" Co bieu thuc la 'a * x + b = c',vui long nhap so  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a : ");
        double a = scanner.nextDouble();
        System.out.println(" Nhap so b :");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c :");
        double c = scanner.nextDouble();
        if(a!=0) {
            double x = (c - b) / a;
            System.out.println("phuong trinh co nghiem duy nhat x = " + x);
        }else {
                if(b==c){
                    System.out.println("phuong trinh cos vo so nghiem x !");
                }else { //(b#c)
                    System.out.println("phuong trinh vo nghiem !");
                }
            }

    }
}