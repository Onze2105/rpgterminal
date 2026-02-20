public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 90, 28);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = gerarDano();
        System.out.println(nome + " dispara uma flecha!");
        System.out.println("Causou " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    @Override
    public String getClasse(){
        return "Arqueiro";
    }
}