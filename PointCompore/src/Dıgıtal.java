
public class Dıgıtal extends Applıcant {

	public Dıgıtal(int edebiyat, int fizik, int matematik, int turkce) {
		super(edebiyat, fizik, matematik, turkce);
		// TODO Auto-generated constructor stub
	}

	@Override
	int puanHesapla() {
		

		return (getMatematik()*50)+(getEdebiyat()*10)+(getFizik()*30)+(getTurkce()*10);
	}

	
}
