package cellPhone;

public class cellPhone {
	private String manufacturer;
	private String model;
	private double retailPrice;
	
	//A constructor that accepts arguments for the manufacturer, model number, and retail price. 
	public cellPhone (String inputManufacturer, String inputModel, double inputPrice) {
		if (inputManufacturer.equals("") || inputModel.equals("") || inputPrice<0) {
			System.out.println("enter a manufacturer, model, and price");
			return;
		}
		manufacturer = inputManufacturer;
		model = inputModel;
		retailPrice = inputPrice;
	}
	
	//A setManufact method that accepts an argument for the manufacturer. This method will allow us to change the value of the manufact field after the object has been created, if necessary. 
	public void setManufact(String inputManufacturer) {
		if (inputManufacturer.equals("")) System.out.println("enter a manufacturer");
		manufacturer = inputManufacturer;
	}
	
	//A setModel method that accepts an argument for the model. This method will allow us to change the value of the model field after the object has been created, if necessary. 
	public void setModel(String inputModel) {
		if (inputModel.equals("")) System.out.println("enter a model");
		model = inputModel;
	}
	
	//A setRetailPrice method that accepts an argument for the retail price. This method will allow us to change the value of the retailPrice field after the object has been created, if necessary. 
	public void setRetailPrice(double inputPrice) {
		if (inputPrice<0) {
			System.out.println("enter a price");
			return;
		}
		retailPrice = inputPrice;
	}
	
	//A getManufact method that returns the phone’s manufacturer. 
	public String getManufact() {
		return manufacturer;
	}

	//A getModel method that returns the phone’s model number. 
	public String getModel() {
		return model;
	}

	//A getRetailPrice method that returns the phone’s retail price. 
	public double getRetailPrice() {
		return retailPrice;
	}
}
