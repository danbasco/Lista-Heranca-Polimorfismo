package tipofuncionarios;

public class FuncionarioG extends FuncionarioM{

    private String universidade;

    public FuncionarioG(String nome, String codigoFuncional, String escolaBasica, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedio);
        setUniversidade(universidade);
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}
