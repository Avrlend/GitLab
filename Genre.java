package lab1;

enum Genre {
	Action,
	Adventure,
	Accessories,
	Horror,
	Fighting,
	Other;
	
	public  static void fname(int tp) {
		switch(tp){
	    	case 0: System.out.println("0 - Action"); break; 
	    	case 1: System.out.println("1 - Adventure"); break; 
	    	case 2: System.out.println("2 - Accessories"); break; 
	    	case 3: System.out.println("3 - Horror"); break; 
	    	case 4: System.out.println("4 - Fighting"); break; 
	    	case 5: System.out.println("5 - Other"); break; 
	    	default: System.out.println("Error 404"); break; 
	       }
	  }
}
