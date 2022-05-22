package groupstudy3;

import java.util.HashMap;

public class hashmapgroupstudy {

	public static void main(String[] args) {

		
	HashMap<Integer,String> flowers	= new HashMap<Integer,String>();
	flowers.put(1,"rose");
	flowers.put(2,"dalia");
	flowers.put(3,"lily");
	flowers.put(4,"beli");
	//print all keys and values togerther
	for (int i:flowers.keySet()) {
		System.out.println("key :"+ i+ " value :"+  flowers.get(i));
	}
//access value
	flowers.get(2);
	System.out.println(flowers.get(2));
	
	//to print size
	flowers.size();
	System.out.println(flowers.size());
	//to remove
	flowers.remove(3);
	System.out.println(flowers.remove(3));
	
	//replace
	//flowers.replace(2, "hasna");
	System.out.println(flowers.replace(2, "hasna"));
	
	
		
		
		
		
		
		
	}

}
