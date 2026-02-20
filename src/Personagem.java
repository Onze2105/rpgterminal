import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected Random random = new Random();
    protected List<String> frases = new ArrayList<>();
    protected List<String> frasesA = new ArrayList<>();

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        vida = Math.max(0, vida - dano);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int gerarDano() {
        // dano entre 50% e 100% do ataque
        return random.nextInt(ataque / 2) + (ataque / 2);
    }

    public abstract void atacar(Personagem alvo);

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public String fraseAleatoria(){
        int indice = random.nextInt(frases.size());
        return frases.get(indice);
    }

    public String fraseAleatoriaA(){
        int indice = random.nextInt(frasesA.size());
        return frases.get(indice);
    }


    public abstract String getClasse();



}