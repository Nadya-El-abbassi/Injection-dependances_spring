package net.nadya.dao;

import org.springframework.stereotype.Component;

import static java.io.IO.print;

@Component
public class daoImpl implements Idao {
    @Override
    public double getdata() {
        System.out.println("version base se données");
        double t=34;
        return t;
    }
}
