package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	int id;
	String name;
	int age;
	int marks;
	public ComparatorTest(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "ComparatorTest [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}





	public static void main(String[] args) {
		ComparatorTest comparatorTest = new ComparatorTest(1, "Vignesh", 25, 450);
		ComparatorTest comparatorTest1 = new ComparatorTest(2, "Kumar", 27, 420);
		ComparatorTest comparatorTest2 = new ComparatorTest(3, "Deva", 30, 470);
		
		List<ComparatorTest> comparatorTests = new ArrayList<ComparatorTest>();
		comparatorTests.add(comparatorTest2);
		comparatorTests.add(comparatorTest1);
		comparatorTests.add(comparatorTest);
		
		
		Comparator<ComparatorTest> markComparator = new Comparator<ComparatorTest>() {
			
			@Override
			public int compare(ComparatorTest arg0, ComparatorTest arg1) {
				
				return arg0.marks - arg1.marks;
			}
		};
		
		Comparator<ComparatorTest> ageComparator = new Comparator<ComparatorTest>() {
			
			@Override
			public int compare(ComparatorTest arg0, ComparatorTest arg1) {
				// TODO Auto-generated method stub
				return arg0.age- arg1.age;
			}
		};
		
		Collections.sort(comparatorTests, ageComparator);
		System.out.println(comparatorTests);
		Collections.sort(comparatorTests, markComparator);
		System.out.println(comparatorTests);
		
		Comparator<ComparatorTest> ageComparatorNew = (a,b) -> b.age-a.age;
		Collections.sort(comparatorTests, ageComparatorNew);
		System.out.println(comparatorTests);
		
		Collections.sort(comparatorTests, (a,b) -> a.marks-b.marks);
		
		System.out.println(comparatorTests);
		
		
		
		
		
		
		
		
		
		
		
	}

}
