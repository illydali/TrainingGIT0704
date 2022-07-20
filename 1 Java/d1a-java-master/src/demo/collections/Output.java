package demo.collections;

class A {
	int i;
	int j;

A() 
{
      i = 1;
      j = 2;
     
    }
}

public class Output {
	public static void main(String args[]) {
		Output obj1 = new Output();
		Output obj2 = new Output();
		System.out.print(obj1.equals(obj2));
	}
}