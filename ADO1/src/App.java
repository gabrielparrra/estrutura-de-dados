import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);     
        Notas notas = new Notas(); 
        int menu = 0;
        do {
            System.out.printf(" 1. Adicionar nota\n 2. Modificar nota\n 3. Excluir nota\n 4. Exibir notas\n 5. Pesquisar nota\n 0. Sair\n>> ");
            menu = ler.nextInt();

            if(menu==1){
                System.out.println("Digite a nota a ser inserida");
                double nota = ler.nextDouble();

                notas.adicionaNota(nota);
            }

            if(menu==2){
                System.out.println("Digite a posição que deseja alterar");
                int posicao = ler.nextInt();

                System.out.println("Digite a nova nota");
                double nota = ler.nextDouble();

                notas.modificarNotas(posicao, nota);
            }

            if(menu==3){
                System.out.println("Insira a posição da nota que deseja excluir");
                int posicao = ler.nextInt();
                notas.excluirNotas(posicao);
            }

            if(menu==4){
                notas.exibirNotas();
            }

            if(menu==5){
                System.out.println("Qual a posição você quer pesquisar?");
                int posicao = ler.nextInt();

                notas.pesquisaNota(posicao);
            }

        } while (menu != 0);
    }
}

