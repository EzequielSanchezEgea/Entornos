
package es.iessoterohernandez.daw.endes;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Introduce un número ");
    	
    	final int NUMERO= sc.nextInt();
    	
    	
        int[] secuencia = Fibonacci.fibonacci(NUMERO);

        System.out.println("F(" + NUMERO + ") = " + Arrays.toString(secuencia));
 
        sc.close();

    }

}