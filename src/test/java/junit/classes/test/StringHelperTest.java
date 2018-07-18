package junit.classes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.classes.StringHelper;

public class StringHelperTest
{
	@Test
	public void test()
	{
		StringHelper stringHelper=new StringHelper();
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
}