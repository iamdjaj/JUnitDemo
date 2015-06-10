package forDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


public class JunitDemo {
	
@Rule 
public TestName name = new TestName();

@Before
    public void init() {
//The common part that each case will need to do, like launching a browser, loading iheart.com..
        
    }

   
@Test
public void testHomeWork1() throws Exception
{   
System.out.println("test method:" +  name.getMethodName() );
//assertEquals(name.getMethodName(), "testHomeWork1 ");
//assertEquals(1, 2);  this will fail
assertEquals(1, 1);
//assertTrue();
//assertFalse();
//assertThat(actual, is(equalTo(expected)));
//if (music is not playing) 
// fail("HW needs more debugging!");
}

@Test
public void testHomeWork2() throws Exception
{   
System.out.println("test method:" +  name.getMethodName() );
//assertEquals(name.getMethodName(), "testHomeWork1 ");
assertEquals(1, 1);
//assertTrue();
//assertFalse();
//assertThat(actual, is(equalTo(expected)));
//if (music is not playing) 
// fail("HW needs more debugging!");
}

@After
    public void tearDown() throws Exception{
    //closeBrowser;
//other cleanups
    }
}
