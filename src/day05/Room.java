package day05;

public class Room {

	private String type;
	private int size;
	private int price;
	private Breakfast breakfast;
	private Transport transport;
	
	public Room(String type, int size, int price, Breakfast breakfast, Transport transport) {

		this.type = type;
		this.size = size;
		this.price = price+breakfast.getPrice()*size+transport.getPrice();
		this.breakfast = breakfast;
		this.transport = transport;
	}


	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}

	public Breakfast getBreakfast() {
		return breakfast;
	}

	public Transport getTransport() {
		return transport;
	}
	

	@Override
	public String toString() {
		return "Room [type=" + type + ", size=" + size + ", price=" + price + ", breakfast=" + breakfast
				+ ", transport=" + transport + "]";
	}
	
	
	
	
}
