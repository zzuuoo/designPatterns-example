package behavior.observer;


/**
 * 
 * 霍尔比特人 根据天气变化的举动
 *
 */
public class Hobbits implements WeatherObserver {


  @Override
  public void update(WeatherType currentWeather) {
    switch (currentWeather) {
      case COLD:
        System.out.println("霍尔比特人在这寒冷的天气瑟瑟发抖。");
        break;
      case RAINY:
        System.out.println("霍尔比特人在大雨中寻找掩护。");
        break;
      case SUNNY:
        System.out.println("霍尔比特人在温暖的阳光下嬉戏。");
        break;
      case WINDY:
        System.out.println("霍尔比特人在刮风的天气尽情放风筝。");
        break;
      default:
        break;
    }
  }
}
