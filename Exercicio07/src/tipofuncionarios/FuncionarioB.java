package tipofuncionarios;

public class FuncionarioB extends FuncionarioS{ // Concluiu o ensino basico

    private String escolaBasica;

    public FuncionarioB(String nome, String codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
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
        return super.getRendaTotal()*1.1f;
    }

}
