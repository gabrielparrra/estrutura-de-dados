import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("----- LABORATÓRIO DE COLETA DE SANGUE -----");
            System.out.println("1. Solicitar nova senha");
            System.out.println("2. Excluir uma senha");
            System.out.println("3. Listar todas as senhas");
            System.out.println("4. Visualizar próximo a ser atendido");
            System.out.println("5. Chamar próximo a ser atendido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de senha (C para Comum, P para Prioridade): ");
                    String tipoSenha = scanner.next();
                    fila.adicionarSenha(tipoSenha);
                    System.out.println("Senha adicionada com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o número da senha a ser excluída: ");
                    int numeroSenha = scanner.nextInt();
                    fila.excluirSenha(numeroSenha);
                    System.out.println("Senha excluída com sucesso!");
                    break;
                case 3:
                    fila.listarSenhas();
                    break;
                case 4:
                    System.out.println("Próximo a ser atendido: " + fila.proximoAtendimento());
                    break;
                case 5:
                    String senhaChamada = fila.chamarProximoAtendimento();
                    if (senhaChamada != null) {
                        System.out.println("Senha chamada: " + senhaChamada);
                    } else {
                        System.out.println("Não há senhas para serem chamadas.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}


