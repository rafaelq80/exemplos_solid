package solid_lsp_v1;

class Vendedor extends Funcionario {

	private float totalVendas;

	public Vendedor(float salario, String cargo, String nome, float totalVendas) {
		super(salario, cargo, nome);
		this.totalVendas = totalVendas;
	}

	public float getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(float totalVendas) {
		this.totalVendas = totalVendas;
	}

	// Método Calcular Salário
	@Override
	public float calcularSalario() {
		return this.getSalario() + this.calcularComissao();
	}

	// Método Calcular Comissão
	@Override
	float calcularComissao() {
		return this.totalVendas * 0.1f;
	}

	// Método Calcular Bônus - Não Implmentado
	@Override
	float calcularBonus() {
		return 0.0f;
	}
}