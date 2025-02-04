package ejercicioarraysbidimensionales;

import java.util.Scanner;

public class OperacionesMatrices {
    public static void main(String[] args) {
        
        /**
         * Dadas dos matrices de enteros positivos A y B de 3x3, escribir
         * un programa que permita obtener la tercera matriz resultado de enteros, también de 3x3
         * que contega para cada una sus posiciones el resultado de realizar las operaciones que se 
         * indican a continuación.
         */
        
        /**
         * Para cada posición (fila, columna)
         * 
         * - Si el valor de la matriz A y el valor de la Matriz B, para esa posición son PARES, 
         * se realizará la SUMA de esos valores y se almacenará en la misma posición de la matriz resultado
         * 
         */
        
        //Declaramos la Matriz A
        int matrizA[][] = new int[3][3];
        
        //Declaramos la Matriz B
        int matrizB[][] = new int [3][3];
        
        //Declaramos la Matriz Resultados
        int matrizResultado[][] = new int [3][3];
        
        int sumaTotal = 0;
        
        //Solicitamos los números de la matriz por teclado
        Scanner teclado = new Scanner(System.in);
        
        //fila = f
        //columna = c
        
        //Primer for para recorrer las filas de la Matriz A
        System.out.println("Matriz A:");
        for (int f = 0; f < matrizA.length; f++) {
            //Pedimos que ingrese los números de la primera fila
            System.out.println("Ingrese los datos de la fila: " + (f+1) + " de la matriz A");
            
            //Anidamos un segundo for para las columnas
            for (int c = 0; c < matrizA[0].length; c++) {
                //Almacenamos en la variable matrizA las filas y columnas solicitadas por teclado
                matrizA[f][c] = teclado.nextInt(); 
            }            
        }
        
        //Segundo for para recorrer las filas de la Matriz B
        System.out.println("Matriz B");
        for (int f = 0; f < matrizB.length; f++) {
            //Pedimos que ingrese los números de la primera fila
            System.out.println("Ingrese los datos de la fila: " + (f+1) + " de la matriz B");
            
            //Anidamos un segundo for para las columnas
            for (int c = 0; c < matrizB[0].length; c++) {
                //Almacenamos en la variable matrizB las filas y columnas solicitadas por teclado
                matrizB[f][c] = teclado.nextInt();                
            }            
        }
        
        //Calculamos la suma de las 2 matrices en cada posición.
        
                //- Si el valor de la matriz A y el valor de la Matriz B, para esa posición son PARES, 
                //  se realizará la SUMA de esos valores y se almacenará en la misma posición de la matriz resultado
        
        System.out.println("Matriz Resultado");
        for (int f = 0; f < matrizA.length; f++) {
                       
            //Anidamos un segundo for para las columnas
            for (int c = 0; c < matrizB[0].length; c++) {
                    
                if ((matrizA[f][c] % 2 == 0) && (matrizB[f][c] % 2 == 0)) {
                    //Si es par, se suma la matrizA y matrizB
                    matrizResultado[f][c] = matrizA[f][c]+ matrizB[f][c];

                } else if ((matrizA[f][c] % 2 != 0) && (matrizB[f][c] % 2 != 0)) {
                    //Si es impar, se divide la matrizA entre matrizB. Comprobamos primero que no 
                    //se puede dividir por 0.
                    if (matrizB[f][c] == 0) {
                        System.out.println("No se puede dividir por 0");
                        matrizResultado[f][c] = 0;
                
                } else {
                    //División de números enteros)
                        
                    matrizResultado[f][c] = matrizA[f][c] / matrizB[f][c];
                    }
                }
                //Acumulamos el resultado de la matriz resultado
                sumaTotal += matrizResultado[f][c];
            }
        }       
        
                
        //Formateamos las matrices con 2 dígitos
                StringBuilder matrizAEntera = new StringBuilder ("Matriz A:\n");
                StringBuilder matrizBEntera = new StringBuilder ("Matriz B:\n");
                StringBuilder matrizResEntera = new StringBuilder ("Matriz Resultado:\n");
                
        //Construimos la cadena de la matriz A
        for (int f = 0; f < matrizA.length; f++) {
            for (int c = 0; c < matrizA.length; c++) {
                matrizAEntera.append(String.format("%02d ", matrizA[f][c]));                
            }
            matrizAEntera.append("\n");            
        }
        
        //Construimos la cadena de la matriz B
        for (int f = 0; f < matrizB.length; f++) {
            for (int c = 0; c < matrizB.length; c++) {
                matrizBEntera.append(String.format("%02d ", matrizB[f][c]));                
            }
            matrizBEntera.append("\n");            
        }
        
        //Construimos la cadena de la matriz Resultado
        for (int f = 0; f < matrizResultado.length; f++) {
            for (int c = 0; c < matrizResultado.length; c++) {
                matrizResEntera.append(String.format("%02d ", matrizResultado[f][c]));                
            }
            matrizResEntera.append("\n");            
        }
        
        //Imprimimos todo por pantalla
        System.out.println("\n=== RESULTADOS === \n");
        System.out.println(matrizAEntera.toString());
        System.out.println(matrizBEntera.toString());
        System.out.println(matrizResEntera.toString());
        System.out.println("Suma total de los valores de la matriz resultado: " + sumaTotal);
    }
}
