package introduce;

public class Student {
	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Student st = new Student("12345", "Nguyen Cong Q", 21);
		System.out.println(st);
	}
}
