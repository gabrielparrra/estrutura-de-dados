class Fila {
    private String[] senhas;
    private int tamanho;
    private int inicio;
    private int fim;
    private int contadorPrioridade;

    public Fila() {
        this.senhas = new String[10];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
        this.contadorPrioridade = 0;
    }

    public void adicionarSenha(String tipoSenha) {
        if (tamanho == senhas.length) {
            System.out.println("A fila de senhas está cheia. Não é possível adicionar mais senhas.");
            return;
        }

        if (tipoSenha.equalsIgnoreCase("P")) {
            senhas[++fim] = "P" + (++contadorPrioridade);
        } else if (tipoSenha.equalsIgnoreCase("C")) {
            senhas[++fim] = "C" + (fim - contadorPrioridade + 1);
        } else {
            System.out.println("Tipo de senha inválido. Digite C para Comum ou P para Prioridade.");
            return;
        }

        tamanho++;
    }

    public void excluirSenha(int numeroSenha) {
        if (tamanho == 0) {
            System.out.println("A fila de senhas está vazia. Não é possível excluir senhas.");
            return;
        }

        int posicao = inicio;
        while (posicao <= fim && !senhas[posicao].substring(1).equals(String.valueOf(numeroSenha))) {
            posicao++;
        }

        if (posicao > fim) {
            System.out.println("Senha não encontrada na fila.");
            return;
        }

        for (int i = posicao; i < fim; i++) {
            senhas[i] = senhas[i + 1];
        }

        senhas[fim--] = null;
        tamanho--;
    }

    public void listarSenhas() {
        if (tamanho == 0) {
            System.out.println("A fila de senhas está vazia.");
            return;
        }

        System.out.println("----- LISTA DE SENHAS -----");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(senhas[i]);
        }
    }

    public String proximoAtendimento() {
        if (tamanho == 0) {
            return "Não há senhas para serem atendidas.";
        }

        return senhas[inicio];
    }

    public String chamarProximoAtendimento() {
        if (tamanho == 0) {
            return null;
        }

        String senhaChamada = senhas[inicio];
        for (int i = inicio; i < fim; i++) {
            senhas[i] = senhas[i + 1];
        }

        senhas[fim--] = null;
        tamanho--;

        if (senhaChamada.startsWith("P") && contadorPrioridade % 3 == 0) {
            adicionarSenha("C");
        }

        return senhaChamada;
    }
}