package sedmaNedelja;

public class Biciklo extends Vozilo implements Ekonomican {



    public Biciklo(int id, double maxBrzina) {
		super(id, 20);  //maxBrzina=20
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
