package com.flipkart;
import com.flipkart.controller.*;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *Application config is a dropwizard config class which contains the initialized and run method in which we need to register all the restful controller
 * inside a jersey container which is running inside the dropwizard container
 */
public class App extends Application<Configuration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        e.jersey().register(new HelloRestController());
        e.jersey().register(new EmployeeRestController(e.getValidator()));
        e.jersey().register(new UserRestController(e.getValidator()));
        e.jersey().register(new AdminRestController(e.getValidator()));

        e.jersey().register(new ProfessorRestController(e.getValidator()));

        e.jersey().register(new StudentRestController(e.getValidator()));


<<<<<<< HEAD

=======
>>>>>>> 6f36733e091f5566839659445a53cee8aede44a9
>>>>>>> 756eb04ad6c81c7792286df0e2dd952c95daf0b7
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}