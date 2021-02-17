package com.sr.genericlib;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Prateek
 *
 */
public class Propertyfile implements AutoConstant{
/**
 * To get data from Excel
 * @param keysvalue
 * @return
 * @throws FileNotFoundException
 * @throws IOException
 */
	public String getPropertyData(String keysvalue) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream(propertyfilepath));
	return p.getProperty(keysvalue);
	
	
	
	
	
}
	
}
