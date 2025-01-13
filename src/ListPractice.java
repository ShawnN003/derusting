//Shawn Nguru
public class ListPractice {


  public static void main(String[] args) {
        // Create an empty ArrayList of Strings and assign it to a variable of type List
        ArrayList<String> list = new ArrayList<String>();

        // Add 3 elements to the list (OK to do one-by-one)
        list.add("one");
        list.add("two");
        list.add("three");

        // Print the element at index 1
        System.out.println(list.get(1));

        // Replace the element at index 1 with a new value
        // (Do not insert a new value. The length of the list should not change)
        list.set(1,"dos");
        System.out.println("list: " + list);

        // Insert a new element at index 0 (the length of the list will change)
        list.add(0,"zero");
        System.out.println("list: " + list);

        // Check whether the list contains a certain string
        if(list.contains("three"))
        {
            System.out.println("It contains that value!");
        }

        // Iterate over the list using a traditional for-loop.
        // Print each index and value on a separate line

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(i+".) " + list.get(i));
        }

        // Sort the list using the Collections library
        Collections.sort(list);

        // Iterate over the list using a for-each loop
        // Print each value on a second line
        for(String i : list)
        {
            System.out.println(i);
        }


    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}