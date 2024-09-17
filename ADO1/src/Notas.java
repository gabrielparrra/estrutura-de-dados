import java.util.*;
public class Notas {
    public String nome;
    public double notas[] = new double[3];
    public double media;
    public int tamanho;

    public void adicionaNota (double nota) throws Exception{
        aumentaCapacidade();
        notas[tamanho] = nota;
        tamanho++;
     }

     public void aumentaCapacidade(){
            if (tamanho == notas.length){
                double [] notasNovas = new double [this.notas.length + 1];

                    for (int i=0; i < notas.length; i++){
                        notasNovas[i] = notas[i];
                    }
                    this.notas = notasNovas;
            }       
        }

     public void modificarNotas(int posicao, double nota){
        notas[posicao-1] = nota;
     }

     public void excluirNotas(int posicao){
        notas[posicao-1] = 0;
     }
    
     public void exibirNotas(){
        for (int i=0; i<notas.length; i++){
            System.out.println(notas[i]);
        }
    }

    public void pesquisaNota(int posicao){
        System.out.println("A nota da posição que você pesquisou é: "+notas[posicao-1]);
    }

}
