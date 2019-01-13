public class Person {
    private int counter;
    private String firstName;
    private String lastName;
    private String address;
    private int dateOfBirth;
    private String nationality;
    private String city;
    private int weight;
    private int height;
    private Boolean isMale;

    public Person(){
        this.counter = 0;
        this.firstName = "Sonia";
        this.lastName = "Kaboor";
        this.address = "Bollywood";
        this.dateOfBirth = 1980;
        this.nationality = "indian";
        this.city = "Mombi";
        this.weight = 50;
        this.height = 165;
        this.isMale = false;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public int getDataOfBirth(){
        return dateOfBirth;
    }
    public String getNationality(){
        return nationality;
    }
    public String getCity(){
        return city;
    }
    public int getWeight(){
        return weight;
    }
    public int getHeight(){
        return height;
    }
    public Boolean getIsMale(){
        return isMale;
    }



    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String setLastName(String lastName){
        return this.lastName = lastName;
    }
    public String setAddress(String address){
        return this.address = address;
    }
    public int setDataOfBirth(int dateOfBirth){
        return dateOfBirth = dateOfBirth;
    }
    public String setNationality(String nationality){
        return this.nationality = nationality;
    }
    public String setCity(String city){
        return this.city = city;
    }
    public int setWeight(int weight){
        return this.weight = weight;
    }
    public int setHeight(int height){
        return this.height = height;
    }
    public Boolean setIsMale(Boolean isMale){
        return this.isMale = isMale;
    }

    public Person(int counter, String firstName, String lastName,  String address, int dateOfBirth, String nationality, String city, int weight, int height, Boolean isMale){
        this.counter = counter+1;
    }




    public String getFullName(){
        return firstName + " " + lastName;
    }

    public double getHeightInFeet(){
        return height / 33.1;
    }

    public int getAge(){
        return 2019 - dateOfBirth;
    }

    public void eating(){
        System.out.println("I'm eating!");
        this.weight += 1;
        System.out.println(weight);
    }

    public void getInfo(){
        System.out.println(counter);
        System.out.println(address);

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(dateOfBirth);
        System.out.println(nationality);

        System.out.println(city);
        System.out.println(weight);

        System.out.println(height);
        System.out.println(isMale);
    }
}
