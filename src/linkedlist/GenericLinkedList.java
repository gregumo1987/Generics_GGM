package linkedlist;
/**
 * This class models a Generic linked list in which each GenericNode has a pointer
 * to the GenericNode after it, except the tail which does not have a GenericNode after.
 * @author Greg Gutierrez
 * Module 3 Programming Project -Generics
 * CS131ON
 */
public class GenericLinkedList <T>{

	@SuppressWarnings("rawtypes")
	private GenericNode head; //GenericNode to represent the head of the list
	@SuppressWarnings("rawtypes")
	private GenericNode tail; //nGenericNode to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head GenericNode of the list from which
	 * you can traverse the entire by following GenericNode links.
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public GenericNode getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new GenericNode to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail GenericNodes
	 * to the GenericNode passed in. If the list is not empty it places the GenericNode
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addNode(GenericNode aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(aNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode


