import java.util.ArrayList;

public class Practice {
	
	private void method (String[] array){
	    for(int i = 0; i < array.length / 2; i++){
	       String temp = array[i];
	       array[i] = array[array.length - i - 1];
	       array[array.length - i - 1] = temp;
	    }
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"a", "b", "c", "d", "e"};
		Practice p = new Practice();
		p.method(array);
		
		
		
	}

}
