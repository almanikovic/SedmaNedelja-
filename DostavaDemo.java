package sedmaNedelja;

public class DostavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double udaljenostKm = 10;
		
		Vozilo[] vozila = new Vozilo[3];
		vozila[1] = new Biciklo (321,20);
		vozila[2] = new Motor (543,60);
		vozila[3] = new Automobil (999,80);
		
		
		double udaljenost = 10.0;
		
		for(Vozilo v : vozila) {
			v.info();
			if(v instanceof Ekonomican) {
			  Ekonomican e =(Ekonomican) v ;
			  
	double ukupnaPotrosnja = e.potrosnjaPoKm()*udaljenost;
	   System.out.println("Ukupna potrosnja na: " + udaljenost + "kilometara je: "+ ukupnaPotrosnja);
			  
			}
			
		}
		
	}
}
