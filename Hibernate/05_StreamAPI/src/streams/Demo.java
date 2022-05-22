package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
	
//		How to create a List(There are multiple ways)
		
//		Way 1
//		List<Integer> list1=new ArrayList<>();
//		list1.add(10);
//		list1.add(20);
//		list1.add(30);
//		list1.add(40);
//		System.out.println(list1);
		
//		Way 2
//		List <Integer> list2=Arrays.asList(50,60,70,80,90);
//		System.out.println(list2);
		
//		Way 3
//		Try changing jdk to latest version
//		List<Integer> list3=List.of(10,20);
//		System.out.println(list3);
		
		List <Integer> list2=Arrays.asList(50,39,60,70,13,80,57,90);
		System.out.println(list2);
//		Now from this list2 we find out even no.
		
//		without stream
		List<Integer> evenlist=new ArrayList<>();
		for(Integer i:list2)
		{
			if(i%2==0)
			{
				evenlist.add(i);
			}
		}
		System.out.println("Without stream "+evenlist);
//		Boiler plate code: Code written in more lines i.e bulk code (motha code)
		
//		with stream
		Stream<Integer> stream=list2.stream();
//		Predicate means condition, if for a value that condition is true then filter includes that value
//		else filter skips that value
		List<Integer> collect=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("With Stream "+collect);
		
//		Working
//		list2 madhun stream() method ni list2 cha data kadhla, jyacha return type Stream navacha class aahe
//		filter() method madhe predicate ie condition pass karaych asta, lambda expression
//		ji value predicate in true dili, filter ni pakadli ani collect() method la dili jyane ti collect keli
//		ani Collectors.toList() ni tya value la list madhe return kela
		
//		Only one line code now
		List<Integer> collect1=list2.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("With Stream "+collect1);
		
//		You can change logic as per requirement
		List<Integer> collect2=list2.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println("With Stream "+collect2);
	}
}
