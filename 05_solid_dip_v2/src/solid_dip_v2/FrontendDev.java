package solid_dip_v2;

public class FrontendDev implements IDev{

	@Override
	public void dev() {
		this.react();
		
	}

	public void react() {
		System.out.println("\nDesenvolvedor React");
	}
	
}
