package web.DAO;

import web.Model.Car;

import java.util.List;


public interface DAO {
    List<Car> getCars(int count);

//    List<Car> getOllCars();
}
