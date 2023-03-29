package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/cars")
public class CarController {

    private final CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count",required = false,defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars",carDAO.getCars(count));
        return "cars";
    }

//    @GetMapping("/{count}")
//    public String getOneCar(@PathVariable("count") Integer count, Model model) {
//        model.addAttribute("car",carDAO.getOneCar(count));
//        return "cars";
//    }
}
