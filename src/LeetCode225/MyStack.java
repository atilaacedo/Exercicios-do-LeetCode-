package LeetCode225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	Queue<Integer> stackQueue;
	
	
	public MyStack() {
	    stackQueue = new LinkedList<>();
	}
	    
	public void push(int x) {
		stackQueue.add(x);
		
		int size = stackQueue.size()-1;
		for (int i = 0; i < size; i++) {
			Integer f = stackQueue.remove();
			stackQueue.add(f);
		}
	}
	    
	public int pop() {
		return stackQueue.remove();
	}
	    
	public int top() {
		return stackQueue.peek();
	}
	    
	public boolean empty() {
		return stackQueue.size() == 0;
	}
}
