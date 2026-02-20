import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do seu Héroi: ");
        String nome = sc.nextLine();
        System.out.println("Qual classe irá escolher?\n(1)Guerreiro\n(2)Mago\n(3)Arqueiro");
        int classe = sc.nextInt();
        sc.nextLine();
        
        Personagem heroi = null;
        switch(classe){
            case 1:
                heroi = new Guerreiro(nome);
                break;
            case 2:
                heroi = new Mago(nome);
                break;
            case 3:
                heroi = new Arqueiro(nome);
                break;

            default:
                System.out.println("Opção inválida!");
                
        }

        System.out.println("Seja bem-vindo, " + heroi.getNome() + ", você é um " + heroi.getClasse());
        System.out.println("Você acorda em uma floresta escura a noite, e decide começar a andar sem rumo até encontrar algum lugar seguro");
        List<String> textos = new ArrayList<>(List.of("O vento frio da noite uiva.", "O silêncio da noite é amedrontador.", "Folhas secas preenchem os caminhos."
            , "Você pode ouvir uma coruja ao longe.", "Você se sente observado."
        ));
        String direcao;
        Random random = new Random();
        
        do {
            int indice = random.nextInt(textos.size());
            String cena = textos.get(indice);
            System.out.println(cena);
            System.out.println("Para onde você vai andar?\n(N) Norte\n(S) Sul\n (L) Leste\n (O) Oeste");
            direcao = sc.nextLine();
        }
        while(!direcao.equalsIgnoreCase( "L"));

        System.out.println("Você se depara com um rato selvagem!");
        Personagem rato = new Rato();
        Batalha.iniciar(heroi, rato);




        

    }
}
