package javaproject;

public class RevisionAllA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Fishes f = new Fishes("Shark", 50);
		System.out.println(f.name);
		System.out.println(f.weight);
		f.swim();
	
		
		
		
		
	}
}
class Fishes{
	String name;// = "shark";
	int weight; //= 50;
	static String color = "white";
	public Fishes(String nm, int wt) {
		this.name = nm;
		this.weight = wt;
	}
	public void swim() {
		System.out.println("i can swim in water");
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}