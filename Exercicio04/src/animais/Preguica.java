package animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("*sons de preguiça*");
    }

    @Override
    public void mover() {
        System.out.println("A preguiça subiu na árvore");
    }

}
