package tipofuncionarios;

import comissao.Comissao;

public abstract class Funcionario {

    private final static float rendaBasica = 1000;
    String nome, codigoFuncional;

    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        setNome(nome);
        setCodigoFuncional(codigoFuncional);
        this.comissao = comissao;
    }

    public Comissao getComissao() {
        return comissao;
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

    public abstract float getRendaTotal();

    public static float getRendaBasica() { return rendaBasica; }

}
