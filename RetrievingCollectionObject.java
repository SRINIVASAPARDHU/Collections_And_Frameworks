package com.ssp.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject 
{
	public static void main(String[] args)
	{                   
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Gauva");
		            
		System.out.println("BY USING TOSTRING() METHOD");
		System.out.println(fruits.toString());
		
		System.out.println("BY USING ORDINARY FOR LOOP");
		for(int i = 0; i<fruits.size(); i++)
		{
			String fruit = fruits.get(i);
			System.out.println(fruit);
		}
		
		System.out.println("BY USING FOR  EACH LOOP");
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
     
		System.out.println("BY USING ENUMERATION INTERFACE");
         
		Enumeration<String> ele = fruits.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
           
		System.out.println("BY USING ITERATOR INTERFACE");
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("BY USING LISTITERATOR INTERFACE");
		
	    ListIterator<String> lst = fruits.listIterator();
		
		System.out.println("IN FORWARD DIRECTION");
		
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		
		System.out.println("IN BACKWARD DIRECTION");
		while(lst.hasPrevious())
		{
			System.out.println(lst.previous());
		}
		
		System.out.println("BY USING SPLITERATOR INTERFACE");
		
		Spliterator<String> spl = fruits.spliterator();
		spl.forEachRemaining(fruit -> System.out.println(fruit));
		
		System.out.println("BY USING FOR EACH METHOD");
		fruits.forEach(fruit -> System.out.println(fruit));
		
		System.out.println("BY USING METHOD REFERENE");
		fruits.forEach(System.out::println);
		
	}

}
