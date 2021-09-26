public class DIMEN {
public static void main(String[] args) {
	int[][] a=new int[4][5];
	for(int x=0;x<=4-1;x++){
		for(int n=0;n<=5-1;n++){
			a[x][n]=34;
		}
	}
	for(int x=0;x<=4-1;x++){
		for(int n=0;n<=5-1;n++){
			System.out.println(a[x][n]);
		}
	}
}
}
