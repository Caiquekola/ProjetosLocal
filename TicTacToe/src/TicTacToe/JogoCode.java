package TicTacToe;

public class JogoCode {

    public JogoCode(){
       comecarJogo(); 
    }
    
    private static int velha[][] = new int[3][3];
    private static int vez = 1;
    private static int jogadas = 0;
    private static int pontuacaoO = 0;
    private static int pontuacaoX = 0;
    private static boolean fimdejogo = false;
    private static String vezC = "X";
    private static String localGanho;

    public static void comecarJogo() {
        int numerador = -9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = numerador;
                numerador++;
            }
        }
    }

    public boolean jogada(int linha, int coluna) {
        while (!(jogadas > 2 & teste())) {
            if (vez == 1) {
                velha[linha][coluna] = 1;
                vez = 0;
                jogadas++;
                

            } else {
                velha[linha][coluna] = 0;
                vez = 1;
                jogadas++;
            }
        }
        return true;

    }

    public boolean teste() {
        //Linha
        int linha = 0;
        int coluna = 0;
        for (linha = 0; linha < 3; linha++) {
            if (velha[linha][coluna] == velha[linha][coluna + 1] & velha[linha][coluna] == velha[linha][coluna + 2]) {
                fimdejogo = true;
                localGanho = "L" + linha;
            }
        }
        //Coluna
        linha = 0;
        for (coluna = 0; coluna < 3; coluna++) {
            if (velha[linha + 1][coluna] == velha[linha][coluna] & velha[linha][coluna] == velha[linha + 2][coluna]) {
                fimdejogo = true;
                localGanho = "C" + coluna;
            }
        }
        //Diagonal Principal e Secundária
        if (velha[0][0] == velha[1][1] & velha[2][2] == velha[0][0]) {
            fimdejogo = true;
            localGanho = "DS";
        } else if (velha[0][2] == velha[1][2] & velha[0][2] == velha[2][0]) {
            fimdejogo = true;
            localGanho = "DS";
        }

        if (jogadas == 9) {
            fimdejogo = true;
            localGanho = "E";
        }
        return fimdejogo;
    }

    public int[][] getVelha() {
        return velha;
    }

    public void setVelha(int[][] velha) {
        this.velha = velha;
    }

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }

    public int getPontuacaoO() {
        return pontuacaoO;
    }

    public void setPontuacaoO(int pontuacaoO) {
        this.pontuacaoO = pontuacaoO;
    }

    public int getPontuacaoX() {
        return pontuacaoX;
    }

    public void setPontuacaoX(int pontuacaoX) {
        this.pontuacaoX = pontuacaoX;
    }

    public boolean isFimdejogo() {
        return fimdejogo;
    }

    public void setFimdejogo(boolean fimdejogo) {
        this.fimdejogo = fimdejogo;
    }

    public String getVezC() {
        return vezC;
    }

    public void setVezC(String vezC) {
        this.vezC = vezC;
    }

    public String getLocalGanho() {
        return localGanho;
    }

    public void setLocalGanho(String localGanho) {
        this.localGanho = localGanho;
    }

    
}
