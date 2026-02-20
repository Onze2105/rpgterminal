import java.util.Scanner;
public class Batalha {
    public static void iniciar(Personagem p1, Personagem p2){
        Scanner sc = new Scanner(System.in);

        while(p1.estaVivo() && p2.estaVivo()){
            System.out.println(p2.getNome() + p2.fraseAleatoria());

            System.out.println("Qual será sua ação?\n(A) Atacar\n (F)Fugir"); 
            String escolha = sc.nextLine();
            if(escolha.equalsIgnoreCase("a")){
                if(p1.estaVivo() && p2.estaVivo()){
                    p1.atacar(p2);
                    System.out.println(p2.getNome() + " ficou com " + p2.getVida() + " de vida!");
                }
                
                if(p1.estaVivo() && p2.estaVivo()){
                    p2.atacar(p1);
                    System.out.println(p1.getNome() + " ficou com " + p1.getVida() + " de vida!");
                }
                
            }else if(escolha.equalsIgnoreCase("f")){
                break;
            }

        }

    }
}
