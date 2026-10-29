package sedmaNedelja;

public abstract class Vozilo {

	protected int id;          //protected da mozemo pristupat po klasama
	protected double maxBrzina;
	
	public Vozilo(int id,double maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}
	
	public void info() {
		   System.out.println("ID vozila je:  " + id +" a njegova maksimalna brzina je: ");
		   
		}	
	
	public abstract double  izracunajVrijemeDostave(double udaljenostKm); //interface //double treba kod glavne klasse ako
	//nije double kod vozila imamo probem kod drugih klassi
	
	public interface Ekonomican {
		double potrosnjaPoKm();
		
	}
		
	}
