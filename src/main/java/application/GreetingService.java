
package application;

import javax.ejb.Stateless;

/**
 *
 * @author skuarch
 */
@Stateless
public class GreetingService {
    
    public String message(){
        return "hello " + System.currentTimeMillis();
    }
    
}
