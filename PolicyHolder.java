class PolicyHolder {

   private String first_name;
   private String last_name;
   private int age;
   private String smoking_status; // Either "smoker" or "non-smoker"
   private double height; // in inches
   private double weight; // in pounds
   
   /**
     * Args constructor
     *
     * @param first_name    Policy holders first name
     * @param last_name  Policy holders last name
     * @param age  Policy holders age
     * @param smoking_status   Policy holder's smoking status 
     * @param height  Policy holder's height
     * @param weight  Policy holder's weight
     */
   public Policy(String first_name, 
   String last_name, int age, String smoking_status, 
   double height, double weight) 
   { 
      this.first_name = first_name;
      this.last_name = last_name;
      this.age = age;
      this.smoking_status = smoking_status;
      this.height = height;
      this.weight = weight;
   }
   
   
   /** Copy Constructor
      @param obj is the object to copy
   */
   public PolicyHolder(PolicyHolder obj)
   {
   
      this.first_name = obj.first_name;
      this.last_name = obj.last_name;
      this.age = obj.age;
      this.smoking_status = obj.smoking_status;
      this.height = obj.height;
      this.weight = obj.weight;
   }

   
   /**
     * Sets the policy holder's first name.
     *
     * @param first_name the policy holders first name
     */
   public void set_first_name(String first_name)
   {
      this.first_name = first_name;
   }
   
   /**
     * Sets the policy holder's last name.
     *
     * @param last_name the policy holders last name
     */
   public void set_last_name(String last_name)
   {
      this.last_name = last_name;
   }
   
   /**
     * Sets the policy holder's age.
     *
     * @param age the policy holders age name
     */
   public void set_age(int age)
   {
      this.age = age;
   }
   
   /**
     * Sets the policy holder's smoking status.
     *
     * @param smoking_status the policy holders smoking status
     */
   public void set_smoking_status(String smoking_status)
   {
      this.smoking_status = smoking_status;
   }
   
   /**
     * Sets the policy holder's height.
     *
     * @param height the policy holders height
     */
   public void set_height(double height)
   {
      this.height = height;
   }
   
   /**
     * Sets the policy holder's weight.
     *
     * @param weight the policy holders weight
     */
   public void set_weight(double weight)
   {
      this.weight = weight;
   }
   
   /**
     * Gets the policy holders first name.
     *
     * @return the policy holders first name as a String
     */
   public String get_first_name()
   {
      return this.first_name;
   }
   
   /**
     * Gets the policy holders last name.
     *
     * @return the policy holders last name as a String
     */
   public String get_last_name()
   {
      return this.last_name;
   }
   
   /**
     * Gets the policy holders age.
     *
     * @return the policy holders age as an in
     */
   public int get_age()
   {
      return this.age;
   }
   
   /**
     * Gets the policy holders smoking status.
     *
     * @return the policy holders smoking status as a String
     */
   public String get_smoking_status()
   {
      return this.smoking_status;
   }
   
   /**
     * Gets the policy holders height.
     *
     * @return the policy holders height as a double
     */
   public double get_height()
   {
      return this.height;
   }
   
   /**
     * Gets the policy holders height.
     *
     * @return the policy holders weight as a double
     */
   public double get_weight()
   {
      return this.weight;
   }

   /**
     * Calculates the BMI index
     * Uses the policy holder's weight and height
     *
     * @return the calculated BMI
     */
   public double calculate_body_mass_index()
   {
      return (weight * 703) / (height * height);
   }
   
   
   /** toString method
   @return a string containing the Policy Holder's information
   */
   public String toString()
   {
      return String.format("Policy holder's First Name: " + first_name +
             "\nPolicy Holder's Last Name: " + last_name +
             "\nPolicy Holder's Age: " + age + 
             "\nPolicy Holder's Smoking Status: " + smoking_status +
             "\nPolicy Holder's Height: " + height + 
             "\nPolicy Holder's Weight: " + weight + 
             "\nPolicy Holder's BMI: " + calculate_body_mass_index());
   }
   
}