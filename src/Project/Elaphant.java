package Project;

public class Elaphant {
	int mood;
	String name;

	Elaphant(int moodnum, String wordname) {
		this.mood = moodnum;
		this.name = wordname;
	}

	void trump() {
		System.out.println("VROOO!!!");
	}

	void stomp() {
		System.out.println("Blam! Blam! Blam!");
	}
}