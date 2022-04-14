package projects;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraytoList {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5,6,6,7,8,9};
		
		List list =new ArrayList<>(Arrays.asList(arr)); 
		System.out.println(list);
		
		List list1 = new ArrayList<>();
		Collections.addAll(list1, arr);
		System.out.println(list1);
		
		
		List list2=new ArrayList<>();
		for(Integer text:arr) {
			list2.add(text);
		}
		System.out.println(list2);
		
	}

	
}

