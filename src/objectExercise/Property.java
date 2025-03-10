package objectExercise;

public class Property {
	private String name;
	private String owner;
	private String type;
	private long price;
	
	public Property(String name, String owner, String type, long price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getOwner() {
		return owner;
	}
	public String getType() {
		return type;
	}
	public long getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public void displayInto() {
		System.out.println("=============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwner());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格：" + getPrice() + "円");
	}
}
