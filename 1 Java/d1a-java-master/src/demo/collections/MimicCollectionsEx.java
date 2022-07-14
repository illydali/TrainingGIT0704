
package demo.collections;

import java.lang.*;
public class MimicCollectionsEx {

}

class E extends Object{
	
}
interface CollectionM {
	boolean add(E e);
	void clear();
	boolean isEmpty();
	boolean remove(Object o);
	int size();
}

interface ListM extends CollectionM {
	E get(int index);
}

class ArrayListM implements ListM {

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}