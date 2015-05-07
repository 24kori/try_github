package try_github;

public class Main {

	public static void main(String[] args) {
		int x=140 , y=100;
		Sub subtraction = new Sub();
		Add additon = new Add();
		Mult multiplication = new Mult();
		Division divi = new Division();

		int solution1 = additon.add(x, y);
		System.out.println(solution1 );
		System.out.println("足し算をしました");

		int solution2 = subtraction.sub(x, y);
		System.out.println(solution2 );
		System.out.println("引き算をしました");
		
		int solution3 = multiplication.mult(x, y);
		System.out.println(solution3 );
		System.out.println("掛け算をしました");		
		
		int solution4 = divi.div(x, y);
		System.out.println(solution4 );
		System.out.println("割り算しました");			
		
	}

}
