package main;

public class MavenClass {

	int someFunct(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		MavenClass main = new MavenClass();
		
		main.someFunct(a, b);
	}

}
