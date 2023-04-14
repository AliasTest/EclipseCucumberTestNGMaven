package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private String propertyFilePath = "src//test//resources//Configurations.properties";

	public String getProprtyUrl(String urlName) throws IOException {		
	
		FileInputStream in = new FileInputStream(propertyFilePath);		
		Properties properties = new Properties();
		properties.load(in);		
		String url = properties.getProperty(urlName);
		in.close();		
		if (url != null)
			return url;
		else
			throw new RuntimeException("reqresUrl not specified in the Configuration.properties file.");
	}

	public void setProprtyKeyValue(String key, String value) throws IOException {		
		FileInputStream in = new FileInputStream(propertyFilePath);		
		Properties props = new Properties();
		props.load(in);		
		props.setProperty(key, value);
		in.close();
		FileOutputStream out = new FileOutputStream(propertyFilePath);
		props.store(out, null);
		out.close();
		props.clone();
	}
}
