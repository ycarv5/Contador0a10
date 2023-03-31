package ContadorParaGit;
import javax.swing.JOptionPane;
        
public class Contador0a9 {
    public static void main(String[] args){
        //declaração das variáveis:
        int i;     //variável que será utilizada no laço For
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao programa contador, este programa contará de 0 a 10");
        for (i=0; i<=10; i++){ //primeira parte é como é a váriavel e como ela começa, a segunda define o limite e a última é sobre como ela vai se comportar (crescente, decrescente, de 1 em 1,etc.)
        JOptionPane.showMessageDialog(null,i);
    }JOptionPane.showMessageDialog(null,"Este número está depois do laço: "+i); //fecha o laço de repetição "for" e apresenta uma mensasagem
    } //fecha o método
} //fecha a classe
