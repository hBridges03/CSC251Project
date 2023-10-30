public class Policy
{
//define class attributes
   private int policyNumber;
   private String providerName;
   private double price = 0.0;
   private PolicyHolder policyHolder; //Instance of the PolicyHolder class
   private static int instanceCount = 0; //static field to track number of policy objects

   /* Constructor to initialize fields
   @param num - policy umber
   @param name - provider name
   @param holder - a PolicyHolder object
   */
   public Policy(int num, String name, PolicyHolder holder)
   {
      policyNumber = num;
      providerName = name;
      policyHolder = new PolicyHolder(holder);
      instanceCount++; //increment static variable
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
      getInstanceCount method
      @return - return the instance count
  */
  public int getInstanceCount() {
  return instanceCount;
  }
   
    /*
      Calculates the policy price based on BMI, smoking status, and age.
      
      @return price
   */
   public double getPrice() {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;

      double bmi = policyHolder.getBMI();
     
      if(policyHolder.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(policyHolder.getBMI() > BMI_THRESHOLD)
         price += ((policyHolder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
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
