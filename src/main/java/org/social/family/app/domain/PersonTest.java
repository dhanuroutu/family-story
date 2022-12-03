package org.social.family.app.domain;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setPersonId(10l);
		p1.setAge(35);
		p1.setName("Dhanu");
		p1.setGender("Male");
		
		
		Person p2 = new Person();
		p2.setPersonId(11l);
		p2.setAge(30);
		p2.setName("Sonya");
		p2.setGender("Female");
		
		
		Person p3 = new Person();
		p3.setPersonId(12l);
		p3.setAge(37);
		p3.setName("Yogi");
		p3.setGender("Male");
		
		Person p4 = new Person();
		p4.setPersonId(13l);
		p4.setAge(36);
		p4.setName("Sreedhar");
		p4.setGender("Male");
		
		
		System.out.println(p4.getGender());
		System.out.println(p4.getName());

	}

}
