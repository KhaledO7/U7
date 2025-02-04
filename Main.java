import java.util.*;

public class Main {
    // ArrayList poop = new ArrayList();
    public static void main(String[]args){
    ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier");
        trees.add("fir");
        System.out.println( trees.size());
      //  trees.set(0,"poop");
        String tree0 = trees.get(0);
        System.out.println(tree0);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        String name0 = moreNames[0];
        String name00 = names.getFirst();
        int lengths = moreNames.length + names.size() + name00.length() + name0.length(); //complete me!
         System.out.println(lengths);


        // trees.get(3);

    }
}
