package solid_lsp_v2;

public class Gerente extends Funcionario implements BonusAplicavel {

	private float bonus;

	public Gerente(float salario, String cargo, String nome, float bonus) {
		super(salario, cargo, nome);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	// Método Calcular Salário
	@Override
	public float calcularSalario() {
		return this.getSalario() + this.calcularBonus();
	}

	// Método Calcular Bônus
	@Override
	public float calcularBonus() {
		return this.getSalario() * this.getBonus();
	}
}
