package guru.springframework.sfgpetclinic.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 7/22/18.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        System.out.println("asd1");

        System.out.println("asd");
        System.out.println("asd");
        System.out.println("asd");
        return "index";
    }
}
