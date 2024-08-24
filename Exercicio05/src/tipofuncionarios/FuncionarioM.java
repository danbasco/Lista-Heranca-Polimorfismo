package tipofuncionarios;

public class FuncionarioM extends FuncionarioB{

    private String escolaMedio;

    public FuncionarioM(String nome, String codigoFuncional, String escolaBasica, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasica);
        setEscolaMedio(escolaMedio);
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }
}
