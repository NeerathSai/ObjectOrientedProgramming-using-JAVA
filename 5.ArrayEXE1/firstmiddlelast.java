import java.util.Scanner;



public class FirstLastMiddle {
int sum=0;
int arr[];
static int arrsize;
FirstLastMiddle(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array: ");
arrsize=sc.nextInt();


}

int Even() {
Scanner sc=new Scanner(System.in);

int arr[]=new int[arrsize];
for(int i=0;i<arrsize;i++) {
System.out.println("Please enter the " + (i+1) + " element of the array: ");
arr[i]=sc.nextInt();
}
sum=arr[0]+arr[arrsize-1];
System.out.println("Size of the array is Even");
System.out.println("Sum= "+ sum);
return sum;
}

int Odd() {
Scanner sc=new Scanner(System.in);

int arr[]=new int[arrsize];
for(int i=0;i<arrsize;i++) {
System.out.println("Please enter the " + (i+1) + " element of the array: ");
arr[i]=sc.nextInt();
}
sum=arr[0]+arr[(arrsize-1)]+arr[((arrsize-1)/2)];
System.out.println("Size of the array is Odd");
System.out.println(sum);
return sum;
}

public static void main(String[] args) {
FirstLastMiddle sample=new FirstLastMiddle();

if(arrsize%2!=0) {
sample.Odd();
}
else {
sample.Even();
}

}
