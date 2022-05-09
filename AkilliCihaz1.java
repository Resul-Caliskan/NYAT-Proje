import java.util.concurrent.TimeUnit;

public class AkilliCihaz1 extends ObserverCihaz implements ICihaz {

	/** ICihaz scope */
	@Override
	public void sicaklikDon() throws InterruptedException{
		sicaklik.sicaklikOku();		
		TimeUnit.SECONDS.sleep(1);
	}

	@Override
	public void sogutucuAc() throws InterruptedException{
		System.out.print("Ýþlem Yapýlýyor...\n");
		TimeUnit.SECONDS.sleep(1);
		eyleyici.sogutucuAc();
		TimeUnit.SECONDS.sleep(1);
		System.out.print("\nSistemden Çýkýlýyor..");
		
	}

	@Override
	public void sogutucuKapat() throws InterruptedException {
		System.out.print("Ýþlem Yapýlýyor...\n");
		TimeUnit.SECONDS.sleep(1);
		eyleyici.sogutucuKapat();
		TimeUnit.SECONDS.sleep(1);
		System.out.print("\nSistemden Çýkýlýyor...");
		
	}
	
	/** Observer class scope    */

	@Override
	public void durum() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Cihaz Kapalý!\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Cihaz Açýlýþ Testi Yapýlýyor...\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Beklemede..\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Algýlanýyor...\n");
		TimeUnit.SECONDS.sleep(1);
	}
	
}
