

package labspringdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) {
        
        
        final AbstractApplicationContext ctx=   
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");
        
        
        Owner owner = (Owner)ctx.getBean("owner");
        owner.getPet().speak();
        
        
        
//        Pet dog1 = new Dog();
//        
//        Owner owner1 = new Owner(dog1);
//        
//        owner1.getPet().speak();
//        
        
        
    }
    
}
