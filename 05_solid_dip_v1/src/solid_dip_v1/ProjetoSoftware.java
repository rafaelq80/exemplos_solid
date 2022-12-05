package solid_dip_v1;

public class ProjetoSoftware {

	public FrontendDev frontDev;
	public BackendDev backDev;
	
	public ProjetoSoftware(FrontendDev frontDev, BackendDev backDev) {
		this.frontDev = frontDev;
		this.backDev = backDev;
	}
	
	public void criarProjeto() {
		this.frontDev.react();
		this.backDev.java();
	}
}
