package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
	
//		Important Stream Methods
		
		List<String> list1=Arrays.asList("Rahul","Rohit","Akshay","Vijay");
		List<String> collect=list1.stream().filter(x->x.startsWith("R")).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> list2=Arrays.asList(10,20,30,40,50,60);
		List<Integer> collect2=list2.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(collect2);
		
		list2.stream().forEach(x->{
			System.out.println(x);
		});
		
		System.out.println("-------------------------");
		list2.stream().forEach(System.out::println);
		
		List<Integer> list3=Arrays.asList(25,86,42,96,72,33,12,8,5);
		list3.stream().sorted().forEach(System.out::println);
		
		Integer obj=list3.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(obj);
		
		Integer obj2=list3.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(obj2);
	}
}
