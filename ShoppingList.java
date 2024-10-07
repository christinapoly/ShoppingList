import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

public class ShoppingList {
  
    //constructor
    public ShoppingList() {

    }


    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> avail_map = new HashMap<>();
    HashMap<String, Integer> recipe_map = new HashMap<>();
    

  

    //methods
    
    public void read() {
      boolean recipe_line = false;      

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

        if (line == null || line.isEmpty()) {
          break;
        } else {

          if (line.startsWith("AVAILABLE")) {
            continue;
          } else if (line.startsWith("RECIPE")){
            recipe_line = true;
            continue;
          } else if (recipe_line){
            String[] ingredient = line.split(" ");

            int next = Integer.parseInt(ingredient[0]);
            String next2 = ingredient[1];
            String next3 = ingredient[2];

           if (next2.equals("kg")) {
              next = next * 1000;
            }

            if (recipe_map.containsKey(next3)) {
              recipe_map.replace(next3, next+recipe_map.get(next3));
            } else {          
            recipe_map.put(next3, next);
            }

          } else {
            String[] ingredient = line.split(" ");

            int next = Integer.parseInt(ingredient[0]);
            String next2 = ingredient[1];
            String next3 = ingredient[2];

            if (next2.equals("kg")) {
              next = next * 1000;
            }
          
            avail_map.put(next3, next);
           }

  
         }

        }
      }


    public void printShoppingList() {

      TreeMap<String, Integer> sorted_recipe = new TreeMap<>(recipe_map);

      System.out.println("Shopping List:"); 

      for (String key : sorted_recipe.keySet()) { 

        if (avail_map.containsKey(key)) {

          int avail_value = avail_map.get(key);
          int recipe_value = sorted_recipe.get(key);

          if (recipe_value - avail_value > 0) {

            System.out.println(recipe_value - avail_value + " g " + key); 
          }

        
        } else {

          System.out.println(sorted_recipe.get(key) + " g " + key); 

        }
      
      }

    }
      //System.out.println("Shopping List:" + )


  
}




  