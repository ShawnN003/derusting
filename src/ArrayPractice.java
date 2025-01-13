public class ArrayPractice {
  public static void main(String[] args) {

        System.out.println("***************************************************");
        // Create an array of Strings of size 4
        String[] names = {"Kaladin", "Sam", "David", "Paul"};

        // Set the value of the array at each index to be a different String
        // It's OK to do this one-by-one
        names[0] = "Kal";
        names[1] = "Sammy";
        names[2] = "Dave";
        names[3] = "Saul";


        // Get the value of the array at index 2
        System.out.println(names[2]);

        // Get the length of the array
        int length = names.length;

        // Iterate over the array using a traditional for loop and print out each item
        for(int i = 0; i < length; i++)
        {
            System.out.println(names[i]);
        }

        // Iterate over the array using a for-each loop and print out each item
        for(String tag : names)
        {
            System.out.println(tag);
        }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
