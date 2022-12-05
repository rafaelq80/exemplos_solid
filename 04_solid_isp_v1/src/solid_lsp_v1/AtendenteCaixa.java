package solid_lsp_v1;

public class AtendenteCaixa extends Funcionario {

	public AtendenteCaixa(float salario, String cargo, String nome) {
		super(salario, cargo, nome);
	}

	// Método Calcular Salário
	@Override
	float calcularSalario() {
		return this.getSalario();
	}

	// Método Calcular Comissão - Não Implementado
	@Override
	float calcularComissao() {
		return 0.0f;
	}

	// Método Calcular Bônus - Não Implmentado
	@Override
	float calcularBonus() {
		return 0.0f;
	}

}
