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
   public void setPolicyNumber(int number) {
      policyNumber = number;   
   }
   public void setProviderName(String name) {
      providerName = name;
   }
   public void setFirstName(String first) {
      firstName = first;
   }
   public void setLastName(String last) {
      lastName = last;
   }
   public void setAge(int a) {
      age = a;
   }
   public void setSmokingStatus(boolean smoke) {
      smokingStatus = smoke;
   }
   public void setHeight(int h) {
   height = h;
   }
   public void setWeight(int w) {
   weight = w;
   }
   
   //getters for all fields
   public int getPolicyNumber() {
   return policyNumber;
   }
   public String getProviderName() {
   return providerName;
   }
   public String getFirstName() {
   return firstName;
   }
   public String getLastName() {
   return lastName;
   }
   public int getAge() {
   return age;
   }
   public boolean getSmokingStatus() {
   return smokingStatus;
   }
   public int getHeight() {
   return height;
   }
   public int getWeight() {
   return weight;
   }
   
   //calculate the policyholder's BMI
   public double getBMI() {
   double bmi;
   bmi = ((weight * 703) / (height* height));
   return bmi;
   }
   
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
   
   //print class information
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
