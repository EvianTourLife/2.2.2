package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;


@Controller
public class CarController {

    private final CarDaoImp carDaoImp;
    @Autowired
    public CarController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count",required = false,defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carDaoImp.getCars(count));
        return "cars";
    }

}
