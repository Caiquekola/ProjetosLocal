/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Interface {
    
    static Scanner scan = new Scanner(System.in);
    static char posicao,outraPartida;
    static char vetor[][] = new char[3][3];
    static int coluna,linha,numerador=1,jogadas=0,contador=1;
    static boolean fimdejogo = false;
    static char vencedor;
    static String onde;
    
    public static void comecarJogo(){
        
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                vetor[linha][coluna] = Character.forDigit((numerador) , 10);
                numerador++;
            }
        }
        
        
        jogo();
    }
    public static void jogo(){
        while(!fimdejogo){
            desenho();
            jogada();
            
        }
        desenho();
        outraPartida();
    }
    public static void teste(){
        
        coluna=0;
        //LINHAS
        for (int linha = 0; linha < 3; linha++) {
            if(vetor[linha][coluna]==vetor[linha][coluna+1]&vetor[linha][coluna]==vetor[linha][coluna+2]){
                fimdejogo=true;
                vencedor = vetor[linha][coluna];
                onde = ("linha "+(linha+1));
            }
        }
        //COLUNAS
        linha=0;
        for (int coluna = 0; coluna < 3; coluna++) {
            if(vetor[linha][coluna]==vetor[linha+1][coluna]&vetor[linha][coluna]==vetor[linha+2][coluna]){
                fimdejogo=true;
                vencedor = vetor[linha][coluna];
                onde = ("coluna "+(coluna+1));
            }
            
        }
        //Diagonal principal
        linha=0; coluna=0;
        if(vetor[linha][coluna]==vetor[linha+1][coluna+1]&vetor[linha][coluna]==vetor[linha+2][coluna+2]){
            fimdejogo=true;
            vencedor = vetor[linha][coluna];
            onde = ("diagonal principal");
        }
        //Diagonal secundária
        linha=0;coluna=2;
        if(vetor[linha][coluna]==vetor[linha+1][coluna-1]&vetor[linha][coluna]==vetor[linha+2][coluna-2]){
            fimdejogo=true;
            vencedor = vetor[linha][coluna];
            onde = ("diagonal secundaria");
        }
        
        if(fimdejogo){
            System.out.println("'"+vencedor+"' eh o campeao!");
            System.out.println("Ganhou na "+onde+"!\n");
        }
    }
    
    public static void desenho(){
        
            System.out.println("  TicTacToe\n");
            coluna=0;
            for (int i = 0; i < 3; i++) {
                System.out.println("  "+vetor[i][coluna]+" | "+vetor[i][coluna+1]+" | "+vetor[i][coluna+2]);
                System.out.println("  ----------");
                
            
            
        }
        
    }
    public static void jogada(){
        if(jogadas%2==0){
                    System.out.print("  \n  Onde X: ");
                    
        }else{
                    System.out.print("  \n  Onde O: ");
        }
        posicao = scan.next().charAt(0);
        contador=1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(posicao==Character.forDigit(contador,10)){
                    if(jogadas%2==0){vetor[i][j] = 'X';}
                    else{vetor[i][j] = 'O';}
                    
                    
                }
                contador++;
            }
            
        }
        System.out.println("\n\n\n\n\n");
        if(jogadas>2){
            teste();
            
        }
        jogadas++;
        
        
    }
    public static void outraPartida(){
        System.out.println("Deseja jogar outra partida?(y/n)");
        outraPartida = scan.next().charAt(0);
        if(outraPartida=='y'|outraPartida=='Y'){
            System.out.println("\n\n\n\n\n");
            fimdejogo =false;
            coluna=0;linha=0;numerador=1;jogadas=0;contador=1;
            comecarJogo();
            
        }else{
            System.out.println("\n\n\n\n\n");
            System.out.println("'"+vencedor+"' foi o campeao!");
            System.out.println("Ganhando na "+onde+"!");
            desenho();
        }
    }
    
    
    

}
