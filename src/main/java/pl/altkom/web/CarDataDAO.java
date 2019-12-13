package pl.altkom.web;

import javax.sql.DataSource;
import java.util.List;

public interface CarDataDAO {
    public void saveCarData(Car car, String dataSource) throws Exception;

    public List readCarsData(DataSource dataSource) throws Exception;
}
