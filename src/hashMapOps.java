import java.util.HashMap;
import java.util.Scanner;

public class hashMapOps {

    private HashMap<Integer, String> hm;
    private Scanner input = new Scanner(System.in);

    public hashMapOps(HashMap<Integer, String> hm) {
        this.hm = hm;
    }

    public void add(){
        //Adds all values to the HashMap

        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
    }

    public void unlock(){
        //Demonstrates the ability to store information under a specific "key"

        System.out.println("Input a keycode [1 - 5]");
        int keyCode = input.nextInt();

        if (hm.containsKey(keyCode)){
            System.out.println("Welcome User " + hm.get(keyCode));
        }
    }
}