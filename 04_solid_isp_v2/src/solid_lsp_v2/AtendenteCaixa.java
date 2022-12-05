package solid_lsp_v2;

public class AtendenteCaixa extends Funcionario{

	
	public AtendenteCaixa(float salario, String cargo, String nome) {
		super(salario, cargo, nome);
	}

	// Método Calcular Salário
	@Override
	float calcularSalario() {
		return this.getSalario();
	}

}
