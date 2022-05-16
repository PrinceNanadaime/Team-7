package web.controllers;

import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.models.Location;
import web.models.User;
import web.service.Service;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UsersController {

    @Resource
    private Service service;

    @GetMapping("/finduser")
    public User getUserByName(@RequestBody String name) {
        return service.getUserByName(name);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        service.createUser(user);
    }

    @GetMapping("/findcar")
    public Car getCarByTag(@RequestBody String tag) {
        return service.getCarByTag(tag);
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return service.getCars();
    }

    @PostMapping("/car")
    public void createCar(@RequestBody Car car) {
        service.createCar(car);
    }

    @GetMapping("/findlocation")
    public Location getByCity(@RequestBody String city){
        return service.getLocationByCity(city);
    }
    @GetMapping("/locations")
    public List<Location> getLocations() {
        return service.getLocations();
    }

    @PostMapping("/location")
    public void createLocation(@RequestBody Location location) {
        service.createLocation(location);
    }
}
