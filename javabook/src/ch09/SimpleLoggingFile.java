package ch09;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLoggingFile {
	private final static Logger logger = Logger.getLogger(SimpleLoggingFile.class.getName());
	public static void main(String[] args) throws SecurityException, IOException{
		FileHandler fHandler = new FileHandler("mylog_%g.log");
		logger.addHandler(fHandler);
		logger.log(Level.INFO,"info log");
		logger.info("method type info log");
		logger.warning("method type warn log");
		logger.severe("method type severe log");
		
	}
}
