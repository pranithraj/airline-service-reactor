import java.sql.Connection;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pranith.airline.MySQLConnector;
import com.pranith.airline.service.AirlineService;
import com.pranith.airline.service.injector.AirlineServiceInjector;

import model.AirCraft;

public class DemoTest {

    public static void main(String[] args) throws Exception{
        Injector injector = Guice.createInjector(new AirlineServiceInjector());

        AirlineService app = injector.getInstance(AirlineService.class);
        Connection connection = MySQLConnector.getConnection();
        System.out.println(connection);

        AirlineService airlineService = new AirlineService();
        List<AirCraft> result = app.findAircraftDetailsByAircraftName("oe");

        System.out.println(result);
    }
}
