public class Rato extends Personagem {

    public Rato() {
        super("Rato Selvagem", 40, 12);

        frases.add(" avança ferozmente.");
        frases.add(" grunhe em ira.");
        frases.add(" funga o ar.");
        frasesA.add(" pula em sua direção e te arranha!");
        frasesA.add(" avança e te morde!");
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = gerarDano();
        System.out.println(nome + fraseAleatoriaA());
        System.out.println("Causou " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    @Override
    public String getClasse(){
        return "rato";
    }
    

    
}