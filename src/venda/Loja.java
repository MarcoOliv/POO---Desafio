package venda;

import java.util.Scanner;

import aparelhotelefonico.Telefone;
import apple.Iphone;
import navegadorinternet.Computador;
import reprodutormusical.Ipod;

public class Loja {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler da entrada padrão (normalmente o teclado)

        //Definindo produtos da loja
        Iphone iphone1 = new Iphone();
        Computador gateway = new Computador();
        Telefone samsung = new Telefone();
        Ipod ipod1 = new Ipod();

        int opcao;

        do {
            // Menu para escolha de produto do cliente
            System.out.println("------------------------------------------------------");
            System.out.println("\t\tSeja bem-vindo(a) à MarkStore!\t\t");
            System.out.println("Aqui temos os produtos mais tecnológicos do mundo!");
            System.out.println("------------------------------------------------------");
            System.out.println("Esses são os produtos mais buscados no momento:");
            System.out.println("------------------------------------------------------");
            System.out.println("1 - Computador");
            System.out.println("2 - Telefone");
            System.out.println("3 - Ipod");
            System.out.println("4 - Iphone");
            System.out.println("0 - Sair");
            System.out.println("------------------------------------------------------");
            System.out.println("Por favor, informe o número do produto que deseja comprar: ");
            opcao = scanner.nextInt(); // Lê um número inteiro da entrada
            System.out.println("------------------------------------------------------");

            switch(opcao){
                case 1:
                    System.out.println("Atualmente possuímos o computador que está dominando o mercado tecnológico: ");
                    System.out.println("\tComputador Gateway 2000");
                    System.out.println("Computador perfeito para quem busca realizar navegações na Internet!");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\t\tValor: R$ 350,00");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Funções do Computador:");
                    System.out.println("\n1. Navegar na internet");
                    gateway.exibirPagina();
                    System.out.println("\n2. Atualizações de páginas web");
                    gateway.atualizarPagina();
                    System.out.println("\n3. Abrir quantas abas quiser");
                    gateway.adicionarNovaAba();
                    break;
                case 2:
                    System.out.println("Atualmente possuímos o melhor telefone existente: ");
                    System.out.println("\tSamsung SCH-100");
                    System.out.println("Aparelho perfeito para quem realiza diversas ligações no dia!");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\t\tValor: R$ 150,00");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Funções do Telefone:");
                    System.out.println("\n1. Atender chamadas: ");
                    samsung.atender();
                    System.out.println("\n2. Realizar chamadas");
                    samsung.ligar();
                    System.out.println("\n3. Iniciar correio de voz");
                    samsung.iniciarCorreioVoz();
                    break;
                case 3:
                    System.out.println("Gosta de escutar uma música durante um passeio? Apresentamos o:");
                    System.out.println("\tIpod One");
                    System.out.println("Companheiro perfeito para os ouvintes!");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\t\tValor: R$ 95,00");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Funções do Ipod:");
                    System.out.println("\n1. Reproduzir músicas");
                    ipod1.tocar();
                    System.out.println("\n2. Selecionar músicas");
                    ipod1.selecionarMusica();
                    System.out.println("\n3. Pausar músicas");
                    ipod1.pausar();
                    break;
                case 4:
                    System.out.println("O aparelho All-in-One, para aqueles que desejam praticidade e tecnologia na palma da mão.");
                    System.out.println("\tIphone 2G");
                    System.out.println("\"O iPhone 2G: onde a revolução começou. Simplesmente revolucionário!");
                    System.out.println("------------------------------------------------------");
                    System.out.println("\t\tValor: R$ 600,00");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Funções do Iphone:");
                    System.out.println("\n1. Navegar na internet");
                    iphone1.exibirPagina();
                    System.out.println("\n2. Atualizações de páginas web");
                    iphone1.atualizarPagina();
                    System.out.println("\n3. Abrir quantas abas quiser");
                    iphone1.adicionarNovaAba();
                    System.out.println("\n4. Atender chamadas: ");
                    iphone1.atender();
                    System.out.println("\n5. Realizar chamadas");
                    iphone1.ligar();
                    System.out.println("\n6. Iniciar correio de voz");
                    iphone1.iniciarCorreioVoz();
                    System.out.println("\n7. Reproduzir músicas");
                    iphone1.tocar();
                    System.out.println("\n8. Selecionar músicas");
                    iphone1.selecionarMusica();
                    System.out.println("\n9. Pausar músicas");
                    iphone1.pausar();
                    break;
                case 0:
                    System.out.println("Obrigado por visitar a MarkStore. Volte sempre!");
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um número válido.");
                    opcao = 0;
                    break;
            }

            if (opcao != 0) {
                System.out.println("------------------------------------------------------");
                System.out.println("Deseja realizar o pagamento? (S/N): ");
                char pagamento = scanner.next().charAt(0);

                if (pagamento == 'S' || pagamento == 's') {
                    System.out.println("Pagamento realizado com sucesso!");
                    opcao = 0;
                } else {
                    System.out.println("Pedido cancelado.");
                }
            }
        } while (opcao != 0);

        scanner.close();
    }
}
