package tipofuncionarios;

import comissao.Comissao;

public class FuncionarioG extends FuncionarioM{

    private String universidade;


    public FuncionarioG(String nome, String codigoFuncional, String escolaBasica, String escolaMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, escolaMedio, comissao);
        setUniversidade(universidade);

    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public float getRendaTotal(){
        return this.getComissao().getAdicional() +
                (super.getRendaTotal() - this.getComissao().getAdicional()) *2f;
    }




}
