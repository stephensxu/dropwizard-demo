package com.yammer.dropwizarddemo;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.io.IOException;
import java.sql.SQLException;

public class SampleService extends Application<SampleConfiguration> {
    public static void main(String[] args) throws Exception {
        new SampleService().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {

    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HellowWorldResource());
    }

    public void hi() throws SQLException {
        try {
            throw new IOException("crap!");
        } catch (IOException e) {
            throw new SQLException(e);
        }
    }
}
