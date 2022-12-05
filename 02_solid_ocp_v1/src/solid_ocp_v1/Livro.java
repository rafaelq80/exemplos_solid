package solid_ocp_v1;

class Livro {
	
	String nome;
	String nomeAutor;
	int ano;
	double preco;
	String isbn;

	public Livro(String nome, String nomeAutor, int ano, double preco, String isbn) {
		this.nome = nome;
		this.nomeAutor = nomeAutor;
		this.ano = ano;
		this.preco = preco;
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}