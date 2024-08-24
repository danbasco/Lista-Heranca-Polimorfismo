package tipofuncionarios;

// Funcionario sem escolaridade
public class FuncionarioS extends Funcionario {

    public FuncionarioS(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    @Override
    public float getRendaTotal() {
        return Funcionario.getRendaBasica();
    }
}
