package Array;

public class Transposematrix {

	public static void main(String[] args) {
		int b[][]={{1,2},{3,4}};
		int a[][]= new int[2][2]; 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j] = b[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");	
		}
		System.out.println("Printing transported array:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
}
}