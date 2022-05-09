import java.sql.SQLException;

public interface IVeriTabani {
	/**DIP ilkesi  icin yazdik*/
	public void baglan();
	public boolean kullaniciDogrula(String ad)throws SQLException;
	public boolean sifreDogrula(String sifre)throws SQLException;
	public void kapat();
}
