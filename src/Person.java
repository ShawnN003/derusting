//Shawn Nguru
/*
 * In this file you will follow the comments' instructions to complete
 * the Person class.
 */

public class Person {
    // Declare a public String instance variable for the name of the person
    public String name;
    // Declare a private int instance variable for the age of the person
    private int age;

    // Create a constructor that takes the name and age of the person
    // and assigns it to the instance variables

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    // Create a toString method that gives the name and age of the person
    public String toString()
    {
        return name + " " + age;
    }


    // Implement the below public instance method "birthYear"
    // There should NOT be any print statement in this method.
    /**
     * birthYear returns the year the person was born.
     *
     * The birth year is calculated by subtracting the person's age from currentYear
     * that's passed in as an int. It assumes that the person's birthday has already
     * passed this year.
     *
     * @param currentYear an int for the current year
     * @return The year the person was born
     */

    public int birthYear(int currentYear)
    {
        return currentYear - age;
    }
}

  public static void main(String[] args) {
        Person dude = new Person("Shawn",22);
        Person girl = new Person("Alex",23);

        // Create another instance of Person with a different name and age and
        // assign it to a different variable

        // Print the first person
        System.out.println(dude);
        // Print the second person
        System.out.println(girl);

        // Get the name of the first person and store it in a local variable
        String name = dude.name;
        // Using the birthYear method, get the birth year of the first person
        // and store it in a local variable. Input the actual current year (e.g. 2025)
        // as the argument.

        // In a separate statement, print the local variable holding the birth year.
        int age = dude.birthYear(2025);
        System.out.println(age);
        System.out.println("***************************************************");
        /**
         * Person
         */

        // Create a float with a negative value and assign it to a variable
        float negativeVal = -12;

        // Create an int with a positive value and assign it to a variable
        int positiveVal = 3;

        // Use the modulo % operator to find the remainder when the int is divided by 3
        System.out.println(positiveVal%3);

        // Use the modulo % operator to determine whether the number is even
        // (A number is even if it has a remainder of zero when divided by 2)
        // Use an if-else to print "Even" if the number is even and "Odd"
        // if the number is odd.
        if(negativeVal%2 ==0)
        {
            System.out.println("Even");
        }
        System.out.println("Odd");

        // Divide the number by another number using integer division
        float solution = positiveVal/negativeVal;
        /*
         * Reminder!
         *
         * When dividing ints, the result is rounded down.
         * Example:
         * 7 / 3 = 2 when performing int division
         */
    /**
     * Terminology!
     * 
     * A class is the overall definition, like a blueprint.
     * An instance is a specific object made according to that definition.
     * We use "instance" and "object" to mean the same thing.
     * 
     * For example, if there is a Person class, we can make an instance of a specific person: Auberon.
     * 
     * There can be many instances for the same class. For example: Auberon, Xinting, Baya are all
     * different instances of the Person class.
     * 
     * Each instance has its own instance variables: Auberon's age can be different from Baya's age.
     */
  }
}
