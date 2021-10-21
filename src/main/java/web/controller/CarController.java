package web.controller;

import web.Model.Car;
import web.Servise.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

	CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars")
	public String cars(@RequestParam(value = "count",required = false,defaultValue = "5")Integer count, Model model){
		List<Car> list = carService.list();
		model.addAttribute("cars", carService.getCar(count));
		return "cars";
	}

}
