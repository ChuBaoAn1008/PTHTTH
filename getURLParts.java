package lab3;

import java.net.MalformedURLException;
import java.net.URL;
public class getURLParts {
	public static void main(String[] args)
	{
			try
			{
				URL u = new URL("https://mobilesprogramming.wordpress.com/2010/07/08/l%E1%BA%ADp-trinh-m%E1%BA%A1ng-trong-java/");
				System.out.println("URL is "+u);
				System.out.println("The protocol part is "+u.getProtocol());
				System.out.println("The host part is "+u.getHost());
				System.out.println("The file part is "+u.getFile());
				System.out.println("The reference part is "+u.getRef());
			}
			catch(MalformedURLException e)
				{
					System.err.println(e);
				}
	}
}
