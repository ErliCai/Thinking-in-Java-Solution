package EX2;

class S{
	String s = "cai";
	S(){
		
	}
	
	public String toString() {
		return s;
	}
}


interface Selector {
	  boolean end();
	  Object current();
	  void next();
	}	

	public class Sequence {
	  private Object[] items;
	  private int next = 0;
	  public Sequence(int size) { items = new Object[size]; }
	  public void add(Object x) {
	    if(next < items.length)
	      items[next++] = x;
	  }
	  private class SequenceSelector implements Selector {
	    private int i = 0;
	    public boolean end() { return i == items.length; }
	    public Object current() { return items[i]; }
	    public void next() { if(i < items.length) i++; }
	  }
	  public Selector selector() {
	    return new SequenceSelector();
	  }	
	  public static void main(String[] args) {
	    Sequence sequence = new Sequence(10);
	    for(int i = 0; i < 10; i++)
	    	if (i == 5 || i ==6)
	    		sequence.add(new S().toString());
	    	else
	            sequence.add(Integer.toString(2*i));
	    Selector selector = sequence.selector();
	    while(!selector.end()) {
	      System.out.print(selector.current() + " ");
	      selector.next();
	    }
	  }
	}