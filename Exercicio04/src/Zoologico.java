import animais.Animal;
import animais.Cachorro;
import animais.Cavalo;
import animais.Preguica;

public class Zoologico {

    static Animal[] Jaulas = {
            new Cachorro("Xodó", 12),
            new Cavalo("Branco", 3),
            new Preguica("Luna", 6),
            new Cavalo("Campeão", 13),
            new Cachorro("Aisha", 4),
            new Preguica("Sleepy", 8),
            new Cachorro("Bob", 5),
            new Cavalo("Eduardo", 2),
            new Preguica("Samuel", 7),
            new Cachorro("Totó", 8),
    };

    public static void main(String[] args) {

        for (Animal animal : Jaulas) {

            System.out.println(animal);
            animal.emitirSom();
            animal.mover();
            System.out.println();

        }

    }


}
