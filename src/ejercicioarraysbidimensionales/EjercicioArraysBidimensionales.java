package ejercicioarraysbidimensionales;

import java.util.Scanner;

public class EjercicioArraysBidimensionales {

    public static void main(String[] args) {
        /**
         * En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos.
         * Cada fila corresponde a las notas de cada alumno.
         * 
         * Se necesita un programa que permita a un profesor cargar en las 3 primeras
         * posiciones de cada fila las notas del alumno y que en un vector diferente se calculen los promedios.
         */
        
        //Así se declara un array bidimensional (Doble corchete y la instanciación de la variable, primero las filas y luego columnas
        double notas[][] = new double[4][3];
        
        //Declaramos un segundo vector o array para calcular los promedios
        double promedios [] = new double[4];
        
        //Cargamos las notas por teclado
        Scanner teclado = new Scanner(System.in);
        
        //fila = f
        //columna = c
        
        //Primer for para recorrer las filas
        for (int f = 0; f < notas.length; f++) {
            //Pedimos por teclado las notas del alumno. Se pone en el primer for para que no lo pida cada vez.
            System.out.println("Ingrese las notas del alumno: " + (f+1)); //f+1 para que no aparezca alumno 0 y sea alumno 1
            
            //Segundo for anidado para recorrer las columnas
            for (int c = 0; c < notas[0].length; c++) {
                //Almacenamos en la variable notas las [f] y [c] introducidas por teclado.
                notas[f][c] = teclado.nextDouble(); 
            }
        }
        
        //Calculamos la nota media de cada alumno
        
        //Declaramos las variables
        double total;
        //Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir con sus índices
        
        for (int f = 0; f < notas.length; f++) {
            total = 0; //Inicializamos la variable a 0 para cada recorrido del for, si no iría sumando en cada fila.
            for (int c = 0; c < notas[0].length; c++) {
                total = total + notas[f][c];  
            }
            promedios[f] = total / notas[0].length; //Se indica así para saber el tamaño de las columnas aunque también se puede poner total / 3
        }
        
        System.out.println("------------------NOTA MEDIA ---------------");
        //Mostrar notas y promedio
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Las notas del alumno Nº " + (f+1) + " son: "); //f+1 para que no aparezca alumno 0 y sea alumno 1
            for (int c = 0; c < notas[0].length; c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("La nota media fue de: " + promedios[f]);  //El vector promedio es igual de largo que la matriz que incluye el total de alumnos
            System.out.println("---------------------------------");
        }






        
        
    }
    
}
