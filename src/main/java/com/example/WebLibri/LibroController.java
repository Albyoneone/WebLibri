package com.example.WebLibri;

import org.springframework.ui.Model;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LibroController {

    @GetMapping("/registrazione")
    public String registraForm(User user){
        return "formUtente";
    }

    @PostMapping("/registrazione")
    public String PostRegistraForm(@Valid User user, BindingResult binding){
        if (binding.hasErrors()){
            return"formUtente";
        }
        utenti.add(user);
        return "redirect:/";
    }

    //Step successivo

    @GetMapping("/")
    public String login(User user){
        return "loginForm";
    }

    @PostMapping("/")
    public String postLogin(@Valid User user, BindingResult binding){
        if (binding.hasErrors()){
            return"loginForm";
        }
        if (controllaUser(user)){
            user.setCheck(true);
            return"loginForm";
        }
        user.setCheck(false);
        return "redirect:/libroForm";
    }

    //Step successivo

    @GetMapping("/libroForm")
    public String aggiungiForm(Libri libri){
        return "libroForm";
    }

    @PostMapping("/libroForm")
    public String aggiungiForm(@Valid Libri libri, BindingResult binding){
        if (binding.hasErrors()){
            return"libroForm";
        }
        raccoltaLibri.add(libri);
        return "redirect:/risultato";
    }

    @GetMapping("/risultato")
    public String paginaRisultato(){
        return"risultato";
    }

    public boolean controllaUser(User user){
        for(User u: utenti){
            if (user.getUsername().equals(u.getUsername())){
                if (user.getPassword().equals(u.getPassword())){
                    return false;
                }
            }
        }
        return true;
    }

    @GetMapping("/lista_libri")
    public String listaDeiLibri(){
        return"listaLibri";
    }



    public static List<User> utenti = new ArrayList<>();
    public static List<Libri> raccoltaLibri = new ArrayList<>();
}
