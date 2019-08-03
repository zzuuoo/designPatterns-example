
package behavior.observer;

/**
 * 
 * 观察者接口，想订阅天气变化，必须实现该接口
 * 
 */
public interface WeatherObserver {

  void update(WeatherType currentWeather);

}
