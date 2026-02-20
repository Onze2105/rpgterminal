public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 35);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = gerarDano();
        System.out.println(nome + " lança uma bola de fogo!");
        System.out.println("Causou " + dano + " de dano.");
        alvo.receberDano(dano);
    }
    @Override
    public String getClasse(){
        return "Mago";
    }
}