public class Policy
{
//define class attributes
   private int policyNumber;
   private String providerName;
   private double price = 0.0;
   private PolicyHolder policyHolder; //Instance of the PolicyHolder class

   //default constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
   }
   //fully initiated constructor
   public Policy(int num, String name, PolicyHolder holder)
   {
      policyNumber = num;
      providerName = name;
      policyHolder = new PolicyHolder(holder);

   }

   
   //setters for all fields
   
   /*
      Sets the value for the policy number.
      
      @param number - policy number
   */
   public void setPolicyNumber(int number) {
      policyNumber = number;   
   }

   /*
      Sets the value for the provider name.
      
      @param name - provider name
   */
   public void setProviderName(String name) {
      providerName = name;
   }
   
   /**
      @param holder - a PolicyHolder object  
   */   
   public void setPolicyHolder(PolicyHolder holder) {
      policyHolder = new PolicyHolder(holder);
   }
   
   //getters for all fields
   /*
      Returns the value for the policy number.
      
      @return policyNumber
   */
   public int getPolicyNumber() {
   return policyNumber;
   }
   /*
      Returns the value for the provider name.
      
      @return providerName
   */
   public String getProviderName() {
   return providerName;
   }

  /**
      getPolicyHolder method
      @return - return a reference to a copy of this policy's PolicyHolder object
  */
  public PolicyHolder getPolicyHolder() {
     return new PolicyHolder(policyHolder);
  }
   
    /*
      Calculates the policy price based on BMI, smoking status, and age.
      
      @return price
   */
   public double getPrice() {
      price = 600;
      double bmi = policyHolder.getBMI();
     
      if (policyHolder.getAge() > 50){
         price += 75;
      }
      
      if (policyHolder.getSmokingStatus() == "smoker") {
         price += 100;
      }
      
      if (bmi > 35) {
         price += (bmi - 35) * 20;
      }
      return price;
   }
   
   
  /**
      toString method
      @return - A string containing the policy information
  */ 
      public String toString()
   {
         return String.format("Policy Number: " + policyNumber + "\nProvider Name: " + providerName + "\n" + policyHolder.toString() +
             "\nPolicy Price: $%.2f", getPrice());
   }
}
