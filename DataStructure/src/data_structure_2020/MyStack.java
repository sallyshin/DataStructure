package data_structure_2020;
import java.util.LinkedList;
import java.util.List;

interface Stack<T> {
    public void push(T obj);

    public T pop();
}

class MyStack<T> implements Stack<T> {

	List<T> newlist = new LinkedList<>();
	
	@Override
	public void push(T i) {
		newlist.add(newlist.size(), i);
	}

	@Override
	public T pop() {
		return newlist.remove(newlist.size()-1);
		
	}

}