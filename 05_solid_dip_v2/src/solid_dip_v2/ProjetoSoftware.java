package solid_dip_v2;

import java.util.List;

public class ProjetoSoftware {

	public List<IDev> devs;
		
	public ProjetoSoftware(List<IDev> devs) {
		this.devs = devs;
	}

	public void criarProjeto() {
		this.devs.forEach(d -> d.dev());
	}
}
