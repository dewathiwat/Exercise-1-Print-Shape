package com.company;

public class printButterfly {
        private int i;
    printButterfly(int i){
        this.i=i;
    }

    public void printButterfly(){
        for(int r = 1; r <= i-1 ; r++){
            for(int d = 1; d <= r; d++){
                System.out.print("+");
            }
            for(int s = 1; s <= 2 * (i - r)+1; s++){
                System.out.print(" ");
            }
            for(int d = r; d >= 1; d--){
                System.out.print("+");
            }
            System.out.println();
        }
        for(int j = 1;j<=i;j++){
            System.out.print("+");
        }
        System.out.print("-");
        for(int j = 1;j<=i;j++){
            System.out.print("+");
        }
        System.out.println();
        for(int r = i-1; r >= 1 ; r--){
            for(int d = 1; d <= r; d++){
                System.out.print("+");
            }
            for(int s = 1; s <= 2 * (i - r)+1; s++){
                System.out.print(" ");
            }
            for(int d = r; d >= 1; d--){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
