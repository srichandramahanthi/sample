package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
	//test to be executed
	@Test
	public void test1()
	{
		Reporter.log("testcase1");
	}
	public void test2()
	{
		Reporter.log("testcase2");
	}

}
