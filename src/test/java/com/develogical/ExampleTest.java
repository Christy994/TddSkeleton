package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {

	@Test
	public void listEmptyOnInit()
	{
		assertThat(new ApeList().getSize(), is(0));
	}

	@Test
	public void isSizeUpdates()
	{
	    ApeList list = new ApeList();
	    list.add("123");
		assertThat(list.getSize(), is(1));
	}


	@Test
	public void add()
	{
		assertThat(new ApeList().add("07757922540"), is(true));
	}

    @Test
    public void addAndRetrieve()
    {
        ApeList list = new ApeList();
        String myNumber = "123";
        list.add(myNumber);
        assertThat(list.get(), is(myNumber));
    }

    @Test
    public void getMostRecentItem()
    {
        ApeList list = new ApeList();
        String firstNum = "123";
        String secondNum = "1234";
        list.add(firstNum);
        list.add(secondNum);
        assertThat(list.get(), is(secondNum));
    }

    @Test
    public void removeDuplicates()
    {
        ApeList list = new ApeList();
        String firstNum = "123";
        String secondNum = "1234";
        list.add(firstNum);
        list.add(secondNum);
        list.add(firstNum);
        assertThat(list.getSize(), is(2));
        assertThat(list.get(), is(firstNum));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNonNumeric()
    {
        ApeList list = new ApeList();
        list.add("dfdsfsdf");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEmpty()
    {
        ApeList list = new ApeList();
        list.add(null);
    }


}
