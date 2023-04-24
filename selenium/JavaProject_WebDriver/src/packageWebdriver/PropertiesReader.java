package packageWebdriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesReader {

	public static void main(String[] args) throws Exception 
	{
		
     FileInputStream ip=new  FileInputStream("/Users/karthik/Downloads/Professional/Reeth/git_repositories/coding/selenium/JavaProject_WebDriver/src/packageWebdriver/MyPropertiesFile.properties");
     
	 Properties prop=new Properties();
	  
	 prop.load(ip);
	 
	 System.out.println(prop.getProperty("Name"));
	 System.out.println(prop.getProperty("age"));
	 System.out.println(prop.getProperty("Browser"));
	 System.out.println(prop.getProperty("Colour"));

	}

}
