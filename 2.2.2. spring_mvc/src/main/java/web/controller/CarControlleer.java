package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/making_car")
public class CarControlleer {

    @GetMapping("/cars")
    //@RequestParam(value = "car" - для передачи GET запроса /making_car?car=значения
    // required = false - это если не будет никакого значения то передается null
    public String printHTMLCar(Model model, @RequestParam(value = "count", required = false) String count) {

        Car bmw1 = new Car(1L, "BMW", 1);
        Car bmw2 = new Car(2L, "BMW", 2);
        Car bmw3 = new Car(3L, "BMW", 3);
        Car bmw4 = new Car(4L, "BMW", 4);
        Car bmw5 = new Car(5L, "BMW", 5);

        List<Car> list = new ArrayList<>();
        int z = Integer.parseInt(count);
        if (z >= 1 && z <= 5){
            switch (Integer.parseInt(count)){
                case (1):
                    list.add(bmw1);
                    break;
                case (2):
                    list.add(bmw1);
                    list.add(bmw2);
                    break;
                case (3):
                    list.add(bmw1);
                    list.add(bmw2);
                    list.add(bmw3);
                    break;
                case (4):
                    list.add(bmw1);
                    list.add(bmw2);
                    list.add(bmw3);
                    list.add(bmw4);
                    break;
                case (5):
                    list.add(bmw1);
                    list.add(bmw2);
                    list.add(bmw3);
                    list.add(bmw4);
                    list.add(bmw5);
                    break;
            }
        } else if (z > 5){
            list.add(bmw1);
            list.add(bmw2);
            list.add(bmw3);
            list.add(bmw4);
            list.add(bmw5);
        }




        model.addAttribute("cars", list);
        System.out.println("Значения гет запроса cars=" + count);
        return "cars";
    }

}