package jyothijo;

public class Demo {
		   public static void main(String args[]){
		      int a[][]={{1,2},{3,4}};
		      int b[][] = new int[2][2];
		      System.out.println("Original matrix : ");
		      for(int i = 0; i<2 ;i++){
		         for(int j = 0; j<2 ;j++){
		            System.out.print(a[i][j]+" ");
		         }
		         System.out.println();
		      }
		      System.out.println("Transposed matrix : ");
		      for(int i = 0; i<2 ;i++){
		         for(int j = 0; j<2 ;j++){
		            b[i][j] = 0;
		            for(int k = 0; k<2 ;k++){
		               b[i][j] = a[j][i];
		            }
		            System.out.print(b[i][j]+" ");
		         }
		         System.out.println();
		      }
		   }
		}
   

	


