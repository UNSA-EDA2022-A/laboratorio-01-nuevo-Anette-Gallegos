package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int aux = 0, decimal = 0, dig, k = 0, k2 = 0, exp = 0;
	     aux = a;
         while (aux != 0) {
                    dig = aux % 10;
                    if (dig != 0 && dig != 1) {
                    	return "El numero proporcionado no esta en base Gabriel.";
                    }else if(dig==2){
                    	k++;
                    	if(k>1){
                    		return "El numero proporcionado no esta en base Gabriel.";
                    	}
                    }
                    aux = aux / 10;
          }

	     aux = a;
         while (aux != 0) {
                   dig = aux % 10;                  
                   if (exp == 0 && dig != 0) {
   					k2++;
                   }
                   if (exp == 1 && dig == 2) {
   					k2++;
                   }
                   decimal = decimal + (dig * (int) Math.pow(2, exp)-1);
                   exp++;
                   aux = aux / 10;      
         }
         if (k2>=2) {
        	 return "El numero proporcionado no esta en base Gabriel.";
		}
		return String.valueOf(decimal);
	}
}
