package trail1;

public class Pattern {

	public static void main(String[] args) {
		int val=8;
		int pvot=val/2;
		for (int i=0;i<val;i++)
		{   System.out.print(" ");
			for(int j=0;j<val;j++) {
				if(i==0||i==val-1) {
					System.out.print("*");
				}
				else if(j==pvot) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
