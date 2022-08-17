package main;
import linkedlist.*;

/**
 * 
 * This class tests instantiating LinkedLists along with nodes. GenericLinkedLists and  GenericNodes are also intantiated and parameritized to be given the ability to pass through different data types
 * This class also shows the adding of GenericNodes to GenericLinkedLists and printing while next
 * 
 * @author Greg Gutierrez
 *  Module 3 Programming Project -Generics 
 * CS131ON
 */
public class TestLinkedList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		/**
		 * Instantiating GenericLinkedList and GenericNode Objects for parameterized String 
		 */
		
		GenericLinkedList <String> birdList = new GenericLinkedList<String>();	
	
		GenericNode<String>Node2=new GenericNode<String>();
		Node2.setData("Cardinals");
		birdList.addNode(Node2);
		Node2=new GenericNode();
		Node2.setData("BlueJays");
		birdList.addNode(Node2);
		
		GenericNode GenTempNode= birdList.getList();
		
		do 
		{
			System.out.println(GenTempNode.getData());
			GenTempNode=GenTempNode.getNextNode();
		} while (GenTempNode!=null);
		
		/**
		 * Instantiating GenericLinkedList and GenericNode Objects for parameterized Double 
		 */
		GenericLinkedList <Double> GpaList = new GenericLinkedList<Double>();
		
		GenericNode <Double> Node3=new GenericNode<Double>();
		Node3.setData(3.3);
		GpaList.addNode(Node3);
		Node3=new GenericNode<Double>();
		Node3.setData(2.8);
		GpaList.addNode(Node3);
		
		GenericNode <Double>GenTempNode2= GpaList.getList();
		do 
		{
			System.out.println(GenTempNode2.getData());
			GenTempNode2=GenTempNode2.getNextNode();
		} while (GenTempNode2!=null);
		
		/**
		 * Instantiating GenericLinkedList and GenericNode Objects for parameterized Integer
		 */
		GenericLinkedList <Integer> IntList = new GenericLinkedList<Integer>();
		
		GenericNode <Integer> Node4=new GenericNode<Integer>();
		Node4.setData(4);
		IntList.addNode(Node4);
		Node4=new GenericNode();
		Node4.setData(8);
		IntList.addNode(Node4);
		Node4=new GenericNode();
		Node4.setData(12);
		IntList.addNode(Node4);
		
		
		
		GenericNode <Double>GenTempNode3= IntList.getList();
		do 
		{
			System.out.println(GenTempNode3.getData());
			GenTempNode3=GenTempNode3.getNextNode();
		} while (GenTempNode3!=null);
		
		
		
		
	}//end main

}//end class
