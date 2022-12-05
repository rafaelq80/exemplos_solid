package solid_lsp_v2;

public abstract class Funcionario{

	private float salario;
    private String cargo;
    private String nome;
    
	public Funcionario(float salario, String cargo, String nome) {
		this.salario = salario;
		this.cargo = cargo;
		this.nome = nome;
	}

	//Métodos abstratos
	abstract float calcularSalario();

	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
}
