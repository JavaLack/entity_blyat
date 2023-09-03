package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoImpl implements Dao {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "BMW", 12000));
        cars.add(new Car(7, "BMW", 35000));
        cars.add(new Car(3, "BMW M power", 50000));
        cars.add(new Car(222, "Mercedes", 55000));
        cars.add(new Car(124, "Mercedes", 8000));
    }

    @Override
    public List<Car> getCars(int count) {

        return cars.stream().limit(count).toList();
    }

//    @Override
//    public List<Car> getOllCars() {
//        return cars;
//    }
}
