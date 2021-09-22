package projectgitdemo20;

public class DDArray {

	public static void main(String[] args) {
		
		int[][] values = {{1,2,3,},{4,5,6},{7,8,9}};
		
		for(int i=0; i< values.length; i++) {
			for(int j=0; j<values[i].length; j++) {
				System.out.print(values[i][j] + "\t");
			}
			System.out.println("");
		}
		
		int[][] contents = {{11,22,33,},{44,55,66},{77,88,99}};
		
		System.out.println("                              ");
		System.out.println("Loop using Enhanced for loop: ");
		for (int[] eachRow : contents) {
			for (int j : eachRow) {
				System.out.print(j + "\t");
			}
			System.out.println("");
		}
		

		
		

	}

}
