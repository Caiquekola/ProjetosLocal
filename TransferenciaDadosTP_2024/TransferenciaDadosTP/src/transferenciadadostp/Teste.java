/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transferenciadadostp;

/**
 *
 * @author Caiqu
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transmissor t = new Transmissor("oi");
        Receptor receptor = new Receptor();
        t.enviaDado(receptor);
        System.out.println(receptor.getMensagem());
        
    }
    
}
