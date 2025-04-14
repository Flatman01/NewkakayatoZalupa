package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", "Competition"));
        cars.add(new Car("Audi", "A4", "ABT"));
        cars.add(new Car("Skoda", "Octavia", "RS"));
        cars.add(new Car("Volkswagen", "Polo", "Pushka Gonka"));
        cars.add(new Car("Geely", "Monjaro", "Luxary+Promax"));

    }

    public List<Car> getIndex(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
