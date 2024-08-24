package tipofuncionarios;

import comissao.Comissao;

// Funcionario sem escolaridade
public class FuncionarioS extends Funcionario {

    public FuncionarioS(String nome, String codigoFuncional, Comissao comissao) {

        super(nome, codigoFuncional, comissao);
    }

    @Override
    public float getRendaTotal() {
        return Funcionario.getRendaBasica() + this.getComissao().getAdicional();
    }
}
