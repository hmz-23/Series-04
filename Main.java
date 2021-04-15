package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N = 0;
        for(i = 1; i <= 5; i++){
            N = (N * 10) + i;
            {
                System.out.print(N + " ");
            }
        }
    }
}
