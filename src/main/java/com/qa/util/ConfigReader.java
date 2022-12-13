package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	// This method is used to load the properties from config.properties file(Bu yöntem, özellikleri config.properties dosyasından yüklemek için kullanılır.)
	// Connects to config.properties file and load properties(config.properties dosyası ile bağlantı sağlar ve özellikleri yükler)
	public Properties init_prop() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}


}
