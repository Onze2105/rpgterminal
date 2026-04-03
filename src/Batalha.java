import java.util.Scanner;
public class Batalha {
    

    public static void iniciar(Personagem p1, Personagem p2){
        Scanner sc = new Scanner(System.in);

        while(p1.estaVivo() && p2.estaVivo()){
            System.out.println(p2.getNome() + p2.fraseAleatoria());
            Main.delay(1000);
            System.out.println(Main.YELLOW +"=====" + p2.getNome() + Main.GREEN + " Vida=" + p2.getVida() + Main.YELLOW + "=====" + Main.RESET);
            System.out.println(Main.YELLOW + "=====" + p1.getNome() + Main.GREEN + " Vida=" + p1.getVida() + Main.YELLOW + "=====" + Main.RESET);
            Main.delay(1000);
            System.out.println(Main.GREEN +"Qual será sua ação?\n(A) Atacar\n (F)Fugir" + Main.RESET);
            String escolha = sc.nextLine();
            Main.delay(1000);

            if(escolha.equalsIgnoreCase("a")){
                if(p1.estaVivo() && p2.estaVivo()){
                    p1.atacar(p2);
                }
                
                if(p1.estaVivo() && p2.estaVivo()){
                    p2.atacar(p1);
                }
                
            }else if(escolha.equalsIgnoreCase("f")){
                break;
            }

        }

    }
}
