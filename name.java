package iterator;

import java.util.Iterator;

public class name implements container {
   public String names[] = {"khan","farid","qais","ahmad","ali"};

@Override
public Iterator getIterator() {
    
    return new NameIterator();
}
private class NameIterator implements Iterator{
    int index=0;

    @Override
    public boolean hasNext() {
        if(index < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }

    
    
}
   
    
}
