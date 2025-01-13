

public class MapPractice {
  public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values and
        // assign it to a variable of type Map
        Map<String,Integer> maps = new HashMap<>();

        // Put 3 different key/value pairs in the Map
        // (it's OK to do this one-by-one)
        maps.put("Kal",1);
        maps.put("Dalinar",2);
        maps.put("Shallan",3);

        // Get the value associated with a given key in the Map
        System.out.println(maps.get("Dalinar"));

        // Find the size (number of key/value pairs) of the Map
        System.out.println(maps.size());

        // Replace the value associated with a given key (the size of the Map should not change)
        maps.put("Kal",100);
        System.out.println(maps);

        // Check whether the Map contains a given key
        if(maps.containsKey("Dalinar"))
        {
            System.out.println("The Goat");
        }
        // Check whether the Map contains a given value
        if(maps.containsValue(1))
        {
            System.out.println("Kal The Goat");
        }
        else System.out.println("N/A");

        // Iterate over the keys of the Map, printing each key
        for(String i : maps.keySet())
        {
            System.out.println(i);
        }
        // Iterate over the values of the map, printing each value
        for(Integer i : maps.values())
        {
            System.out.println(i);
        }

        // Iterate over the entries in the map, printing each key and value
        for(String i : maps.keySet())
        {
            System.out.println("Key: " + i);
            System.out.println("Value: " + maps.get(i));
        }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
