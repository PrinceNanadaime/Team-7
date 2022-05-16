package web.config;

import org.springframework.context.annotation.Configuration;
import web.models.Car;
import web.models.Location;
import web.models.User;
import web.service.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Configuration
public class Initializer {

    @Resource
    private Service service;

    @PostConstruct
    public void initialize() {
        Location location1 = new Location("Ufa","address");
        Location location2 = new Location("Moscow","address");
        Location location3 = new Location("Saint-Petersburg","address");
        Location location4 = new Location("Omsk","address");
        Location location5 = new Location("Novosibirsk","address");
        Location location6 = new Location("Kazan","address");
        service.setLocations(List.of(location1,location2,location3,location4,location5,location6));

        Car smart1 = new Car("Smart Forfour","SomeText");
        Car smart2 = new Car("Smart Brabus","SomeText");
        Car smart3 = new Car("Smart Cabrio","SomeText");
        Car smart4 = new Car("Smart EQ","SomeText");
        Car smart5 = new Car("Smart Crossblade","SomeText");
        service.setCars(List.of(smart1,smart2,smart3,smart4,smart5));

        User user1 = new User("Kirill","Leontyev",20,smart1);
        User user2 = new User("Nikita","Kotenkov",20,smart2);
        User user3 = new User("Aleksey","Denisenko",20,smart3);
        User user4 = new User("Matvey","Martyushov",20,smart4);
        User user5 = new User("Maksim","Kamnev",20,smart5);
        service.setUsers(List.of(user1,user2,user3,user4,user5));
    }
}
