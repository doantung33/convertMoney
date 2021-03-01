package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController{
    @GetMapping
    public ModelAndView modelAndView(){
        ModelAndView modelAndView= new ModelAndView("list");
        return modelAndView;
    }
    @PostMapping
    public String convert(@RequestParam int vnd ,ModelMap modelMap){
        int usd=vnd*23000;
        modelMap.addAttribute("vnd",usd);
        return "list";
    }

}
