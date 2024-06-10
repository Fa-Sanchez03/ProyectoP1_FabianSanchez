/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectop1;

/**
 *
 * @author fasan
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ProyectoP1 {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int limite) {
        int factorial = 1;
        for (int i = 1; i <=limite;i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear arraylist de todas las personas que hagan el examen
        ArrayList<Estudiante> estudiantes = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("-------EXAMEN DE MATEMATICAS-------");
        //Crear objeto de matematicas
        Matematica matematicas = new Matematica();
        //Hacer vueltas hasta que uno ya no desee hacer examenes
        while (true) {
            
            System.out.println("Ingrese su nombre: ");
            String nombre = entrada.next();
            System.out.println("Ingrese su apellido: ");
            String apellido = entrada.next();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            while (edad < 16) {
                System.out.println("Ingrese una edad valida: ");
                edad = entrada.nextInt();
            }
            System.out.println("\n---A continuacion realizara un examen de 8 preguntas---");
            System.out.println("\n-Temas Includios-\n*Sumatoria\nDeterminante de Matriz\nFactoriales");
            System.out.println("-Buena Suerte!-\n\n");
            //Cantidad de correctas actuales
            int correctas = 0;
            //Iterar por las 8 preguntas
            for (int i = 1; i <=8;i++) {
                System.out.println("\nPreguna "+i);
                System.out.println("\n");
                //Generar un numero entre 0 a 2 random, para determinar que problema debe realizar el test taker
                int problema = random.nextInt(3);
                switch(problema) {
                    //Caso 0 sera la determinante
                    case 0 -> {
                        //Usar metodos de crear y imprimir matriz
                        int[][] matriz = matematicas.crearMatriz();
                        matematicas.printMatriz(matriz);
                        System.out.println("Cual es la determinante de la matriz dada? ");
                        int respuestaUsuario = entrada.nextInt();
                        if (respuestaUsuario == matematicas.determinanteMatriz(matriz)) {
                            System.out.println("Respondio correctamente!");
                            correctas++;
                        }
                        else {
                            System.out.println("Respondio incorrectamente");
                            System.out.println("La respuesta correcta es: "+matematicas.determinanteMatriz(matriz));
                        }
                        break;
                    }
                    //Caso 1 seria la sumatoria
                    case 1-> {
                        //Crear el limite 
                        int limite = random.nextInt(100)+1;
                        System.out.println("Cual es la sumatoria de los numeros hasta el "+limite+"?");
                        int respuesta = entrada.nextInt();
                        if (respuesta==matematicas.sumatoria(limite)) {
                            System.out.println("Respondio correctamente!");
                            correctas++;
                        }
                        else {
                            System.out.println("Respondio incorrectamente");
                            System.out.println("La respuesta correcta es: "+matematicas.sumatoria(limite));
                            break;
                        }
                    }
                    //Caso 2 seria el factorial
                    case 2-> {
                        //Crear limite con random hasta el 11
                        int limite = random.nextInt(11)+1;
                        System.out.println("Cual es el factoria de " + limite+"?");
                        int respuesta = entrada.nextInt();
                        //Verificar si la respuesta del usuario es correcto
                        if (respuesta==factorial(limite)) {
                            System.out.println("Respondio correctamente!");
                            correctas++;
                        }
                        else {
                            System.out.println("Respondio incorrectamente");
                            System.out.println("La respuesta correcta fue: "+factorial(limite));
                        }
                        break;
                    }
                }
               
            }
             //Calcular cuanto saco el usuario
            double nota = (double) correctas/8;
            nota = nota*100;
            String estadoNota = "";
            //Para pasar se necesita almenos 60 puntos
            //Asignar estado segun la nota adquirida
            if (nota >= (double) 60) {
                estadoNota = "APROBADO";
            }
            else {
                estadoNota = "REPROBADO";
            }
            System.out.println("Su nota fue: "+nota+"\nSu estado de examen: "+estadoNota);
            //Crear objeto de estudiante con todos los datos
            Estudiante estudiante = new Estudiante(nombre, apellido, edad, nota, estadoNota);
            estudiantes.add(estudiante);
            //Ver si otro estudiante quiere hacer el examen
            System.out.println("Desea otro estudiante hacer el examen? [s,n]");
            char res = entrada.next().charAt(0);
            if (Character.toLowerCase(res)!='s'&&Character.toLowerCase(res)!='n') {
                System.out.println("Ingrese una respuesta valida: ");
                res = entrada.next().charAt(0);
            }
            if (Character.toLowerCase(res)=='n') {
                break;
            }
        }
        //Listar todos los estudiantes
        for (int i = 0; i < estudiantes.size();i++) {
            System.out.println(estudiantes.get(i));  
            System.out.println("");
        }
    }
    
}
