package com.ArrayPrograms;



public class LowerTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int M[][] = new  int[][]
				{
			    {1,2,3},
			    {4,5,6},
			    {7,8,9}	
				};
				
				int Lower [][]=new int[3][3]; 
				int Upper [][]=new int[3][3];
				int row,col;
				row =M.length;
				col = M.length;
				if(row!=col)
				{
					System.out.println("The Given Matrix is Not Square Matrix ");
				}else {
				System.out.println("Lower Triangle Matrix is: ");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if(j>i)
							Lower[i][j] = 0;
						else 
							Lower[i][j] = M[i][j];
						System.out.print(Lower[i][j]+"  ");
					}
					System.out.println();
				}
				
				System.out.println("Upper Triangle Matrix is: ");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if(j<i)
							Upper[i][j] = 0;
						else 
							Upper[i][j] = M[i][j];
						System.out.print(Upper[i][j]+"  ");
					}
					System.out.println();
				}
				}
		
	}

}
