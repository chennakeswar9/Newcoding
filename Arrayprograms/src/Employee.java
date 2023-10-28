import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup;

public class Employee {
	
	private int id;
	private String name;
	private String gender;
	private int yearofjoining;
	private String department;
	private Double salary;
	private int age;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", yearofjoining=" + yearofjoining
				+ ", department=" + department + ", salary=" + salary + ", age=" + age + "]";
	}
	
	public Employee(int id, String name, String gender, int yearofjoining, String department, Double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.yearofjoining = yearofjoining;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearofjoining() {
		return yearofjoining;
	}

	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		List<Employee> list = new ArrayList<Employee>();
			list.add(new Employee(111, "Jiya Brein", "FeMale", 2011, "HR", 25000.0, 32));
			list.add(new Employee(122, "Paul Niksui", "Male", 2015, "Sales And Marketing", 13500.0, 37));
			list.add(new Employee(133, "Martin Theron", "Male", 2035, "Infrastructure", 15000.0, 36));
			list.add(new Employee(144, "Murali Gowda", "FeMale", 2025, "Product Development", 45000.0, 33));
			list.add(new Employee(155, "Nima Roy", "Male", 2005, "Security And Transport", 75000.0, 39));
			list.add(new Employee(166, "Iqbal Hussain", "Male", 2016, "Account And Finance", 65000.0, 23));
			list.add(new Employee(177, "Nima Roy", "Male", 2015, "Product Development", 95000.0, 50));
			list.add(new Employee(111, "Wang Liu", "Male", 2015, "Sales And Marketing", 35000.0, 15));
			list.add(new Employee(144, "Amelia Zoe", "FeMale", 2005, "Security And Transport", 55000.0, 33));
			list.add(new Employee(133, "Martin Theron", "Male", 2011, "Infrastructure", 65500.0, 23));
			list.add(new Employee(188, "Jasna Kaur", "Male", 2022, "Product Development", 25500.0, 37));
			list.add(new Employee(122, "Amelia Zoe", "FeMale", 2021, "Account And Finance", 45500.0, 37));
			list.add(new Employee(177, "Jyothi Reddy", "FeMale", 2012, "Sales And Marketing", 75500.0, 31));
			list.add(new Employee(199, "Nicolus Den", "Male", 2010, "Infrastructure", 95500.0, 26));
			list.add(new Employee(188, "Ali Baig", "Male", 2020, "Infrastructure", 25000.0, 29));
			list.add(new Employee(133, "Sanvi Pandey", "FeMale", 2024, "Product Development", 15000.0, 29));
			list.add(new Employee(122, "Anuj Chettiar", "Male", 2022, "Product Development", 10000.0, 22));
	//How many male and female employees are there in the organization?
	Map<String, Long>		femaleandmale	= list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	System.out.println(femaleandmale);
	System.out.println("========================male and female========================");
	System.out.println("                                                               ");
	//Print the name of all departments in the organization?
	List<String>list1	=list.stream().map(Employee::getDepartment).collect(Collectors.toList());
	System.out.println(list1);
	System.out.println("========================Department========================");
	System.out.println("                                                               ");	
	//What is the age of male and female employees?
	List<Integer> listage =list.stream().map(Employee::getAge).collect(Collectors.toList());
	System.out.println(listage);
	System.out.println("========================Age========================");
	System.out.println("                                                               ");	
	//What is the average age of male and female employees?
	Map<String, Double>	 averageage	=list.stream()
			.collect(Collectors.groupingBy(Employee::getGender,
					Collectors.averagingInt(Employee::getAge)));
	System.out.println(averageage);
	System.out.println("====================Average Age============================");
	System.out.println("                                                               ");	
	//Get the details of highest paid employee in the organization?
Employee	highestsalary=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
	System.out.println(highestsalary);
	System.out.println("========================Highestsalary========================");
	System.out.println("                                                               ");	
	// Get the names of all employees who have joined after 2015?
	
List<String> names	=list.stream().filter(i-> i.getYearofjoining() > 2015).map(Employee::getName)
					.collect(Collectors.toList());
	System.out.println(names);
	System.out.println("========================Names of all employees========================");
	System.out.println("                                                               ");
	//Count the number of employees in each department?
Map<String, Long> countdepartment	=list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	System.out.println(countdepartment);
	System.out.println("========================Names of all employees========================");
	System.out.println("                                                               ");
	//What is the average salary of each department?
	Map<String, Double> averagesalary = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
				System.out.println(averagesalary);
	// Get the details of youngest male employee in the product development department?
	Optional<Employee>  maleemp	=list.stream().filter(e->"Male".equals(e.getGender()) && "product development".equals(e.getDepartment()))
				.min(Comparator.comparingInt(Employee::getAge));
					if(maleemp.isPresent()) {
						Employee youngest =maleemp.get();
						System.out.println(youngest.getName());
						System.out.println(youngest.getAge());
					}
					else {
					
						    System.out.println("No youngest male employee found in Product Development.");
					}
	System.out.println("========================Names of all employees========================");
	System.out.println("                                                               ");
	//Who has the most working experience in the organization?
Employee work=list.stream().sorted(Comparator.comparingInt(Employee::getYearofjoining))
				.findFirst().get();
		System.out.println(work);	
		System.out.println("========================Names of all employees========================");
		System.out.println("                                                               ");
		//How many male and female employees are there in the sales and marketing team?
	Map<String, Long>	empmf=list.stream().filter(e->e.getDepartment()=="sales and marketing")
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	System.out.println(empmf);
	System.out.println("========================Average Male&Female========================");
	System.out.println("                                                               ");
	//What is the average salary of male and female employees?
Map<String, Double>	avg=list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avg);
	System.out.println("========================Average Male&Female========================");
	System.out.println("                                                               ");
	// List down the names of all employees in each department?
Map<String, List<Employee>> all	=list.stream().collect( Collectors.groupingBy(Employee::getDepartment));
	Set<Entry<String,List<Employee>>> entryset = all.entrySet();
	for(Entry<String, List<Employee>> entry : entryset) {
		entry.getKey();
	List<Employee>	list12= entry.getValue();
		for(Employee e: list12) {
			System.out.println(e.getName());
		}
	}
	System.out.println("========================each department & name========================");
	System.out.println("                                                               ");
	//What is the average salary and total salary of the whole organization?
	DoubleSummaryStatistics doubleSalaryStatistics	=list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.out.println(doubleSalaryStatistics.getAverage());
	System.out.println(doubleSalaryStatistics.getSum());
	System.out.println("========================whole total salary========================");
	System.out.println("                                                               ");
	//Separate the employees who are younger or equal to 25 years from those employees
	//who are older than 25 years.
Map<Boolean, List<Employee>> younger =list.stream().collect(Collectors.partitioningBy(e->e.getAge() > 25));
				Set<Entry<Boolean, List<Employee>>> entryset1 =	younger.entrySet();
					for(Entry<Boolean, List<Employee>> 	 entry	: entryset1)
						{
							if(entry.getKey()) {
								System.out.println("Employees older than 25 years");
							}
							else
							{
								System.out.println("Employees younger than or equal to 25 years :");
							}
						
						List<Employee>	list13=entry.getValue();
					
					for(Employee e:list13)
						{
						System.out.println(e.getName());
						}
					}
			System.out.println("========================younger or equal to 25 years ========================");
			System.out.println("                      older than 25 years.                                   ");
			System.out.println("========================25 years ========================");
	// Who is the oldest employee in the organization?
			//What is his age and which department he belongs to?
	Employee oldest=list.stream().max(Comparator.comparingInt(Employee::getAge)).get();
	System.out.println(oldest.getAge());
	System.out.println(oldest.getDepartment());
	System.out.println(oldest.getName());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
}
