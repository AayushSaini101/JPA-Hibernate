package JPA.demo;

import JPA.demo.Model.Person;
import JPA.demo.Repositery.PersonCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    PersonCommand ob;


    @PostMapping("/insert")
    String insert(@RequestBody Person ob) {
        try {
            this.ob.save(ob);
            return "Successful";
        } catch (Exception e) {
            return "Error";
        }
    }

    @GetMapping(value = "/search/{id}", produces = "application/json")
    @ResponseBody
    List<Person> get(@PathVariable("id") int id) {
        List<Person> A = new ArrayList<>();
        Person ans=ob.getById(id);
        A.add(ans);
        return A;

    }
    @DeleteMapping(value = "/delete/{id}")
    void delete(@PathVariable("id") int id){
        ob.deleteById(id);
    }

}
