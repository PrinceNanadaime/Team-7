package web.service;

import lombok.Data;
import org.springframework.transaction.annotation.Transactional;
import web.models.Car;
import web.models.Location;
import web.models.User;

import java.util.List;

@Data
@org.springframework.stereotype.Service
@Transactional
public class Service {

    private List<Car> cars;
    private List<User> users;
    private List<Location> locations;

    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) return user;
        }
        return null;
    }

    public void createUser(User user){
        users.add(user);
    }

    public void createCar(Car car){
        cars.add(car);
    }

    public Car getCarByTag(String tag) {
        for (Car car : cars) {
            if (car.getTag().equals(tag)) return car;
        }
        return null;
    }

    public void createLocation(Location location){
        locations.add(location);
    }

    public Location getLocationByCity(String loc) {
        for (Location location : locations) {
            if (location.getCity().equals(loc)) return location;
        }
        return null;
    }
}
