package solid_lsp_v2;

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
	public float calcularSalario(){
        return this.getSalario() + bonus;
    }
    
}
