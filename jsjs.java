import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends ConsoleProgram {
	

	public void run() {
		/**		Some useful other methods

		int size = myMap.size();

		myMap.containsKey(key); // returns true or false if key is in map

		myMap.keySet();

		myMap.remove(key); // make like a tree and leave!*/

		
		HashMap <String, String> myHash = new HashMap <String, String>();
		myHash.put("dog","bark");
		myHash.put("cat","meow");
		myHash.put("seal","ew ew ew");
		
		println(myHash.get("dog"));
		int size = myHash.size();
		println(size);
		
		
		if(true){
			return;
			}
		
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("hello");
		myList.add("hi");
		myList.add("h");
		myList.add("hello");
//		myList.set(1 , "hey");
		println(myList);
		myList.remove(1);
		println(myList.get(1));
		println(myList.indexOf("hello"));
		println(myList.lastIndexOf("hello"));
		println("-----------");
		
		for( int i = 0; i < myList.size(); i++){
			println(myList.get(myList.size() - i -1 )); // print from back.
			println(myList.get(i));
		}
		for(String num: myList){
			println(num);
		}
		
		
		
		
		
		if(true){
		return;
		}
		
		
		
		
//		int[] a = {10,2,3,4};
		int[] a = new int[5];
		println(a[3]);
		println(a.length);
		a[1] = 6; 
		a[3] = 5;
		println(a[3]);
		
		for(int val: a){
			println("values: " + val);
		}
		
//		Arrays.fill(a, 1);
		Arrays.sort(a);
//		for(int i = 0; i < a.length; i++){
//		println(a[i]);
//		Arrays.toString(a);
//	}
		println(Arrays.toString(a));
//		/////////////////////////
//		arr2 =  Arrays.sort(arr1);
//		while(true){
//			if(Array.equals(arr1, arr2 )){
//				break;
//			}
//			tu ara gaacveline adgilebi cvladebs.
//			private void swapElements(int[] arr, int pos1, int pos2) {
//
//				int temp = arr[pos1];
//
//				arr[pos1] = arr[pos2];
//
//				arr[pos2] = temp;
//
//				}
		}
		
//		////////////////////////
		
		
		
//		for ( int i = 0; i <= a.length - 1; i++){
//		a[i] = i;	
//		}
//		for(int i = 0; i < a.length; i++){
//			println(a[i]);
//		}
//		a[4] = 9;
//		println(a[4]);
//		0 1 2 3 4 5 6 7 
//		0 3 0 2 7 0 5 9
//		int x = number[1]-> 3
//		number[3] = 2
//		number[4] = 7
//		number[7] = 9
	}


