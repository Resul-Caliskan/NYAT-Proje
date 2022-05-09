import java.sql.*;


public class PostgreSql implements IVeriTabani{
	Connection conn;
	String ad;
	@Override
	public void baglan() {
	    try
        {   /***** Baðlantý kurulumu *****/
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Kullanici",
                    "postgres", "1234");
            if (conn != null)
                System.out.println("Veri tabanýna baðlandý!");
            else
                System.out.println("Baðlantý giriþimi baþarýsýz!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	

	@Override
	public boolean kullaniciDogrula(String ad) throws SQLException {
		String sql="Select * From \"kullanicilar\" Where \"adi\" Like '"+ad+"%'";
		
		//sorgu calistirma
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
       while (rs.next()) {
    	  
        if(ad.equals(rs.getString(1)))
        {
        	System.out.printf("Kullanici Adi Dogru..\n");
        	this.ad=ad;
        	return true;
        }
        }
       rs.close();
       stmt.close();
       System.err.printf("Yanlis Kullanici Adi!\n");
	return false;
	}




	@Override
	public boolean sifreDogrula(String sifre) throws SQLException {
		
		String sql="Select * From \"kullanicilar\" Where \"adi\" Like '"+"resul"+"%'";
		
		//sorgu calistirma
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
        	
        if(sifre.equals(rs.getString(2)))
        {
        	System.out.printf("Sifre Dogru..\n");
        	return true;
        }
        else
        {
        	System.err.printf("Yanlis Sifre! \n");
        	return false;
        }
	}
        rs.close();
        stmt.close();
        return false;
	}
	
	@Override
	public void kapat() {
		try {
			conn.close();
			System.out.print("Veri tabaný Kapatýldý!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}




}
