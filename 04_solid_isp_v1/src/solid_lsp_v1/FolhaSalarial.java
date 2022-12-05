package solid_lsp_v1;

import java.time.LocalDate;
import java.util.List;

class FolhaSalarial{
    
	private LocalDate data;
    
    public FolhaSalarial(LocalDate data) {
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void imprimirFolhaSalarial(List<Funcionario> funcionarios){
        
		System.out.println("FOLHA SALARIAL\n");
		
		for(Funcionario funcionario : funcionarios){
            
        	System.out.println("\n" + funcionario.getNome() + " ----- R$ " + funcionario.calcularSalario());

        }
    } 
}
