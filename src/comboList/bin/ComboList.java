/*
 * Author:  Connor Roth, Dimitri Fifis, Gennaro DiColandrea, Sean Roth
 * Date:    20, May, 2017
 * Project: ComboList
 */
package comboList.bin;

//possible imports:
import java.util.*;
<<<<<<< HEAD
@SuppressWarnings("rawtypes")
public class ComboList extends AbstractList{
    public static int size = 0;
=======
public class ComboList{
>>>>>>> getNode
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
            size = info.length;
            
        }
        public void setNodeData(int[] in){
            info = in;
        }public void setPrevNode(Node n){
            prev = n;
        }public void setNextNode(Node n){
            next = n;
        }
    }
    public int[] data;
    public static Node head;
    public ComboList() {
        Node element = new Node ();
        head = element;
    }
    public ComboList(int size, Node prev, Node next) {
        data = new int[size];
        Node element = new Node (data,prev,next);
        head = element;
    }
    public Object get(int index) {
        return null;
    }
<<<<<<< HEAD
    //does not
    public int size() {
        return ComboList.size;
    }
    public void add (int element) { // adds element to end of array
=======
    public int size(int element) {
      int count = 0;
      Node current = head;
      while (current.next != null ) {
  		for(int i = 0;i < current.info.length;i++ ){
  			if (current.info[i] == element){
  			return count;
  	  }
  		count++;
  	}
      
   }
      return count;
 }

    	
    	
    
    public void addLast (int element) {
    	int nums[] = new int[1];
    	nums[0] = element;
    	Node current = head;
    	while(current.next != null){
    		current = current.next;
    	}
    	current.next = new Node(nums,current,null);
>>>>>>> getNode
        
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
        size ++;
    }
    //does work
    public void set (int index, int element) {
        int count = 0;
        Node current = head;
        while (current!= null ) {
            for(int i = 0;i < current.info.length;i++,count++){
                if(count == index){
                    current.info[i] = element;
                    break;
                }
            }
            current = current.next;
        }
    }
    public int getIndex(int element){
    	int count = 0;
    	Node current = head;
    	while (current.next != null ) {
    		for(int i = 0;i < current.info.length;i++){
    			if(current.info[i] == element){
    				return count;
    			}
    			count++;
    		}
    		current = current.next;
    	}
    	if (current.next == null) {
    		for(int i = 0;i < current.info.length;i++){
    			if(current.info[i] == element){
    				return count;
    			}
    			count++;
    			}
    	}
    	return -1;
    } // works
    public int getElement(int index){
    	int count = 0;
    	Node current = head;
    	while (current != null ) {
    		for(int i = 0; i < current.info.length;i++ ){
    			if(count == index){
    			return current.info[i];
    		}
    		count++;
    	}
    	current = current.next;
    }
    	return -1;
<<<<<<< HEAD
 }    
//broken
    public void removeElement (int index) {
        int count = 0;
        Node current = head;
        
        while (current!= null ) {
            for(int i = 0;i < current.info.length;i++,count++){
                if(count == index){
                    int[] new1 = new int[i];
                    int[] new2 = new int[current.info.length - i];
                    if (i != 0) System.arraycopy( current.info, 0, new1, 0, new1.length);
                    System.arraycopy( current.info, i+1, new2, 0, new2.length);
                    Node newN = new Node(new2,current,current.next);
                    current.setNextNode(newN);
                    break;
                }
            }
            current = current.next;
        }
    }
    public static void main (final String[] args) {
        long total = 0;
        for (int t = 0; t < 25; t++) {
            int[] data = new int[5000];
            for (int i = 0; i < data.length; i++) data[i] = i;
            ComboList test = new ComboList (5000,null,null);
            test.data = data;
            long start = System.nanoTime();
            test.add((int)(Math.random()*50 + 1), 00000);
            long end = System.nanoTime() - start;
            total = total + end;
        }
        System.out.println("Avg time to add to the data: "+ total/25);
=======
 }
    
    public void empty(){
    	head = null;
    }
    
    public void addFirst(int num){
    	Node temp = head;
    	int[] vals = new int[1];
    	vals[0] = num;
    	head = new Node(vals,null,temp);
    	head.next.setPrevNode(head);
    }
        	
    
    	
    
  
    //public void importAtIndex ()
    
    //test client
    //test
    public static void main (final String[] args) {
        ComboList test = new ComboList (4,null,null);
        test.data[0] = 0;
        test.data[1] = 1;
        test.data[2] = 2;
        test.data[3] = 3;
        
        test.add(2, 100);
        System.out.println(test.getIndex(3));
        System.out.println(test.getElement(2));
>>>>>>> getNode
        //this does not work
        //TODO: trace the darn linked list
//        for (int i = 0; i < test.data.length; i ++) {
//            System.out.println(test.data[i]);
//        }
        
        test.size(2);
        System.out.println();
        
        
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
