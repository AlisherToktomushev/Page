package com.project.Controller;

import com.project.DAO.personDAO;
import com.project.model.Person;
import com.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String getAll(Model model) {
        List<Person> all = personService.getAll();
        model.addAttribute("allEmps", all);
        return "all-person";
    }

    @RequestMapping("/addNewPerson")
    public String addNewPerson(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
            return "person-info";


    }

    @RequestMapping("/savePerson")
    public String savePerson( @ModelAttribute("person") Person person) {
        personService.savePerson(person);
            return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updatePerson(@RequestParam("empId") int id,Model model){
 Person person=personService.getPerson(id);
 model.addAttribute("person",person);

        return"person-info";

    }
    @RequestMapping("/deletePerson")
    public String deletePerson(@RequestParam("empId") int id){
        personService.deletePerson(id);
        return "redirect:/";

    }
}
