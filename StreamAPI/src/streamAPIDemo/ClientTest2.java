package streamAPIDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest2 {
	
    public static void main(String[] args) {
 
	Employee e3=new Employee(103,"Johny","Senior Manager",60000); 
	Employee e4=new Employee(104,"Robert","Associate",70000); 
	Employee e5=new Employee(105,"Michael","Sr Associate",40000); 
	
	List<Employee> ll=new ArrayList<Employee>();
	ll.add(new Employee(101,"John","Manager",50000));
	ll.add(new Employee(102,"Smith","Lead",60000));
	ll.add(e3);
	ll.add(e4);
	ll.add(e5);
	
	Stream<Employee> pstream=ll.parallelStream();
	pstream.forEach(System.out::println);
  }
}