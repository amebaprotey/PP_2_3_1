package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.ServiceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Audi", 3, "black"));
        carList.add(new Car("BMW", 2, "white"));
        carList.add(new Car("KAMAZ", 10, "orange"));
        carList.add(new Car("ZIL", 5, "blue"));
        carList.add(new Car("GAZ", 3, "purple"));
    }
    @GetMapping(value = "/cars")
    public String getC(@RequestParam(value = "count", required = false) Integer count, ModelMap model){

        List<Car> newList = ServiceCar.getCars(carList,count);
        model.addAttribute("cars", newList);

        return "cars";
    }
}
