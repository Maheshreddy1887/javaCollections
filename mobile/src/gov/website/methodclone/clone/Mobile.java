package gov.website.methodclone.clone;

public class Mobile {
 
	public int Mobile;
	public String name;
	public String Brand;
	
	public Mobile(int Mobile,String name) {
		this.Mobile=Mobile;
		this.name=name;
		
		
	}
     public void init (String Brand) {
    	this.Brand=Brand;
    	
     }
     public void dispalyAll() {
    	 System.out.println(this.Mobile);
    	 System.out.println(this.name);
    	 System.out.println(this.Brand);
     }
	public static void main(String[] args) {
		 System.out.println("Mobile Realme");
		 System.out.println(10);
	

	}

}
