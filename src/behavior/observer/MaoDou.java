
package behavior.observer;


/**
 * 
 * 毛豆 根据天气变化的举动
 *
 */
public class MaoDou implements WeatherObserver {


  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        System.out.println("毛豆冻僵了。");
        break;
      case RAINY:
        System.out.println("毛豆在玩水。");
        break;
      case SUNNY:
        System.out.println("毛豆的眼睛被阳光刺伤了。");
        break;
      case WINDY:
        System.out.println("毛豆在吹风。");
        break;
      default:
        break;
    }
  }
}
