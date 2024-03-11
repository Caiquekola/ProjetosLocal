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
        // TODO code application logic here
//        char letra = 'o';
//        int nASCII = (int) letra;
//        System.out.println(Integer.toBinaryString(nASCII));
//        Transmissor t = new Transmissor("o");
//        boolean bits[] = t.streamCaracter('o');
//        for (int i = 0; i < bits.length; i++) {
//            if(bits[i]==true){
//                System.out.println(1);
//            }else{
//                System.out.println(0);
//            }
//            
//        }
        Transmissor teste = new Transmissor("o");
        teste.wait(0, 0);
        for(int i = 0; i < teste.mensagem.length();i++){
            boolean bits[] = streamCaracter(this.mensagem.charAt(i));
            
            /*-------AQUI você deve adicionar os bits do códico CRC para contornar os problemas de ruidos
                        você pode modificar o método anterior também
                boolean bitsCRC[] = dadoBitsCRC(bits);

        }
    }
    
}
