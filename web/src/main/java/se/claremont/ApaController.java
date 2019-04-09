package se.claremont;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApaController {

    @Value("${db.host}")
    String dbHost;

    @RequestMapping("/apa")
    public Apa greeting() {
        System.out.println("The db host: " + dbHost);
        return new Apa(1, "Lars");
    }
}
