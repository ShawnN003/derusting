//Shawn Nguru
public class SetPractice {
  public static void main(String[] args) {
        // Create a HashSet of Strings and assign it to a variable of type Set
        Set<String> set = new HashSet<>();

        // Add 3 elements to the set
        // (It's OK to do it one-by-one)
        set.add("Running");
        set.add("Out");
        set.add("of Ideas");

        // Check whether the Set contains a given String
        if(set.contains("Out"))
        {
            System.out.println("Out");
        }
        // Remove an element from the Set
        set.remove("of Ideas");

        // Get the size of the Set
        System.out.println(set.size());

        // Iterate over the elements of the Set, printing each one on a separate line
        for(String s : set)
        {
            System.out.println(s);
        }

  }
}
