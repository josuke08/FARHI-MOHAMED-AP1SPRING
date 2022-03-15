package Dao;

import org.springframework.stereotype.Component;

@Component("Dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de données");
        double data=66;
        return data;
    }}

