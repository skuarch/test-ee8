package controller;

import application.GreetingService;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import model.Hello;

/**
 *
 * @author skuarch
 */
@Controller
@Path("hello")
public class HelloController {
    
    @Inject
    GreetingService gs;
    
    @Inject
    Models models;
    
    @Inject
    Hello hello;
    
    @GET
    public String index(){
        
        String message = gs.message();
        hello.setMessage(message);
        models.put("helloModel", hello);
        return "/hello.jsp";
        
    }
    
}
