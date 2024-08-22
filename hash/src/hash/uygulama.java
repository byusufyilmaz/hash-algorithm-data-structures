package hash;

public class uygulama {

	public static void main(String[] args) {
		hash tablo=new hash(5);
		
		tablo.ekle(0,"burak" );
		tablo.ekle(10,"mehmet" );
		
		tablo.ekle(23, "ismail");
		tablo.ekle(33, "hüseyin");
		
		
		System.out.println(tablo.dizi[0].next.next.isim);
		
		tablo.sil(0);
		tablo.sil(10);
		tablo.sil(33);
		
		
		
		tablo.yazdır();
		
		
	}

}
