package animals;

public class Cat extends Animal {

	public Cat(int size) {
		super(size);
		// TODO Auto-generated constructor stub
		size=0;
	}

	@Override
	public void move(int steps) {
		// TODO Auto-generated method stub
		steps = 0;
		int destination = steps+4;
		System.out.println("Mause moved " + destination + " steps");
	}
	public static void main(String[] args){
		Mause.move(destination);
	}
}
