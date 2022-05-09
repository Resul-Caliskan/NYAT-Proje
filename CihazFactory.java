
public class CihazFactory {
	/**for factory pattern*/
	private ICihaz cihaz;
	public ICihaz cihazDon() throws InterruptedException {
		cihaz=new AkilliCihaz1();
		return cihaz;
	}

}
