package patterns;

public class nine {

	public static void main(String[] args) {
		// rhombus pattern
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=5;l++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
