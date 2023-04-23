package web.servise;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceCar {
    public static List<Car> getCars(List<Car> carList, Integer numberOfCars){
        if (numberOfCars == null){
            return carList;
        }

        return carList.stream().limit(numberOfCars).collect(Collectors.toList());

    }
}
