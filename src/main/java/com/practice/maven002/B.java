
package com.practice.maven002;
class A
{
    private A()
    {
        //Private Constructor
    	System.out.println("iii");
    }
  public A(int i)
    {
        //Private constructor
    	 System.out.println("kkkkk");
    }
}
 
class B extends A
{
	private B(int i) {
		
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("llll");
	}

	public static void main(String[] args)
    {
	
	
	
	//A a=new A();
	B aa=new B(5);
    //Can't create subclass to the class
    //which has only private constructors
}
}