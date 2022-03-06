package LearnCoding;


class SuperClass1 {
	public void super_print() {
		System.out.println("Super Print");
	}
 
	public void super_show() {
		System.out.println("Super Show");
	}
}
 
public class SubClass1 extends SuperClass1 {
 
	public void sub_print() {
		System.out.println("Sub Print");
	}
 
	public void sub_show() {
		System.out.println("Sub Show");
	}
	
	public static void main(String[] args) {
 
		/* Child class object up cast to super class reference. Using super class reference , sub class object can not use methods
		 of sub class despite of being object of that class. Up casting restricts access or visibility of methods downwards */
		SuperClass1 sc=new SubClass1();
		

		/* To access sub class methods, super class reference needs to be downcast to sub class reference. Note here we can down cast
		to a up cast reference only. */
		
		SubClass1 scc=(SubClass1)sc;
		SubClass1 scl=new SubClass1(); 
		   sc.super_print();
		   scc.sub_print();
		   
	}
}
