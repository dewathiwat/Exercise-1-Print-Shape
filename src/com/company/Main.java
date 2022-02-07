package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d;
        int b;
        do {
            System.out.print("โปรดกรอก ตัวเลข Diamond : ");
            d = input.nextInt();
            System.out.print("โปรดกรอก ตัวเลข Butterfly : ");
            b = input.nextInt();
            if(d%2 == 0 || b%2 == 1){
                System.out.println("กรุณาลองอีกครั้ง");
            }
        }
        while (d%2 == 0 || b%2 == 1);
        System.out.println("Diamond");
        printDiamond d3 = new printDiamond(d);
        d3.printDiamond();
        System.out.println("Butterfly");
        printButterfly b4 = new printButterfly(b);
        b4.printButterfly();


    }
}
