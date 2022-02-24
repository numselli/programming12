package cellPhone;

public class cellPhoneTester {
	public static void main(String[] args) {
		
		System.out.println("using new to set values");
		cellPhone phone = new cellPhone("Apple", "Iphone 6s", 350.69);
		
		System.out.println("manufacturer: " + phone.getManufact());
		System.out.println("model: " + phone.getModel());
		System.out.println("retailPrice: " + phone.getRetailPrice());
		
		
		System.out.println("using set functions to set values");
		phone.setManufact("Google");
		phone.setModel("Pixel 5a");
		phone.setRetailPrice(650);
		
		System.out.println("manufacturer: " + phone.getManufact());
		System.out.println("model: " + phone.getModel());
		System.out.println("retailPrice: " + phone.getRetailPrice());

	}
}
