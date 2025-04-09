package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.List;

@Component
public interface CarService {

    List<Car> getIndex(int count);

    Car getCar(int index);


}
