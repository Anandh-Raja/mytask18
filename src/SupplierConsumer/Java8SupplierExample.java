package SupplierConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8SupplierExample {
public static List<Student> createStudents(){
    List<Student> sl=new ArrayList<>();
	Student s1= new Student("anand",01,2.5,"Male",Arrays.asList("walking","earing","exercise"));
	Student s2= new Student("ajith",02,3.4,"Male",Arrays.asList("laughing","martialarts","backbacking"));
	Student s3= new Student("karthi",03,3.7,"Male",Arrays.asList("writing","music","riding"));
	Student s4= new Student("elavarsu",04,3.8,"Male",Arrays.asList("singing","rap","travelling"));
	Student s5= new Student("kiran",05,3.7,"Male",Arrays.asList("skipping","earing","cardio"));
	sl.add(s1);
	sl.add(s2);
	sl.add(s3);
	sl.add(s4);
	sl.add(s5);
	List<Student> greategpa=sl.stream().filter(s->s.getGpa()>3.5).collect(Collectors.toList());
	System.out.println(greategpa+"\n\n");
	List<Student> studentgreaterThan3=sl.stream().filter(s->s.getGrade()>3).collect(Collectors.toList());
	System.out.println(studentgreaterThan3+"\n\n");
	return sl;
}

public static void main(String args[]) {
	Supplier studentSupplier=()-> new Student("anand",03,3.5,"Male",Arrays.asList("walking","earing","exercise"));
	Student student=(Student) studentSupplier.get();
	System.out.println(student+"\n");
	List<Student> sl=createStudents();
	Consumer<Student> consumerForStudent=s->System.out.println(s);
	sl.forEach(consumerForStudent);
	  
}

}
