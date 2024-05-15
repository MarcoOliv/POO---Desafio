package aparelhotelefonico;

public class Telefone implements AparelhoTelefonico{
    public void ligar(){
        System.out.println("Ligando pelo telefone");
    }
    public void atender(){
        System.out.println("Atendendo pelo telefone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de Voz ativado pelo telefone");
    }
}