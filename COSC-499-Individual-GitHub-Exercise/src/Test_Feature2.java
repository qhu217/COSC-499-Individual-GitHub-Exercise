import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Test_Feature2 {

	@Test
	void test() throws Exception {
		
		String input1 = System.getProperty("line.separator")  + 
				"l" + System.getProperty("line.separator") + 
				"s" + System.getProperty("line.separator") + 
				"c" + System.getProperty("line.separator") + 
				"o" + System.getProperty("line.separator") + 
				"d" + System.getProperty("line.separator");
	    InputStream in1 = new ByteArrayInputStream(input1.getBytes());
	    Scanner sc = new Scanner(in1);
	    System.setIn(in1);
		
	    assertEquals("c d l o s ", master_branch.sort_chars(5, sc));

	}

}
