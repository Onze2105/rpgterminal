import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



        
public class Main {

    public static void delay(int ms) {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(RED + "Insira o nome do seu Héroi: " + RESET);
        String nome = sc.nextLine();
        delay(1000);
        Personagem heroi = null;



        while(true){
            try {
                System.out.println("Qual será sua classe?\n(1)Guerreiro\n(2)Mago\n(3)Arqueiro");
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida!");
            }
            
        }
        



        System.out.println("Seja bem-vindo, " + heroi.getNome() + ", você é um " + heroi.getClasse());
        delay(1000);
        System.out.println(YELLOW + "Você acorda em uma floresta escura a noite, e decide começar a andar sem rumo até encontrar algum lugar seguro");
        delay(1500);
        List<String> textos = new ArrayList<>(List.of(RED + "O vento frio da noite uiva." + RESET, RED + "O silêncio da noite é amedrontador." + RESET, RED + "Folhas secas preenchem os caminhos."
        + RESET, RED +"Você pode ouvir uma coruja ao longe." + RESET, RED + "Você se sente observado." + RESET
        ));
        String direcao;
        Random random = new Random();
        do {
            int indice = random.nextInt(textos.size());
            String cena = textos.get(indice);
            System.out.println(cena);
            delay(1500);
            System.out.println(YELLOW + "Para onde você vai andar?\n(N) Norte\n(S)Sul\n(L)Leste\n(O) Oeste" + RESET);
            direcao = sc.nextLine();
        }
        while(!direcao.equalsIgnoreCase( "L"));

        System.out.println(RED + "Você se depara com um rato selvagem!" + RESET);
        Personagem rato = new Rato();
        Batalha.iniciar(heroi, rato);




        

    }
}
