package reprodutormusical;


public class Ipod implements ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando musica no Ipod");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica no Ipod");
    }
    public void pausar(){
        System.out.println("Musica pausada no Ipod");
    }
}
