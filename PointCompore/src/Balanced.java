
public class Balanced extends Applıcant {

	public Balanced(int edebiyat, int fizik, int matematik, int turkce) {
		super(edebiyat, fizik, matematik, turkce);
		// TODO Auto-generated constructor stub
	}

	@Override
	int puanHesapla() {


		return (getMatematik()*20)+(getFizik()*10)+(getTurkce()*30)+(getEdebiyat()*40);
	}

	
	
	
	
}
