package UstBatch.DI_Constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("Application.xml");  
    	Roles r=context.getBean("setter",Roles.class);
    	r.display();
    }
    
}
