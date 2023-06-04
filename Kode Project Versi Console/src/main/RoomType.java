package main;

public class RoomType {
	private int TypeID;
	private String Name;
	private int Price;

	// deign smell encapsulation: self encapsulate field
	public RoomType(int TypeID) {
		if(TypeID == 1) {
			// encapsulation: magic number 
			this.Name = "VIP";
			this.Price = 500000;
		}else if(TypeID ==2) {
			this.Name = "Family";
			this.Price = 250000;
		}else if(TypeID == 3) {
			this.Name = "Personal";
			this.Price = 100000;
		}
	}

	public int getTypeID() {
		return TypeID;
	}


	public String getName() {
		return Name;
	}


	public int getPrice() {
		return Price;
	}
	

	public void  setName(String name){
		this.Name = name;
	}
	
	public void  setPrice(String name){
		this.Name = name;
	}
}