package tw.iii.matt;

public class MATT01 {

	public static void main(String[] args) {
		int[][] a;
		int[] b[];
		int c[][];
		a = new int[2][];
		a[0] = new int[4];
		a[1] = new int[2];
		for (int i=1; i<a.length; i++){
			for (int j=0; j<a[i].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
