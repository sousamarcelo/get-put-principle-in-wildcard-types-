package aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObject = new ArrayList<Object>();
		
		copy(myInts, myObject);
		
		printList(myInts);
		
		copy(myDoubles, myObject);
		
		printList(myDoubles);

		
		
	}
	
	//no tipo menos generico, mais especifico é possivel acessar os valores e no tipo mais generico, menos especifico é possivel adicionar mas não pega-los
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
	}

}
