package pl.altkom.web.dao;

import pl.altkom.web.Car;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.util.List;

public class CarDataDAOImpl implements CarDataDAO {
    @Override
    public void saveCarData(Car car, String dataSource) throws Exception {
        InitialContext initCtx = new InitialContext();

    }

    @Override
    public List readCarsData(DataSource dataSource) throws Exception {
        return null;
    }
}
