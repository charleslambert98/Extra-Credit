import java.util.TreeMap;

public class treeMapOps extends TreeMap {
    /*
    Created for ease of use and clean look of main class.  All Ops classes contain the methods that operate on the
    various data types created in the main class.
     */

    private TreeMap<Integer, String> tm;

    public treeMapOps(TreeMap<Integer, String> tm) {
        this.tm = tm;
    }

    public void add(){
        //Adds all values to the TreeMap

        tm.put(5, "First Added");
        tm.put(3, "Second Added");
        tm.put(213, "Third Added");
        tm.put(0, "Fourth Added");
        tm.put(1232, "Fifth Added");
    }

    public void printTM(){
        System.out.println(tm.keySet()); //Displays all of the keys in the set
        System.out.println(tm.values()); //Displays all of the values in the set

        //Shows the automatic sorting characteristic of TreeMaps
    }
}