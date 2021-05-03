package entities;

public class Game {

	private int id ;
	private String name ;
	private double price ;
	private int difficulty ;
	private int star;
	
	public Game() {}
	
	public Game(int id, String name, double price, int difficulty , int star) {
		
		this.id         = id;
		this.name       = name;
		this.price      = price;
		this.difficulty = difficulty;
		this.star       = star ;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
}
