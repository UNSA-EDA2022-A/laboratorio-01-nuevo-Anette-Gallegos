package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		int conejo = 50, saltos = 0, aux=0;
		for (int i = 0; i < a.length; i++) {
			if (conejo>=(a[i+1]-a[i])){
				aux =  aux + (a[i+1]-a[i]);
				if (aux>=conejo){
					saltos++;
					i--;
					aux = 0;
				}
			}else {
				return -1;
			}
		}
		return (saltos+1);
	}
}
