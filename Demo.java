import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
      int policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      boolean smokingStatus;
      int height;
      int weight;
      
      String input;
      char smoke;
      Scanner scan = new Scanner(System.in);
      
      // Request policy number
      System.out.print("\nPlease enter the Policy Number: ");
      policyNumber = scan.nextInt();
        
      // Request provider name
      System.out.print("\nPlease enter the Provider name: ");
      providerName = scan.next();
      
      //Request first name
      System.out.print("\nPlease enter the Policyholder's first name: ");
      firstName = scan.next();
      
      //Request last name
      System.out.print("\nPlease enter the Policyholder's last name: ");
      lastName = scan.next();     
      
      //Request age
      System.out.print("\nPlease enter the Policyholder's age: ");
      age = scan.nextInt();   
      
      //Get smoking status
      System.out.print("\nPlease enter the Policyholder's Smoking Status. Y or N: ");
      input = scan.next();
      smoke = input.charAt(0);
      if (smoke == 'Y' || smoke == 'y') {
         smokingStatus = true;
      }
      else {
      smokingStatus = false;
      }  
      
      //get height
      System.out.print("\nPlease enter the Policyholder's height in inches: ");
      height = scan.nextInt();
      
      //get weight
      System.out.print("\nPlease enter the Policyholder's weight in pounds: ");
      weight = scan.nextInt();
         
        
      //Create new policy by calling constructor
      Policy policy1 = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
       
      //Display all info for account
      policy1.print();
    }
}
