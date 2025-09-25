
import java.util.Scanner;
public class filledkshape {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	* Read input as specified in the question.
	* Print output as specified in the question.
		*/
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i =n;i>0;i--){
	for(int j=i;j>0;j--){
		System.out.print(j+" ");
	}
	System.out.println();
}
for(int i=2;i<=n;i++){
	for(int j=i;j>0;j--){
		System.out.print(j+" ");
	}
	System.out.println();
}
		
	}

}
