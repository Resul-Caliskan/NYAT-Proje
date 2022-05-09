import java.sql.SQLException;

public class VeriTabaniSurucu implements IVeriTabani{

	private IVeriTabani veritabani;
	VeriTabaniSurucu(IVeriTabani vt)
	{
		veritabani=vt;
	}
	@Override
	public void baglan() {
		veritabani.baglan();
		
	}

	@Override
	public boolean kullaniciDogrula(String ad) throws SQLException{
		return veritabani.kullaniciDogrula(ad);
		
	}

	@Override
	public boolean sifreDogrula(String sifre) throws SQLException {
		return veritabani.sifreDogrula(sifre);
		
	}

	@Override
	public void kapat() {
		veritabani.kapat();
		
	}
	
     /**  observer class scope */ 	
	
	private ObserverCihaz observers=new AkilliCihaz1();
	public void ayarla(boolean state) throws InterruptedException {
	      
	      if(state) {uyar();}
	   }
	
	
	public void uyar() throws InterruptedException{
	     
	         observers.durum();
	     }
}
