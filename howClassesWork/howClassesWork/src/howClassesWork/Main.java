package howClassesWork;

public class Main {

	public static void main(String[] args) {
		//referance typelar
		//Referans typelarda classı refere edip başka bir değere de atanabilir.
		//New ile çalışmak maliyetlidir. Maliyeti en aza indirmek için classları mümkün olduğunca az çağırmak
		//gerekmekte. customerManager classı artık Garbage collector ile silinip bellekte yer tutmaz. 
		
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		//value types
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); //Heapte tutulmuyorlar. Sadece stackte tutuluyorlar. O yüzden değişkenler
		// bir değere sürekli sabitler.
		
		//arrayler referance type'tır.
		int[] sayilar1 = new int[] {1,2,3};//array böyle de tanımlanır
		int[] sayilar2 = {4,5,6}; //array böyle de tanımlanır.
		
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		

	}

}
