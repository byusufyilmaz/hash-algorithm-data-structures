package hash;

public class hash {
	    node dizi [] ;
	    int size;
	    public hash(int size) {
	        this.size = size;
	        dizi= new node [size];
	        for (int i = 0; i < size; i++) {
	            dizi[i] = new node();
	            
	        }
	    }
	    int indexUret(int key )
	    {
	        return key % size;
	    }
	    void ekle(int numara,  String isim){
	        int index = indexUret( numara );


	        node eleman = new node (numara, isim);
	        node temp =dizi[index];
	        while( temp.next!=null ) // ilgili bağlı listenin sonuna ekleme yaptı
	            temp= temp.next;
	        temp.next= eleman;
	        System.out.println(eleman.isim+" eklendi ");
	    }


	    void sil( int numara) {
	        boolean sonuc = false;
	        int indis = indexUret(numara);
	        node temp = dizi[indis];
	        node temp2 = dizi[indis];
	        if (temp.next == null) {
	            System.out.println(numara + " numarali kayit yok");
	            sonuc = true;
	        } else if (temp.next.next == null && temp.next.numara == numara) {
	            sonuc = true;
	            System.out.println(" bu kısımdıkaki son kisi olan" + temp.next.isim + " silindi ");
	            temp.next = null;
	        } else {
	            while (temp.next != null) {
	                temp2 = temp;
	                temp = temp.next;
	                if (temp.numara == numara) {
	                    sonuc = true;
	                    System.out.println(temp.isim + " silindi ");
	                    temp2.next = temp.next;
	                }
	            }
	        }
	    if (sonuc == false){
	        System.out.println( numara + "numaralı ogrencı yok ");
	    }

	    }void yazdır ()
	    {
	        for (int i  = 0; i < size; i++) {
	        node temp= dizi[i];
	        System.out.print ("Dizi["+i+"] ->" );

	        if( temp.next != null )
	            while( temp.next!=null )
	            {
	                System.out.print( temp.next. numara +""+ temp.next.isim+"->");
	                temp= temp.next;
	            }
	        System.out.println();
	    }
	    }
	}