package sedmaNedelja;

public class Motor extends Vozilo implements Ekonomican {

	public Motor(int id, double maxBrzina) {
		super(id, maxBrzina);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		// TODO Auto-generated method stub
		return udaljenostKm/maxBrzina;
	}
	
	

	

}
