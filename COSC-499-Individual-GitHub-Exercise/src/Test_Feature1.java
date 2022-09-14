import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Test_Feature1 {

	@Test
	void test() throws Exception {
		master_branch mb = new master_branch();
		
		String input1 = "i" + System.getProperty("line.separator") 
		+ "4" + System.getProperty("line.separator") 
		+ "2" + System.getProperty("line.separator")
		+ "-10" + System.getProperty("line.separator")
		+ "100" + System.getProperty("line.separator")
		+ "1" + System.getProperty("line.separator");
	    InputStream in1 = new ByteArrayInputStream(input1.getBytes());
	    Scanner sc = new Scanner(System.in);
	    System.setIn(in1);
	    
	    String input2 = "4";
	    InputStream in2 = new ByteArrayInputStream(input2.getBytes());
	    System.setIn(in2);
	    
	    String input3 = "2";
	    InputStream in3 = new ByteArrayInputStream(input3.getBytes());
	    System.setIn(in3);
	    
	    String input4 = "-10";
	    InputStream in4 = new ByteArrayInputStream(input4.getBytes());
	    System.setIn(in4);
	    
	    String input5 = "100";
	    InputStream in5 = new ByteArrayInputStream(input5.getBytes());
	    System.setIn(in5);
	    
	    String input6 = "1";
	    InputStream in6 = new ByteArrayInputStream(input6.getBytes());
	    System.setIn(in6);
		
	    assertEquals("-10 1 2 100 ", master_branch.sort_integers(4, sc));

	}

}
