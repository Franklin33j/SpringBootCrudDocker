package com.libcode.crud.crud.users.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.libcode.crud.crud.users.entities.User;
import com.libcode.crud.crud.users.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;









@Controller
@RequestMapping(name = "/")
public class UserController {

@Autowired
UserRepository  _repository;

    @GetMapping("/users")
    public String listUser(Model model) {
        model.addAttribute("users", _repository.findAll());
        return "list-users";
        
    }

    @GetMapping("/nuevo")
    public String formularioNuevoUsuario(Model model) {
        model.addAttribute("usuario",new User());
        return "form-user";
    }
    @PostMapping("/nuevo")
    public String guardarUsuario(@ModelAttribute User user) {
        _repository.save(user);
        return "redirect:/users";
    }
    @GetMapping("/editar/{id}")
    public String FormularioEditarUsuario(@PathVariable Long id,Model model) {
        User user =_repository.findById(id).get();
        model.addAttribute("usuario",user );
        return "form-user";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id) {
        _repository.delete(new User(id));
        return "redirect:/users";
    }
    
}
