package xxx.xxx;

import spark.Spark;
import xxx.xxx.util.Instantiator;

public class App {
    
	public static void main(String[] args) throws Exception {
		
		Spark.port(8080);
		
		Instantiator.start();
    }
}