public class Lista {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();
        
        System.out.println("Tamanho da Lista = "+lista.getTamanho());
        
        
        lista.adiciona("Enzo");
        lista.adiciona("Leticia");
        lista.adiciona("Gabriel");
        lista.adiciona("Fernando");
        lista.adiciona("Jorge");
        
        System.out.println(lista);
        System.out.println("Tamanho da Lista = "+lista.getTamanho());
        System.out.println("Inicio da Lista = "+lista.getInicio().getElemento());
        System.out.println("Fim da Lista = "+lista.getFim().getElemento());


        lista.remover("Jorge");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = "+lista.getTamanho());
        System.out.println("Inicio da Lista = "+lista.getInicio().getElemento());
        System.out.println("Fim da Lista = "+lista.getFim().getElemento());

        
    }
}
