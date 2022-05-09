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
		System.out.print("��lem Yap�l�yor...\n");
		TimeUnit.SECONDS.sleep(1);
		eyleyici.sogutucuAc();
		TimeUnit.SECONDS.sleep(1);
		System.out.print("\nSistemden ��k�l�yor..");
		
	}

	@Override
	public void sogutucuKapat() throws InterruptedException {
		System.out.print("��lem Yap�l�yor...\n");
		TimeUnit.SECONDS.sleep(1);
		eyleyici.sogutucuKapat();
		TimeUnit.SECONDS.sleep(1);
		System.out.print("\nSistemden ��k�l�yor...");
		
	}
	
	/** Observer class scope    */

	@Override
	public void durum() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Cihaz Kapal�!\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Cihaz A��l�� Testi Yap�l�yor...\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Beklemede..\n");
		TimeUnit.SECONDS.sleep(1);
		System.out.print("Alg�lan�yor...\n");
		TimeUnit.SECONDS.sleep(1);
	}
	
}
