public class persondriver {
	public static void main (String [] args) {

	person person1 = new person();
	System.out.println(person1);
	person person2 = new person("Noel", 23);
	System.out.println(person2);

	if (person1.equals(person2)) {
	System.out.println("true");
	} else System.out.println("false");

	String name1 = person1.getName();
	String name2 = person2.getName();
	if (name1.equals(name2)) {
	System.out.println("true");
	} else System.out.println("false");

	int age1 = person1.getAge();
	int age2 = person2.getAge();
	if (age1==age2) {
	System.out.println("true");
	} else System.out.println("false");
	
	if (age1>age2) {
		System.out.println("Rachel is older than Noel");
		}
	if (age2<age1){
		System.out.println("Noel is younger than Rachel");
	}

	}
}
