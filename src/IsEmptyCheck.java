import java.io.File;
import java.util.ArrayList;

public class IsEmptyCheck {

	public static ArrayList<File> fileList = new ArrayList<File>();

	public static void readInDepartureTimesDirectory() { //used in Run.getStarted()
 
       File directory = new File("departure times");

       for(File file : directory.listFiles()) {
    	   fileList.add(file);
       }
	}
    
     public static void getStarted() {  //used in Run 
    	 
    	 readInDepartureTimesDirectory();
    	 boolean isEmpty= ( fileList.isEmpty() ? true : false);
    		
	      if(isEmpty) {
	  		 
	    	FileWriting.fileWriting() ;
	  		Route.getARoute();
	  		  
	  	  } else {
		    Route.getARoute();
	  	  }
	}
}