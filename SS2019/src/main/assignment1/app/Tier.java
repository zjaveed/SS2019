package assignment1.app;

public class Tier extends Lebenswesen {
	private int size;
	private int weight;

	public Tier(int size, int weight) {
		this.size = size;
		this.weight = weight;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return this.weight;

	}

	public String toString() {

		return "this Tier has size: " + this.size() + " and weight: " + this.weight();

	}

}