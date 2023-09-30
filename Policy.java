import java.text.NumberFormat;


public class Policy
{
//define class attributes
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private boolean smokingStatus;
   private int height;
   private int weight;
   
   //currency format
   NumberFormat fmt = NumberFormat.getCurrencyInstance(); 

   
   //default constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = false;
      height = 0;
      weight = 0;
   }
   
   //fully initiated constructor
   public Policy(int num, String name, String first, String last, int a, boolean smoke, int h, int w) 
   {
      policyNumber = num;
      providerName = name;
      firstName = first;
      lastName = last;
      age = a;
      smokingStatus = smoke;
      height = h;
      weight = w;     
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
   /*
      Sets the value for the first name.
      
      @param first - first name
   */
   public void setFirstName(String first) {
      firstName = first;
   }
   /*
      Sets the value for the last name.
      
      @param last - last name
   */
   public void setLastName(String last) {
      lastName = last;
   }
   /*
      Sets the value for the age.
      
      @param a - age
   */
   public void setAge(int a) {
      age = a;
   }
   /*
      Sets the smoking status.
      
      @param smoke - smoking status 
   */
   public void setSmokingStatus(boolean smoke) {
      smokingStatus = smoke;
   }
   /*
      Sets the value for height.
      
      @param h - height
   */
   public void setHeight(int h) {
   height = h;
   }
   /*
      Sets the value for weight.
      
      @param w - weight
   */
   public void setWeight(int w) {
   weight = w;
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
   /*
      Returns the value for the first name.
      
      @return firstName
   */
   public String getFirstName() {
   return firstName;
   }
   /*
      Returns the value for the last name.
      
      @return lastName
   */
   public String getLastName() {
   return lastName;
   }
   /*
      Returns the value for the age.
      
      @return age
   */
   public int getAge() {
   return age;
   }
   /*
      Returns the smoking status.
      
      @return smokingStatus
   */
   public boolean getSmokingStatus() {
   return smokingStatus;
   }
   /*
      Returns the height.
      
      @return height
   */
   public int getHeight() {
   return height;
   }
   /*
      Returns the weight.
      
      @return weight
   */
   public int getWeight() {
   return weight;
   }
   
   
   /*
      Calculates the BMI by using the BMI formula. 
      
      @return bmi
   */
   public double getBMI() {
   double bmi;
   bmi = ((weight * 703) / (height* height));
   return bmi;
   }
   
    /*
      Calculates the policy price based on BMI, smoking status, and age.
      
      @return price
   */
   public double policyPrice() {
   double price = 600;
   double bmi = getBMI();
  
   if (age > 50){
   price += 75;
   }
   
   if (smokingStatus = true) {
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
   String smoker;
   double bmi = getBMI();
   double price = policyPrice();
   //convert boolean to proper string
   if (smokingStatus = true) {
   smoker = "smoker";
   } else {
   smoker = "non-smoker";
   }
   //print all class attributes
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status: " + smoker);
      System.out.println("Policyholder's Height: " + height);
      System.out.println("Policyholder's Weight: " + weight);
      System.out.println("Policyholder's BMI: " + bmi);    
      System.out.println("Policy Price: " + fmt.format(price));
   }
   
}
