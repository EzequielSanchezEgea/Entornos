package es.iessoterohernandez.daw.endes;

public class Fibonacci {

	public static int[] fibonacci(int numero) {

        int[] secuencia = new int[numero];
        secuencia[0] = 0;

        if (numero > 1) secuencia[1] = 1;

        for (int i = 2; i < numero; i++) {
        	secuencia[i] = secuencia[i - 1] + secuencia[i - 2];
        }

        return secuencia;

    }

}