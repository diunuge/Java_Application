package java_app;

public class Dog implements Pet {

	@Override
	public void run() {
		System.out.println("running!");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping!");
	}

}
