public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", "Husky",5, 80);
        Dog dog2 = new Dog("Nutmeg","Australian Sheepdog", 12, 45);
        Dog dog3 = new Dog("Joe Biden", "Democrat",76, 190);

        System.out.println(dog1.getBreed() + " is " + dog1.getAge());
        System.out.println(dog2.getName() + " is " + dog2.getWeight() + " pounds.");
        System.out.println(dog3.toString());
        System.out.println("I have " + Dog.getCount() + " dogs.");

        if (dog2.compareTo(dog1) > 0) {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        } else if (dog2.compareTo(dog1) < 0) {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        } else if (dog2.compareTo(dog1) == 0) {
            System.out.println(dog2.getName() + " is as old as " + dog1.getName());
        }

        if (dog3.compareTo(dog1) > 0) {
            System.out.println(dog3.getName() + " is older than " + dog1.getName());
        } else if (dog3.compareTo(dog1) < 0) {
            System.out.println(dog3.getName() + " is older than " + dog1.getName());
        } else if (dog3.compareTo(dog1) == 0) {
            System.out.println(dog3.getName() + " is as old as " + dog1.getName());
        }

    }
}
