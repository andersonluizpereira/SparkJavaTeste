package br.com.spa.sistema;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         try {
        	 new Config().setConfig();
     		new Routes().setRoutes();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
