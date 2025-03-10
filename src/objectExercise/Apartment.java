package objectExercise;

public class Apartment extends Property {
	private String layout;
	
	public Apartment(String name, String owner, String type, long price, String layout) {
		super(name, owner, type, price);
		this.layout = layout;
	}
	
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	
	@Override
	public void displayInto() {
		super.displayInto();
		System.out.println("間取り：" + getLayout());
		System.out.println("=============================");
	}
	
}
