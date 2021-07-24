package gov.website.methodclone.clone;

public class Hello {
	
	public int hello;
	public String name;
	public boolean sayHello;
	
	

	public Hello(int hello, boolean sayHello) {
		this.hello=hello;
		this.sayHello=sayHello;
	}
	public void init (String name) {
		this.name=name;
		
	}
     public  void displayAll() {
    	 System.out.println(this.hello);
    	 System.out.println(this.sayHello);
    	 System.out.println(this.name);
     }
	public static void main(String[] args) {
		System.out.println("Hello MAHESH");
		System.out.println("5");
		
		Hello hi = new Hello(3,true);
		hi.name="Mahesh";
	}
	

		

	}


