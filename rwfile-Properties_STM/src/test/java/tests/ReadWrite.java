package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\rwfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstream);
		
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\rwfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata", "1234567890");
		properties.store(outputstream, "This is Customer Data from TC");
		
	}

}
