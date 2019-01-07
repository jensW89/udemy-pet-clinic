package guruspringframework.udemypetclinic.controllers;

import guruspringframework.udemypetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jensW89
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model){


        model.addAttribute("ownsers", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwnsers(){
        return "notimplemented";
    }
}