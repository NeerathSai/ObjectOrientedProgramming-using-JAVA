import java.util.Scanner;
public class Taxi {
double fare;
void DistanceTravelled(double fare){
if(fare<0) {
System.out.println("Error");
}
if(fare>0 && fare<=50) {
System.out.println("Distance Travelled: " + fare/10.00 + " km.");
}
if(fare>50 && fare<=130) {
System.out.println("Distance Travelled: " + (5.00+(fare-50.00)/8.00) + " km.");
}
if(fare>130 && fare<=180) {
System.out.println("Distance Travelled: " + (15.00+(fare-130.00)/5.00) + " km.");
}
if(fare>180 && fare<=300) {
System.out.println("Distance Travelled: " + (25.00+(fare-180.00)/5.00) + " km.");
}
if(fare>300) {
System.out.println("The Maximum Fare Is 300");
}
}
public static void main(String[] args) {
Scanner S=new Scanner(System.in);
System.out.println("Enter Fare: ");
double fare=S.nextDouble();
Taxi Sample=new Taxi();
Sample.DistanceTravelled(fare);
}
}