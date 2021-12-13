
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Dame un num: ");
		int num = Console.readInt();

		
		for(int i = num-1; i>0; i--) {
			num = num*i;
		}
		System.out.println(num);
	}

}
