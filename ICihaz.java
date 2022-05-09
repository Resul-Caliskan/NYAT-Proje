
public interface ICihaz {
	public static final SicaklikAlgila sicaklik = new SicaklikAlgila();
	public static final Eyleyici eyleyici=new Eyleyici();
	//for observer pattern 
	//public void durum() throws InterruptedException;
	//for factory pattern
	public void sicaklikDon() throws InterruptedException;
	public void sogutucuAc() throws InterruptedException;
	public void sogutucuKapat() throws InterruptedException;
}
