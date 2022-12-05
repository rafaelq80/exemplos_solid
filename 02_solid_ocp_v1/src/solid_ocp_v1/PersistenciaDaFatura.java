package solid_ocp_v1;

public class PersistenciaDaFatura {

	Fatura fatura;

    public PersistenciaDaFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public void salvarParaArquivoPdf(String nomeArquivo) {
		System.out.println("Salvar a fatura no arquivo: " + nomeArquivo);
	}

    public void salvarParaBancoDeDados() {
    	System.out.println("Salvar a fatura no banco de dados");
    }
    
}
