import java.util.HashSet;
import java.util.Iterator;

public class hashSetOps {
    /*
    Created for ease of use and clean look of main class.  All Ops classes contain the methods that operate on the
    various data types created in the main class.
     */

    HashSet<Integer> hs;
    Iterator it;

    public hashSetOps(HashSet<Integer> hs) {
        this.hs = hs;
    }

    public void add(){
        //Demonstrates HashSets ability to sort through duplicates

        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(11);
        hs.add(10);
        hs.add(13);
        hs.add(13);
        hs.add(13);
        hs.add(15);
        hs.add(50);
        hs.add(50);
    }

    public void printHS(){
        //Displays all of the values in the HashSet

        System.out.println("Printing Values in HashSet:");
        if (hs.size()==0){
            System.out.println("No Values!");
        }
        it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Size of HashSet: " + hs.size());
    }

    public void clearHS(){
        //Clears the HashSet

        System.out.println("\nClearing HashSet...\n");
        hs.clear();

    }

}
