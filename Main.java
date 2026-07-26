import java.util.Scanner;
public class Main {
public static void main(String[] agrs){
    
  Scanner usar = new Scanner(System.in);  
  
  // input
  System.out.printf("Enter your name : ");
  String name = usar.nextLine();   
    
  System.out.printf("Enter your adg(y) : ");
  int adg = usar.nextInt();  
    
  System.out.printf("Enter your height(m) : ");
  double height = usar.nextDouble();  
    
  System.out.printf("Enter your weight(kg) : ");
  double weight = usar.nextDouble();  
   // BMI  
     double BMI = weight/(height*height);
  // output  
    
   System.out.printf("the name is : %s%n",name);
   System.out.printf("the adg is : %d years%n",adg); 
   System.out.printf("the height is : %.2f m%n",height); 
   System.out.printf("the weight is : %.1f km%n",weight); 
   System.out.printf("the BMI is : %.2f kg/m²%n",BMI);  
}   
}