package tipofuncionarios;

public class Funcionario {

    String nome, codigoFuncional;

    public Funcionario(String nome, String codigoFuncional) {
        setNome(nome);
        setCodigoFuncional(codigoFuncional);
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
