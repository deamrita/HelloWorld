public class Hello {

	public static void main(String[] args) {
		int n=10;
		int s=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				s=s+j;
			}
		}
		System.out.println("the sum is "+s);
	}

}