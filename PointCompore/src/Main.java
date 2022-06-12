
public class Main {

	public static void main(String[] args) {

		Dıgıtal dıgıtal1 = new Dıgıtal(10,40,50,10);
		Dıgıtal dıgıtal2 = new Dıgıtal(30,40,15,15);
		Dıgıtal fırst_sele = first(dıgıtal1,dıgıtal2);
		
		
		Balanced balanced1 = new Balanced(30,30,20,20);
		Balanced balanced2 = new Balanced(10,10,40,40);
		Balanced fırst_sele_b = first(balanced1,balanced2);
		
		
		System.out.println("Birinci Sayısal Öğrencinin Puanı : " +fırst_sele.puanHesapla());
		System.out.println("Eşit Ağırlık Birinci Puanı : " +fırst_sele_b.puanHesapla());
		
		
	}
	
	public static <E extends Applıcant> E first(E e1 ,E e2) {
		
		if(e1.puanHesapla()>e2.puanHesapla()) {
			return e1;
		}
		else {
			return e2 ;
		}
		
	}

}
