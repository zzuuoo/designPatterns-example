package behavior.observer;


/**
 * 
 * 呱呱 根据天气变化的举动
 *
 */
public class GuaGua implements WeatherObserver {


  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        System.out.println("呱呱在这寒冷的天气瑟瑟发抖。");
        break;
      case RAINY:
        System.out.println("呱呱在大雨中寻找掩护。");
        break;
      case SUNNY:
        System.out.println("呱呱在温暖的阳光下嬉戏。");
        break;
      case WINDY:
        System.out.println("呱呱在刮风的天气尽情放风筝。");
        break;
      default:
        break;
    }
  }
}
