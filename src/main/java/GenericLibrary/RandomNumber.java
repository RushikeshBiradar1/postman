package GenericLibrary;

import java.util.Random;

import org.junit.Test;

public class RandomNumber {
	@Test
	public int GetRandomNumber()
	{
		Random ran = new Random();
		return(ran.nextInt());
	}

}
