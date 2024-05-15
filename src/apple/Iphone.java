package apple;
import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical,NavegadorInternet, AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando pelo Iphone");
    }
    public void atender(){
        System.out.println("Atendendo pelo Iphone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de Voz ativado pelo Iphone");
    }
    public void tocar(){
        System.out.println("Tocando musica no Iphone");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica no Iphone");
    }
    public void pausar(){
        System.out.println("Musica pausada no Iphone");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo uma aba no Iphone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo pagina no Iphone");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina do Iphone");
    }
}
