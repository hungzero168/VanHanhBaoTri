package Models;

public class Product {
	private int Id;
	private String Name;
	private float Price;
	private String Description;
	private String ImageLink;
	public Product(int id, String name, float price, String description, String imageLink) {
		super();
		Id = id;
		Name = name;
		Price = price;
		Description = description;
		ImageLink = imageLink;
	}
	
	public Product(String name, float price, String description, String imageLink) {
		super();
		Name = name;
		Price = price;
		Description = description;
		ImageLink = imageLink;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImageLink() {
		return ImageLink;
	}
	public void setImageLink(String imageLink) {
		ImageLink = imageLink;
	}
}
