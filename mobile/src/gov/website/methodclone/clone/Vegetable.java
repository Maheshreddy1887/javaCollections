package gov.website.methodclone.clone;

public class Vegetable {
		 
		public int Vegetable;
		public String name;
		public String colour;
		
		public Vegetable(int Vegetable,String name) {
			this.Vegetable=Vegetable;
			this.name=name;
			
			
		}
	     public void init (String Colour) {
	    	this.colour=colour;
	    	
	     }
	     public void dispalyAll() {
	    	 System.out.println(this.Vegetable);
	    	 System.out.println(this.name);
	    	 System.out.println(this.colour);
	     }
		public static void main(String[] args) {
			 System.out.println("Vegetable Carrot");
			 System.out.println(10);
		

		}

	}

