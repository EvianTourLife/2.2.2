package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car( "Tesla",2023,1));
        cars.add(new Car( "Lada Samara",1997,47));
        cars.add(new Car( "BMW",2015,3));
        cars.add(new Car( "Mercedes",2018,2));
        cars.add(new Car( "Bugatti",2010,4));

    }
    public List<Car> getCars(int count){
        if (count>=5) {
            return cars;
        }
        return Collections.singletonList(cars.get(count));
    }
//    public List<Car> getOneCar(int count){
//        if (count>=5){
//            return cars;
//        }
//        return cars.stream().filter(car -> car.getCount()==count).findAny().stream().toList();
//    }
}
