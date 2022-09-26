package oop1;

public class Main {

	public static void main(String[] args) {
		//Valueları artık set metodu ile kuracağız.
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("delongi.jpg");
		product1.setUnitInStock(5);
		product1.setUnitPrice(5500);

		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Sinbo Kahve Makinesi");
		product2.setDiscount(3);
		product2.setImageUrl("SİNBO.jpg");
		product2.setUnitInStock(4);
		product2.setUnitPrice(6000);

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(2);
		product3.setImageUrl("Kitchen.jpg");
		product3.setUnitInStock(5);
		product3.setUnitPrice(10000);
		
		Product[] products = {product1,product2, product3};
		
		//Arrayler için foreach ile döngü yazılır.
		System.out.println("<ul>");
		for (Product product : products) {
			//yazdırırken artık getName methodu ile yazdırıyoruz.
			
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("1");
		individualCustomer.setId(1);
		individualCustomer.setPhone("052334134123");
		individualCustomer.setFirstName("Ertan");
		individualCustomer.setLastName("Kaya");
		
		CorparateCustomer corparateCustomer = new CorparateCustomer();
		
		corparateCustomer.setCompanyName("Ertan A.Ş");
		corparateCustomer.setCustomerNumber("1234");
		corparateCustomer.setId(1234);
		corparateCustomer.setPhone("02131234");
		corparateCustomer.setTaxNumber("1232132");
		
		//individual ve corparete customer classlarını extend ettiğimiz için Customer arrayinde toplayabiliyoruz.
		Customer[] customers = {individualCustomer, corparateCustomer};
	}

}
