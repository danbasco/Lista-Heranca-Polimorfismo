import animais.*;

public class Main {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Totó", 4);
        Cavalo c2 = new Cavalo("Tom", 5);
        Preguica p1 = new Preguica("Hurdo", 5);

        Veterinario v1 = new Veterinario();

        v1.examinar(c1);
        v1.examinar(c2);
        v1.examinar(p1);

    }
}
