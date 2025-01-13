//Shawn Nguru
public class StringPractice {
  public static void main(String[] args) {
        // Create a string with at least 5 characters and assign it to a variable
        String five = "fifth";

        // Find the length of the string
        five.length();

        // Concatenate (add) two strings together and reassign the result
        String ten = five + "sixth";

        // Find the value of the character at index 3
        System.out.println(ten.charAt(3));

        // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
        System.out.println(ten.contains("six"));

        // Iterate over the characters of the string, printing each one on a separate line
        for (int i = 0; i < ten.length(); i++)
        {
            System.out.println(ten.charAt(i));
        }
        // Create an ArrayList of Strings and assign it to a variable
        // Add multiple strings to the List (OK to do one-by-one)
        ArrayList<String> var  = new ArrayList<>();
        var.add("all");
        var.add("of");
        var.add("the");
        var.add("string");

        // Join all-of-the strings in the list together into a single string separated by commas
        // Use a built-in method to achieve this instead of using a loop
        String joined = String.join(",", var);
        // Check whether two strings are equal
        System.out.println(joined);
  }
}
