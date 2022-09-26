package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop"); 
		product.setId(1);
		product.setStockAmount(3);
		product.setPrice(10); 
		
		System.out.println(product.name);
		System.out.println(product.id);
		System.out.println(product.stockAmount);
		System.out.println(product.price);
		System.out.println(product.getKod());
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
