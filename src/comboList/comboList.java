/*
 * Author:  Connor Roth, Dimitri Fifis, Gennaro DiColandrea, Sean Roth
 * Date:    20, May, 2017
 * Project: ComboList
 */
package comboList;

//possible imports:
import java.util.*;
public class ComboList extends AbstractList{
    public static class Node<T> {
        T info;
        Node<T> prev;
        Node<T> next;
        public Node () {
            info = null;
            prev = null;
            next = null;
        }
        public Node (T in, Node<T> last, Node<T> next){
            info = in;
            prev = last;
            this.next = next;
        }
        public void setNodeData(T in){
            info = in;
        }
    }
    
    public int size;
    public int[] data;
    
    public ComboList() {
        Node<int[]> element = new Node <int[]> ();
    }
    public ComboList(int size) {
        Node<int[]> element = new Node <int[]> ();
        element.setNodeData(new int[size]);
    }
    
    public Object get(int index) {
        return null;
    }
    public int size() {
        return this.size;
    }
    public void add (int element) { // adds element to end of array
        
    }
    public void add (int index, int element) { //adds element at specified index
        
        
    }
    @Override
    public Object remove (int index) {
        return null;
    }
    //public void importAtIndex ()
    
    //test client
    public static void main (final String[] args) {
        /*
        int[] a1 = {0,1,2};
        int[] a2 = {2,3,4};
        int [] newArray = new int[a1.length+a2.length];
        System.arraycopy( a1, 0, newArray, 0, a1.length);
        System.arraycopy( a2, 0, newArray, a1.length, a2.length );
        for (int i = 0; i < newArray.length; i ++) System.out.println(newArray[i]);
        */
    }

}
