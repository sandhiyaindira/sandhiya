import java.util.Scanner;
public class leastnum {
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		String num=String.valueOf(num1);
		System.out.println("Enter the k");
		int k=in.nextInt();
		char c[]=num.toCharArray();
	char temp;
		for(int i=0;i<c.length-1;i++){
			for(int j=i+1;j<c.length;j++){
			if(c[i]>c[j]){
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				}}}
		System.out.println("The least number is:");
			for(int i=0;i<(c.length-k);i++){
				System.out.print(c[i]);
			}}}
