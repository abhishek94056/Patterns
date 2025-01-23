package patterns;

public class second {

	public static void main(String[] args) {
		// reverse right half pyramid
		for(int i = 5;i!=0;i--)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
