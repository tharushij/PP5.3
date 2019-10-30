public class Dog
{
    private String name, breed;
    private int age;
    private double weight;
    private static int dogCount; //a static variable


    public Dog()
    {
        name = null;
        breed = null;
        age = 0;
        weight = 0;
        dogCount = 0;
    } //default constructor

    public Dog(String name, String breed, int age, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        dogCount++;
    } //full constructor


    //getters
    public String getName()
    {
        return name;
    } //end getName getter

    public String getBreed()
    {
        return breed;
    } //end getBreed getter

    public int getAge()
    {
        return age;
    } //end getAge getter

    public double getWeight()
    {
        return weight;
    } //end getWeight getter

    public int getDogCount()
    {
        return dogCount;
    }


    //setters
    public void setName(String newName)
    {
        name = newName;
    } //end setName setter

    public void setBreed(String newBreed)
    {
        breed = newBreed;
    } //end setBreed setter

    public void setAge(int newAge)
    {
        age = newAge;
    } //end setAge setter

    public void setWeight(double newWeight)
    {
        weight = newWeight;
    } //end setWeight setter


    //brain method(s)
    public String toKilos()
    {
        double weight2 = 0.0;
        weight2 = this.weight * 0.45392;

        String output = "";
        output = weight2 + " kilograms";
        return output;
    } //end brain method to convert to kg

    public int compareTo(Dog someDog)
    {
        if(this.age < someDog.age)
        {
            return -1;
        }
        else if(this.age == someDog.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    } //end compareTo implemented from interface Comparable

    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nBreed: " + breed;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;
        output += "\nHow many dogs I have:\n" + dogCount;

        return output;
    } //end toString



} // end class Dog