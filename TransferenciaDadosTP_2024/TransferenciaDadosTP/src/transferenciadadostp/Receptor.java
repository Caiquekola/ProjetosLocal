package transferenciadadostp;

public class Receptor {
    
    //mensagem recebida pelo transmissor
    private String mensagem;

    public Receptor() {
        //mensagem vazia no inicio da execução
        this.mensagem = "";
    }
    
    public String getMensagem() {
        return mensagem;
    }
    
    private boolean decodificarDado(boolean bits[]){
        int codigoAscii = 0;
        int expoente = bits.length-1;
        
        //converntendo os "bits" para valor inteiro para então encontrar o valor tabela ASCII
        for(int i = 0; i < bits.length;i++){
            if(bits[i]){
                codigoAscii += Math.pow(2, expoente);
            }
            expoente--;
        }
        
        //concatenando cada simbolo na mensagem original
        this.mensagem += (char)codigoAscii;
        
        //esse retorno precisa ser pensado... será que o dado sempre chega sem ruído???
        return true;
    }
    
    private void decodificarDadoCRC(boolean bits[],boolean polinomio[]){
        boolean novosBits[] = bits;
        for (int i = 0; i < bits.length-4; i++) {
            if(bits[i]==false){
                continue;
            }
            else{
                int k = 0;
                for (int j = i; j < i+5; j++) {
                    bits[j] = !(bits[j]==polinomio[k]);
                    k++;
                }
            }
        }
        for (int i = bits.length-4; i < bits.length; i++) {
            novosBits[i] = bits[i];
        }
        //implemente a decodificação Hemming aqui e encontre os 
        //erros e faça as devidas correções para ter a imagem correta
    }
    
    
    //recebe os dados do transmissor
    public boolean receberDadoBits(boolean bits[],boolean polinomio[]){
        
        //aqui você deve trocar o médodo decofificarDado para decoficarDadoCRC (implemente!!)
        decodificarDadoCRC(bits,polinomio);
        decodificarDado(bits);
        
        //será que sempre teremos sucesso nessa recepção
        return true;
    }
}
