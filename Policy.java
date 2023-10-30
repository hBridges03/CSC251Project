import java.text.NumberFormat;


public class Policy
{
//define class attributes

   private double price = 0.0;
   
   //currency format
   NumberFormat fmt = NumberFormat.getCurrencyInstance(); 

   
   //setters for all fields
   
   //getters for all fields
   
    /*
      Calculates the policy price based on BMI, smoking status, and age.
      
      @return price
   */
   public double policyPrice() {
   price = 600;
   double bmi = getBMI();
  
   if (age > 50){
   price += 75;
   }
   
   if (smokingStatus == "smoker") {
   price += 100;
   }
   
   if (bmi > 35) {
   price += (bmi - 35) * 20;
   }
   return price;
   }
   
   /*
      Prints and formats class information.
   */
   public void print() {
   double bmi = getBMI();
   double price = policyPrice();
 
   //print all class attributes
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      System.out.println("Policyholder's Height: " + height);
      System.out.println("Policyholder's Weight: " + weight);
      System.out.println("Policyholder's BMI: " + bmi);    
      System.out.println("Policy Price: " + fmt.format(price));
   }
   
}
