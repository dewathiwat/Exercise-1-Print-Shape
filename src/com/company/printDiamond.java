package com.company;

public class printDiamond {

    private  int i=0;
    printDiamond(int i){
        this.i = i ;

    }
    public  void printDiamond() {
        int space = i/2;
        for (int k = 1; k <= i; k++) {
            if (k % 2 == 1) {
                for (int c = 1; c <= space; c++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= k; c++) {
                    System.out.print("+");
                }
                System.out.println(" ");
                space--;
            }

        }
        space = 1;
        if(i!=1) {
            for (int k = i - 1; k > 0; k--) {
                if (k % 2 == 1) {
                    for (int c = 0; c < space; c++) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= k; c++) {
                        System.out.print("+");
                    }
                    System.out.println(" ");
                    space++;
                }

            }
        }else {
            System.out.println("1");
        }
    }

    }

