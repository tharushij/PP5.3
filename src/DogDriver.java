public class DogDriver implements Comparable<Dog>
{
    public static void main (String[]args)
    {
        Dog dog1 = new Dog("Fang", "Husky", 5, 80);
        Dog dog2 = new Dog("Nutmeg", "Australian Sheepdog", 12, 45);
        Dog dog3 = new Dog("Thea", "German Shepherd", 3, 60);

        System.out.println("Fang's breed and age: ");
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

        System.out.println("Nutmeg's weight: ");
        System.out.println(dog2.toKilos());

        System.out.println("My dog's information: ");
        System.out.println(dog3.toString());
        // System.out.println(Dog.getCount());

        int comp1 = dog1.compareTo(dog2);
        if(comp1 == 1)
        {
            System.out.println("Dog 1 is older than Dog 2.");
        } //end if statement
        else if(comp1 == 0)
        {
            System.out.println("They are the same age.");
        } //end else if
        else
        {
            System.out.println("Dog 1 is younger than Dog 2.");
        } //end else

        int comp2 = dog2.compareTo(dog3);
        if(comp2 == 1)
        {
            System.out.println("Dog 2 is older than Dog 3.");
        } //end if statement
        else if(comp2 == 0)
        {
            System.out.println("They are the same age.");
        } //end else if
        else
        {
            System.out.println("Dog 2 is younger than Dog 3.");
        } //end else


    } //end method main

    //@Override
    public int compareTo(Dog o) {
        return 0;
    }
} //end class DogDriver