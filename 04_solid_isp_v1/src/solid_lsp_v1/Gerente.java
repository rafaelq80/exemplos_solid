package solid_lsp_v1;

class Gerente extends Funcionario {
    
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
	public float calcularSalario(){
        return this.getSalario() + this.calcularBonus();
    }

	// Método Calcular Comissão - Não Implmentado
	@Override
	float calcularComissao() {
		return 0.0f;
	}

	// Método Calcular Bônus
	@Override
	float calcularBonus() {
		return this.getSalario() * this.getBonus();
	}
    
}
