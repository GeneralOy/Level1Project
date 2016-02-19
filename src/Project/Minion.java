package Project;

public class Minion {
	String name;
	int eyes;
	String color;
	String master;

	public Minion(String name, int eyes, String color, String master) {
		this.master = master;
		this.eyes = eyes;
		this.color = color;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getEyes() {
		return eyes;
	}

	public String getColor() {
		return color;

	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String newmaster) {
		this.master = newmaster;
	}
}
