package officeHours;

import java.util.ArrayList;
import java.util.Iterator;

public class SeleniumOH1 {
    public static void main(String[] args) {
        ArrayList <String> keysToSearch = new ArrayList<>();
        keysToSearch.add("Fruits");
        keysToSearch.add("Veggies");
        keysToSearch.add("Berries");

        Iterator <String>imIterating = keysToSearch.iterator();
        while(imIterating.hasNext()){
            System.out.println(imIterating.next());
        }

        Iterator <String> imIterting1 = keysToSearch.iterator();
        while(imIterting1.hasNext()){
            String item = imIterting1.next();
            System.out.println(item);
            System.out.println("*"+ item);

        }
    }
}
