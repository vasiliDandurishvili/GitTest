import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.RandomGenerator;

public class jsjs extends ConsoleProgram {

	public void run() {
		//asteroidebi.
		int mas = readInt("masa: ");
		int[] comet = new int[6];
		for(int i = 0; i < comet.length; i++){
			comet[i] = readInt();
		}
		Arrays.sort(comet);
		
		for(int i = 0; i < comet.length; i++){
			if(mas >= comet[i]){
				mas += comet[i];
			}else{
				println("false");
				return;
			}
		}
		println("true");
		
		
		
		if(true){
			return;
		}
		//sort masive.
		int [] arr = new int[10];
		for(int i = 0;i < arr.length; i++){
			arr[i] = readInt();
		}
		while(true){
			for(int i = 0; i < arr.length - 1; i++){
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					i = -1;
				}
			}
			break;
		}
		println(Arrays.toString(arr));
		
		
		
		
		
		
		
		if(true){
			return;
		}
		
		ArrayList<Integer> List = new ArrayList<Integer>();

		List.add(11);
		List.add(199);
		List.add(1717);
		List.add(1);
		
		println(List);
		
		Collections.reverse(List);
		
		println(List);
		if(true){
			return;
		}
		
		String l = "kkkkaa";
		
		String m = l.substring(0, 4);
		m += 77;
		print(m);
		
		if(true){
			return;
		}
		JLabel label = new JLabel ("hi");
		add(label, SOUTH);
		
		
		JTextField field = new JTextField (10);
		add(field, SOUTH);
		
		field.setText("good cec");
		
		field.getText();//reture "good cec".
		

//		textField.addActionListener(this);

		
		
		
		
		
		
		
			
		if(true){
			return;
		}
		
		
		
		/**
		 * Some useful other methods
		 * 
		 * int size = myMap.size();
		 * 
		 * myMap.containsKey(key); // returns true or false if key is in map
		 * 
		 * myMap.keySet();
		 * 
		 * myMap.remove(key); // make like a tree and leave! 
		 * for(keyType key : myMap.keySet()){ 
		   		myMap.get(key); // do something with the key/value pair 
		   	}
		 */

		HashMap<String, String> myHash = new HashMap<String, String>();
		myHash.put("dog", "bark");
		myHash.put("cat", "meow");
		myHash.put("seal", "ew ew ew");

		println(myHash.get("dog"));
		int size = myHash.size();
		println(size);
		
		for(String key : myHash.keySet()){ 
			println(myHash.get(key)); // do something with the key/value pair 
	   	}
		
		
		

		if (true) {
			return;
		}

		ArrayList<String> myList = new ArrayList<String>();

		myList.add("hello");
		myList.add("hi");
		myList.add("h");
		myList.add("hello");
		// myList.set(1 , "hey");
		println(myList);
		myList.remove(1);
		println(myList.get(1));
		println(myList.indexOf("hello"));
		println(myList.lastIndexOf("hello"));
		println("-----------");

		for (int i = 0; i < myList.size(); i++) {
			println(myList.get(myList.size() - i - 1)); // print from back.
			println(myList.get(i));
		}
		for (String num : myList) {
			println(num);
		}

		if (true) {
			return;
		}

		// int[] a = {10,2,3,4};
		int[] a = new int[5];
		println(a[3]);
		println(a.length);
		a[1] = 6;
		a[3] = 5;
		println(a[3]);

		for (int val : a) {
			println("values: " + val);
		}

		// Arrays.fill(a, 1);
		Arrays.sort(a);
		// for(int i = 0; i < a.length; i++){
		// println(a[i]);
		// Arrays.toString(a);
		// }
		println(Arrays.toString(a));
		// /////////////////////////
		// arr2 = Arrays.sort(arr1);
		// while(true){
		// if(Array.equals(arr1, arr2 )){
		// break;
		// }
		// tu ara gaacveline adgilebi cvladebs.
		// private void swapElements(int[] arr, int pos1, int pos2) {
		//
		// int temp = arr[pos1];
		//
		// arr[pos1] = arr[pos2];
		//
		// arr[pos2] = temp;
		//
		// }
	}



	// ////////////////////////

	// for ( int i = 0; i <= a.length - 1; i++){
	// a[i] = i;
	// }
	// for(int i = 0; i < a.length; i++){
	// println(a[i]);
	// }
	// a[4] = 9;
	// println(a[4]);
	// 0 1 2 3 4 5 6 7
	// 0 3 0 2 7 0 5 9
	// int x = number[1]-> 3
	// number[3] = 2
	// number[4] = 7
	// number[7] = 9
}
