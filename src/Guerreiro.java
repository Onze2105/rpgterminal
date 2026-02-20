public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 120, 25);

        frases.add(" desferiu um golpe certeiro contra ");
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = gerarDano();
        System.out.println(nome + fraseAleatoria() + alvo.getNome());
        System.out.println("Causou " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    @Override
    public String getClasse(){
        return "Guerreiro";
    }
}