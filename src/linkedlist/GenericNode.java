package linkedlist;

/**
 * This class models a GenericNode object which contains Generics. Each
 * GenericNode has its internal data (a String,integer,double,character,float) and pointers to the next 
 * GenericNode in the list.
 * 
 * @author Greg Gutierrez
 * Module 3 Programming Project -Generics
 * CS131ON
 */
public class GenericNode <T>{
	
	private T data;  //data that the object stores
	private GenericNode nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor builds GenericNode object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next GenericNode.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class

