
public abstract class Applıcant {

	private int edebiyat ;
	private int fizik ;
	private int matematik ;
	private int turkce;
	
	
	
	public Applıcant(int edebiyat, int fizik, int matematik, int turkce) {
		super();
		this.edebiyat = edebiyat;
		this.fizik = fizik;
		this.matematik = matematik;
		this.turkce = turkce;
	}
	public int getEdebiyat() {
		return edebiyat;
	}
	public void setEdebiyat(int edebiyat) {
		this.edebiyat = edebiyat;
	}
	public int getFizik() {
		return fizik;
	}
	public void setFizik(int fizik) {
		this.fizik = fizik;
	}
	public int getMatematik() {
		return matematik;
	}
	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}
	public int getTurkce() {
		return turkce;
	}
	public void setTurkce(int turkce) {
		this.turkce = turkce;
	}

	 abstract int  puanHesapla();
	
	
	
	
}
