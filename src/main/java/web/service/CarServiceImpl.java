package web.service;

import web.DAO.DAO;
import web.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    @Autowired
    DAO dao;
    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            count = 5;
        } else if (count < 0) {
            count = 0;
        }

        return dao.getCars(count);
    }
}
