/**
 * Created by Brandon on 1/13/15.
 */
public class MyLinkedList {
    //fields: what does a linked list have?
    private Node beginMarker;   //pointer to the first node
    private Node endMarker;     //pointer to the last Node
    private int theSize;

    //variable for an iterator - save this for now
    public MyLinkedList(){
        //set up an empty list
        beginMarker = new Node(-1, null, null);
        endMarker = new Node(-1, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;

    }

    public void add(int position, int value){

    }

    public void remove(int position){

    }
    //methods: what can a linked list do?

}
