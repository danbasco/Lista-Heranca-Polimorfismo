package tipofuncionarios;

import comissao.Comissao;

public class FuncionarioM extends FuncionarioB{

    private String escolaMedio;

    public FuncionarioM(String nome, String codigoFuncional, String escolaBasica, String escolaMedio, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, comissao);
        setEscolaMedio(escolaMedio);

    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    @Override
    public float getRendaTotal(){
        return this.getComissao().getAdicional() +
                (super.getRendaTotal() - this.getComissao().getAdicional()) *1.5f;
    }

}
