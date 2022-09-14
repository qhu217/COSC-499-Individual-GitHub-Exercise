import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Test_Feature1 {

	@Test
	void test() throws Exception {
		
		String input1 = "2" + System.getProperty("line.separator")
		+ "-10" + System.getProperty("line.separator")
		+ "100" + System.getProperty("line.separator")
		+ "1" + System.getProperty("line.separator");
	    InputStream in1 = new ByteArrayInputStream(input1.getBytes());
	    Scanner sc = new Scanner(input1);
	    System.setIn(in1);
		
	    assertEquals("-10 1 2 100 ", master_branch.sort_integers(4, sc));

	}

}
