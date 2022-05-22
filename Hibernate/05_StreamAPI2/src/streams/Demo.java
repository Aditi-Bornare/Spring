package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
	
//		How many ways to create stream objects
		
//		1st way
		Stream<Object> empty=Stream.empty();
		empty.forEach(e->{
			System.out.println(e);
		});
		
//		2nd way(Array)
		String names[]= {"Rahul","Rohit","Akshay","Vijay"};
		Stream<String> obj=Stream.of(names);
		obj.forEach(x->{
			System.out.println(x);
		});
		
//		3rd way(By using Arrays class)
		IntStream stream=Arrays.stream(new int[] {10,20,30,40,50,60});
		stream.forEach(x->{
			System.out.println(x);
		});
		
//		4th way(By using Collection Framework)
		List<Double> l=new ArrayList<Double>();
		l.add(9.2);
		l.add(5.5);
		l.add(3.14);
		l.add(2.5);
		Stream<Double> stream2=l.stream();
		stream2.forEach(x->{
			System.out.println(x);
		});
	}
}
