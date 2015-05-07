package try_github;

public class Main {

	public static void main(String[] args) {
		int x=140 , y=100;
		Sub subtraction = new Sub();
		Add additon = new Add();

		int solution1 = additon.sub(x, y);
		System.out.println(solution1 );
		System.out.println("足し算をしました");

		int solution2 = subtraction.sub(x, y);
		System.out.println(solution2 );
		System.out.println("引き算をしました");
	}

}
