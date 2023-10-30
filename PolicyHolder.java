/*
create the policy holder class.
*/
public class PolicyHolder
{
//define class attributes
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private int height;
   private int weight;
   private double bmi = 0.0;

   //default constructor
   public PolicyHolder()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0;
      weight = 0;
   }
   
   //fully initiated constructor
   public PolicyHolder(int num, String name, String first, String last, int a, String smoke, int h, int w) 
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
   public void setSmokingStatus(String smoke) {
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
   public String getSmokingStatus() {
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
   bmi = ((weight * 703) / (height* height));
   return bmi;
   }
   


}