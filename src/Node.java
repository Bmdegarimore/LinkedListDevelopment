/**
 * Created by Brandon on 1/13/15.
 */
public class Node {
    //fields: What the type has
    public int value;
    public Node prev;
    public Node next;

    //methods: What the type does/can do
    //Node constructor can take initial values
    //and we will store them into our own fields

    public Node(int d, Node p, Node n){
        value = d;
        prev = p;
        next = n;
    }

    //Example:
    //Node myFirstNode = new Node(6,null,null);
    //Node mySecondNode = new Node(12, myFirstNode, null);
    //my aFirstNode.net = mySecondNode;
}
