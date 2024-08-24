package animais;

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public abstract void emitirSom();

    public void mover(){
        System.out.println("O animal corre");
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
