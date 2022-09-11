package script;

import org.testng.annotations.Test;

import Genericlib.Baseclass;
import pom.firstpg;
import pom.secondpg;

public class tc1 extends Baseclass {

	@Test
	public void testcase1()
	{
	firstpg f = new firstpg(driver);
	f.docu();
	
	secondpg s = new secondpg(driver);
	s.web();
	}
}
