package page.med.Proyect_2springbootJava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class UsuarioController {
    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/personas")
    public String persona(Model model){
        model.addAttribute("persona", new Usuario());
        return "formusuario";
    }

    @GetMapping("/doctor")
    public String doctor(Model model){
        model.addAttribute("doctor", new Doctor());
        return "formdoctor";
    }

    @GetMapping("/citas")
    public String citas(Model model){
        model.addAttribute("cita", new Cita());
        return "formcita";
    }

}
