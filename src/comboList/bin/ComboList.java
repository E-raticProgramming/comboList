/*
 * Author:  Connor Roth, Dimitri Fifis, Gennaro DiColandrea, Sean Roth
 * Date:    20, May, 2017
 * Project: ComboList
 */
package comboList;

//possible imports:
import java.util.*;
public class ComboList extends AbstractList{
    public static class Node {
        int[] info;
        Node prev;
        Node next;
        public Node () {
            info = null;
            prev = null;
            next = null;
        }
        public Node (int[] in, Node last, Node next){
            info = in;
            prev = last;
            this.next = next;
        }
        public void setNodeData(int[] in){
            info = in;
        }public void setPrevNode(Node n){
            prev = n;
        }public void setNextNode(Node n){
            next = n;
        }
        public int getIndex(int element){
        	for(int i = 0;i < head.info.length;i++){
        		if(head.info[i] == element){
        			return i;
        		}
        	}
        	return -1;
        }
//        public int getElement(int index){
//        	
//        	
//        }
    }
    
    public int size;
    public static int[] data;
    public static Node head;
    public ComboList() {
        Node element = new Node ();
        head = element;
    }
    @SuppressWarnings("rawtypes")
    public ComboList(int size, Node prev, Node next) {
        data = new int[size];
        Node element = new Node (data,prev,next);
        head = element;
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
        int[] n1 = new int[data.length - index];
        System.arraycopy(data, 0, n1, 0, data.length - index);
        int[] n2 = new int[data.length - n1.length];
        System.arraycopy(data, n1.length, n2, 0, data.length - n1.length);
        Node node1 = new Node(n1,null, null);
        int[] temp = {element};
        Node insertion = new Node (temp,node1,null);
        node1.setNextNode(insertion);
        Node node2 = new Node(n2,insertion,null);
        insertion.setNextNode(node2);
        head = node1;
        
       
    }
    @Override
    public Object remove (int index) {
        return null;
    }
    //public void importAtIndex ()
    
    //test client
    public static void main (final String[] args) {
        ComboList test = new ComboList (4,null,null);
        test.data[0] = 0;
        test.data[1] = 1;
        test.data[2] = 2;
        test.data[3] = 3;
        
        test.add(2, 100);
        //this does not work
        //TODO: trace the fucking linked list
        for (int i = 0; i < test.data.length; i ++) {
            System.out.println(test.data[i]);
        }
        
        
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
