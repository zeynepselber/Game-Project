package entities;

public class Campaign {

	private int id ; 
	private String name ;
	private double discountPercent ;
	private int duration ;
	
	public Campaign() {}
	
	public Campaign(int id, String name, double discountPercent, int duration) {
		this.id              = id;
		this.name            = name;
		this.discountPercent = discountPercent;
		this.duration        = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
