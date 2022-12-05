package solid_dip_v1;

public class TestaProjeto {

	public static void main(String[] args) {
		
		FrontendDev frontDev = new FrontendDev();
		BackendDev backDev = new BackendDev();
		
		ProjetoSoftware projetoSoftware = new ProjetoSoftware(frontDev, backDev);
		
		projetoSoftware.criarProjeto();

	}

}
