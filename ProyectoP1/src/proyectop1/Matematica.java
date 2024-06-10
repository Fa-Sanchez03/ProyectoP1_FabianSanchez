/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop1;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author fasan
 */
public class Matematica {
    //Clase solamente para hacer problemas de matematicas
    //Crear matriz de 3x3 llenado de numero randoms
    public int[][] crearMatriz() {
        Random random = new Random();
        int[][] matriz = new int[3][3];
        for (int i =0; i < 3;i++) {
            for (int j = 0; j < 3;j++) {
                matriz[i][j] = random.nextInt(15)+1;
            }
        }
        return matriz;
    }
    
    //Crear metodo para imprimir matriz 3x3
    public void printMatriz(int[][] matriz) {
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j<3;j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    //Metodo para un problema de matriz
    public int determinanteMatriz(int[][] matriz) {
        int determinante;
        //Sacar determinante
        determinante = matriz[0][0]*((matriz[1][1]*matriz[2][2])-(matriz[2][1]*matriz[1][2]));
        determinante = determinante - matriz[0][1]*((matriz[1][0]*matriz[2][2])-(matriz[2][0]*matriz[1][2]));
        determinante = determinante + matriz[0][2]*((matriz[1][0]*matriz[2][1])-(matriz[2][0]*matriz[1][1]));
        return determinante;
        
    }
    
    //Metodo para hacer problema de sumatoria
    public int sumatoria(int limite) {
        int sumatoria = 0;
        for (int i = 1; i <=limite;i++) {
            sumatoria = sumatoria+i;
        }
        return sumatoria;
    }
    
    
}
