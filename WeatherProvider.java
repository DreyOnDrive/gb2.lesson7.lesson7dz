package gb2.lesson7.lesson7dz;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException;
}
