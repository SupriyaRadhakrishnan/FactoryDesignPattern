package com.phone;

public class OperatingSystemFactory {

	
	public OS getInstance(String s)
	{
		if(s.equals("Open"))
			return new Android();

		else if(s.equals("Closed"))
		    return new IOS();
		else
			return new Windows();
	}
}
