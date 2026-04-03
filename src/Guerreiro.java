public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 120, 25);

        frases.add(" desferiu um golpe certeiro contra ");
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = gerarDano();
        System.out.println(Main.GREEN + nome + fraseAleatoria() + alvo.getNome() + Main.RESET);
        System.out.println(Main.RED + "Causou " + dano + " de dano." + Main.RESET);
        alvo.receberDano(dano);
    }

    @Override
    public String getClasse(){
        return "Guerreiro";
    }
}