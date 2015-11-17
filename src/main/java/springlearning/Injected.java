package springlearning;

import java.util.LinkedList;
import java.util.List;

public class Injected {

	List<Object> list;
	
	LinkedList<Object> linkedList;
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public void setLinkedList(LinkedList<Object> linkedList) {
		this.linkedList = linkedList;
	}

	public void say() {
		System.out.println("Injected");
		for (Object o : this.list) {
			System.out.println(o);
		}
		for (Object o : this.linkedList) {
			System.out.println(o);
		}
	}
	
}
