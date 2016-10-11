package animals;

public class Dog {

	public Dog() {
		// TODO Auto-generated constructor stub
		move(3);
	}
	private static void move(int steps){
		int start = 0;
		int destination = start+1;
		System.out.println("Dog moved " + destination + " steps" + move(4));
	}
	
	public static void main(String[] args){
		move(2);
	}
}
