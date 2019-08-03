
package behavior.observer;


/**
 * 
 * 兽人 根据天气变化的举动
 *
 */
public class Orcs implements WeatherObserver {


  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        System.out.println("兽人冻僵了。");
        break;
      case RAINY:
        System.out.println("兽人在玩水。");
        break;
      case SUNNY:
        System.out.println("兽人的眼睛被阳光刺伤了。");
        break;
      case WINDY:
        System.out.println("兽人在吹风。");
        break;
      default:
        break;
    }
  }
}
