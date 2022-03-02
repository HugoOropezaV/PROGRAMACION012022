/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Matrices {
    public static void ShowMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
                for (int j = 0; j < matrix.length; j ++){
                    System.out.print(matrix[i][j]);
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
    }
    public static void ShowMatrix(char[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
                for (int j = 0; j < matrix.length; j ++){
                    if(matrix[i][j] == 'X' || matrix[i][j] == 'O'  ){
                        System.out.print(matrix[i][j]);
                    }else{
                        System.out.print("(" + i + ", " + j + ")");
                    }
                    
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
    }
    public int AddFila(int[][] matrix, int fila){
        int Sum = 0;
        for (int j = 0; j < matrix.length; j ++){
                    Sum += matrix[fila][j];
                    
                }
        return Sum;
    } 
    
    public int AddColumn(int[][] matrix, int column){
        int Sum = 0;
        for (int j = 0; j < matrix.length; j ++){
                    Sum += matrix[j][column];
                    
                }
        return Sum;
    }
    
    public int AddDiagonalP(int[][] matrix){
        int Sum = 0;
        for (int j = 0; j < matrix.length; j ++){
            for (int i = 0; i < matrix.length; i ++){
                if (i == j){
                    Sum += matrix[j][i];
                }
                    
                }
        
        }
        return Sum;
    }
    
    
    public int AddDiagonalI(int[][] matrix){
        int Sum = 0;
        for (int j = 0; j < matrix.length; j ++){
            for (int i = 0; i < matrix.length; i ++){
                if (i + j == matrix.length - 1){
                    Sum += matrix[j][i];
                }
                    
                }
        
            }
        return Sum;
    }
    
    public int Medium(int[][] matrix){
        int Sum = 0;
        for (int j = 0; j < matrix.length; j ++){
            for (int i = 0; i < matrix.length; i ++){
                
                Sum += matrix[j][i];  
                }
            }
        int Medium = Sum / (matrix.length * matrix.length);
        return Medium;
    }
    
            
    public String MyMatrix(){
        int index = Integer.parseInt(JOptionPane.showInputDialog("inserte el largo del lado de su matriz"));
        int[][] Matrix = new int[index][index];
        int x = 0;
        int y = 0;
        while( x == 0){
            String ToDo = JOptionPane.showInputDialog("¿Qué desea hacer?" + "\n" + "Llenar su matriz: 'llenar'" 
            + "\n" + "sumar una fila: 'sumar fila'"
            + "\n" + "sumar una columna: 'sumar columna'"
            + "\n" + "sumar la diagonal principal: 'sumar diagonal principal'"
            + "\n" + "sacar la media de su matriz: 'media'"
            + "\n" + "salir: 'salir'");
            ToDo = ToDo.toLowerCase();

            if (ToDo.equals("salir")){
                return "fin";
            }
          
            while( y == 0){
                int number = 1;
                if (ToDo.equals("llenar")){
                    for(int i = 0; i < Matrix.length; i ++){
                        for (int j = 0; j < Matrix.length; j ++){
                            Matrix[i][j] = number;
                            number++;
                        }
                    }
                    ShowMatrix(Matrix);
                    y++;
                }else{
                    ToDo = JOptionPane.showInputDialog("primero debe llenar su matriz: llenar");
                    
                }
            }
            


            if (ToDo.equals("sumar fila")){
                int fila = Integer.parseInt(JOptionPane.showInputDialog("¿Qué fila quiere sumar?")) - 1;
                System.out.println("La fila " + (fila + 1) + " suma: " + AddFila(Matrix, fila));
            }


            if (ToDo.equals("sumar columna")){
                int column = Integer.parseInt(JOptionPane.showInputDialog("¿Qué columna quiere sumar?")) - 1;
                System.out.println("La columna " + (column + 1) + " suma: " + AddColumn(Matrix, column));
            }


            if (ToDo.equals("sumar diagonal principal")){

                System.out.println("La diagonal principal suma: " + AddDiagonalP(Matrix));
            }


            if (ToDo.equals("sumar diagonal inversa")){

                System.out.println("La diagonal inversa suma: " + AddDiagonalI(Matrix));
            }



            if (ToDo.equals("media")){

                System.out.println("La media es: " + Medium(Matrix));
            }
        }
        return "fallé";
        
    }
    public void MagicCubeI(){
        int index = Integer.parseInt(JOptionPane.showInputDialog("inserte el largo del lado de su cubo mágico(impar)"));
        while(index % 2 == 0){
            index = Integer.parseInt(JOptionPane.showInputDialog("inserte el largo del lado de su cubo mágico (IMPAR)"));
        }
        
        int[][] matrix = new int[index][index];
        int finicio = index - index/2;
        int cinicio = index/2;
        if (index == 1){
            finicio = 0;
            cinicio = 0;
        }
        
        
        for (int i = 1; i <= (index *index); i++ ){
            if (matrix[finicio][cinicio] > 0){
                finicio++;
                cinicio--;
                if (cinicio  < 0){
                    cinicio = index - 1;
                }
            }
            if (finicio == index){
                finicio = 0;
            }
            if(cinicio == index){
                cinicio = 0;
            }
            matrix[finicio][cinicio] = i;
            finicio++;
            cinicio++;
            
            if (finicio == index){
                finicio = 0;
            }
            if(cinicio == index){
                cinicio = 0;
            }
            
        }
        ShowMatrix(matrix);
        
    }
    
    public String TicTacToe(){
        char[][] board = new char[3][3];
        int col = 0;
        int fila = 0;
        int i = 0;
        int player = 0;
        int counter = 0;
        int k1 = 0;
        String surrender = "no";
        for( int c = 0; c < board.length; c++){
            for( int f = 0; f < board.length; f++){
                board[f][c] = (char)k1;
                k1++;
            }
        }
        ShowMatrix(board);
        while (i < board.length * board.length ){
            if (i % 2 == 0){
                player = 1;
            }else{
                player = 2;
            }
            
            System.out.println("ingrese las coordenadas jugador " + player);
            //input coordenadas
            
            fila = Integer.parseInt(JOptionPane.showInputDialog("fila"));
            col = Integer.parseInt(JOptionPane.showInputDialog("columna"));
            
            if (col < 0 || col >= board.length || fila < 0 || fila >= board.length){//comprueba que no se salgan del tablero
                continue;
            }
            if(board[fila][col] == 'X' || board[fila][col] == 'O'  ){//comprueba que sea una casilla vacia
                continue;
            }
            if(player == 1){            //coloca la marca correspondiente
                board[fila][col] = 'O';
            }else{
                board[fila][col] = 'X';
            }
            
            ShowMatrix(board);//muestra el tablero
            i++;
            for (int j = 1; j < board.length; j ++){ //revisa diagonal inversa 
                for (int k = board.length - 2; k >= 0 ; k --){
                    if (k + j == board.length - 1){
                        if (board[j][k] == board[j - 1][ k +1]){
                            counter++;
                        }else{
                            counter = 0;
                            break;
                        }
                    }

                }
        
            }
            if (counter == board.length - 1){
                return("¡¡Ganaste jugador " + player + "!!");
                
            }
            for(int j = 1; j < board.length; j++){//revisa diagonal principal
                for(int k = 1; k < board.length; k++){
                    if (j == k){
                        if (board[j][k] == board [j - 1][k - 1]){
                            counter++;
                        }else{
                            counter = 0;
                            break;
                        }
                    }
                    
                } 
                
            }
            if (counter == board.length - 1){
                return("¡¡Ganaste jugador " + player + "!!");
            }
            for(int j = 0; j < board.length; j++){//revisa columnas
                for(int k = 1; k < board.length; k++){
                    if (board[k][j] == board [k - 1][j]){
                        counter++;
                    }else{
                        counter = 0;
                        break;
                    }
                }
                if (counter == board.length - 1){
                    break;
                    
                }
                
            }
            if (counter == board.length - 1){
                return("¡¡Ganaste jugador " + player + "!!");
            }
            for(int j = 0; j < board.length; j++){//revisa filas
                for(int k = 1; k < board.length; k++){
                    if (board[j][k] == board [j][k - 1]){
                        counter++;
                    }else{
                        counter = 0;
                        break;
                    }
                    
                }
                if (counter == board.length - 1){
                    break;
                    
                }
                
            }
            if (counter == board.length - 1){
                return("¡¡Ganaste jugador " + player + "!!");
            }
            
            
        }
        
        return "empate";
        
        
    }
}
