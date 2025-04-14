package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.List;

@Component
public interface CarService {

    List<Car> getIndex(int count);


}
