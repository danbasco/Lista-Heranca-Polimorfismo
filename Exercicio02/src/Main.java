import animais.*;

public class Main {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Totó", 4);
        Cavalo c2 = new Cavalo("Tom", 5);
        Preguica p1 = new Preguica("Hurdo", 5);

        Animal[] animais = {c1, c2, p1};
        for (Animal a : animais) {a.emitirSom();}
    }
}
