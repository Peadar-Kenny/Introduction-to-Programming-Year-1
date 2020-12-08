import java.util.ArrayList;

public class LinkedList
{
    private int listCount;
    private Node head;

    public LinkedList()
    {
        head = new Node();
        listCount = 0;
    }
    public void add(int data, Node nodes[]) {
    	nodes[listCount]= new Node(data);
    	listCount++;
    }
    public void insert(int data, int position, Node nodes[]) {
    	for(int i = position; i > nodes.length; i++) {
    		nodes[i] = nodes[i+1];
    	}
    	nodes[position] = Node.setData(data);
    }
    public String get (int position, Node nodes[]) {
    	String returnVal = nodes[position].toString();
    	return returnVal;
    }
    public void remove(position, Node nodes[]) {
    	for(int i = position + 1; i>nodes.length)
    }
}
