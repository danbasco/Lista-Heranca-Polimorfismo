package tipofuncionarios;

import comissao.Comissao;

public class FuncionarioB extends FuncionarioS{ // Concluiu o ensino basico

    private String escolaBasica;

    public FuncionarioB(String nome, String codigoFuncional, String escolaBasica, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        setEscolaBasica(escolaBasica);
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }

    @Override
    public float getRendaTotal(){
        return this.getComissao().getAdicional() +
                (super.getRendaTotal() - this.getComissao().getAdicional()) *1.1f;
    }

}
