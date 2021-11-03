package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	ArrayList arr = new ArrayList();
	
	public void add(int element) {
		arr.add(element);
	}
	
	public void delete(int element) {
		arr.remove(element);
	}
boolean isEmpty()
{
	boolean k=false;
if(arr.isEmpty())
	k=true;
return k;
}

int getSize()
{
	return arr.size();
}
}