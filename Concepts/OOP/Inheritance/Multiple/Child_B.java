class Parent 
{
	String name = "kanha";
	float Property_value = 4.5f;
}

class Child_A extends Parent {
	String name1 = "laptop";
}

class Child_B extends Parent {
	String name2 = "naruto";

	public static void main(String[] args) {
		Child_B doc = new Child_B();
		Child_A doc1 = new Child_A();
		System.out.println("name: " + doc.name);
		System.out.println("Brother name: " + doc1.name1);
		System.out.println("Property value: " + doc.PropertyValue);
	}
}


