import java.sql.SQLException;
import java.util.Scanner;

public class AgArayuzu {

	public static void main(String[] args) throws SQLException, InterruptedException {
		//Veritaban� islemleri
		IVeriTabani postsql=new PostgreSql();
		VeriTabaniSurucu vt=new VeriTabaniSurucu(postsql);
		vt.baglan();
		Scanner s = new Scanner(System.in);
		do {
		System.out.print("Kullanici Adinizi Giriniz: ");
		String kullaniciAdi=s.nextLine();
		boolean dogrumu=vt.kullaniciDogrula(kullaniciAdi);
		if(dogrumu)
		{
			break;
		}
		}
		while(true);
		int sayac=3;
		while(sayac!=0) {
		System.out.print("Sifreyi Giriniz: ");
		String sifre=s.nextLine();
		boolean dogrumu=vt.sifreDogrula(sifre);
		if(dogrumu)
		{
			vt.ayarla(dogrumu);
			vt.kapat();
			break;
		}
		else {sayac--;}
		}
		if(sayac==0) {System.out.print("Sistem Sonland�r�l�yor");System.out.close();}
		
		/****factory islemler**/
		CihazFactory fabrika=new CihazFactory();
		ICihaz cihaz=fabrika.cihazDon();
		
		cihaz.sicaklikDon();
		
		System.out.print("\n1) So�utucuyu �al��t�r \n2) So�utucuyu Kapat \nYapmak �stedi�iniz ��lemi Se�iniz:");
		String islem=s.nextLine();
		
		if(islem.equals("1")) cihaz.sogutucuAc();
		
		else cihaz.sogutucuKapat();
		

	}

}
