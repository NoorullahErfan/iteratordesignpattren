package iterator;

import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        name name1 = new name();
        for(Iterator iter = name1.getIterator();iter.hasNext();){
            String name12 = (String)iter.next();
            System.out.println("Name : "+name12);
        }
    }
    
}
