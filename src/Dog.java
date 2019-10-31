public class Dog implements Comparable<Dog>
{
    //Initializations
    private String name, breed;
    private int age, weight;
    private static int count;
    public Dog()
    {
        name = "Spot";
        breed = "Labrador";
        age = 5;
        weight = 60;
        count += 1;
    }
    public Dog(String name, String breed, int age, int weight)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        count += 1;
    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age;
    }
    public int getWeight()
    {
        return weight;
    }
    public double toKilograms()
    {
        final double CONVERSION_FACTOR = 0.452592;
        return weight * CONVERSION_FACTOR;
    }
    public String toString()
    {
        String output = "";
        output += "Dog's name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight + " lbs";
        return output;
    }
    public static int getCount()
    {
        return count;
    }
    public int compareTo(Dog someDog)
    {
        int dogAge = someDog.getAge();
        if (dogAge < age)
        {
            return 1;
        }
        else if (dogAge == age)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
