import java.util.Scanner;

class Book{
int id;
String name;
double price[];
String author;
int NOB=0;


Book(int id,String name,double price,String author){
System.out.println("This book belongs to the "+name+" genre, with the ID number "+id+" and the price of the book is "+price);
System.out.println();
}

int getID(int id) {

System.out.println("ID of the book is: "+ id);
return id;
}

String getName(String name) {

System.out.println("The field name of the book is: "+ name);
return name;
}

double getPrice(double price) {

System.out.println("price of the book is: "+ price);
return price;
}

String getAuthor(String author) {
String author_UC=author.toUpperCase();
System.out.println("name of the author is: "+ author_UC +".");
return author_UC;
}



}




public class problem_1 {



public static void main(String[] args) {
int id[]=new int[5];
double price[]=new double[5];
String name[]=new String[5];
String author[]=new String[5];

Scanner sc=new Scanner(System.in);

int i=0;
System.out.println("enter number of books: ");
int NOB=sc.nextInt();
try {
for(i=0;i<NOB;i++) {
System.out.println("enter field name of the "+i+ " book: ");
name[i]=sc.next();

System.out.println("enter the ID of the "+i+ " book: ");

id[i]=sc.nextInt();



System.out.println("enter the price of the "+i+ " book: ");
price[i]=sc.nextDouble();

System.out.println("enter the author name of the "+i+ " book: ");
author[i]=sc.next();

Book B=new Book(id[i],name[i],price[i],author[i]);
B.getID(id[i]);
B.getName(name[i]);
B.getPrice(price[i]);
B.getAuthor(author[i]);
}}
catch(Exception e) {
System.out.println("enter a valid input.");
}
double cost=0;
for(i=0;i<=NOB;i++) {
cost=cost+price[i];

}
System.out.println("Total Cost=Rs."+cost);


}
}
