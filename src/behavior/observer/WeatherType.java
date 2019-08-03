
package behavior.observer;

/**
 * 
 * 天气类型 枚举
 * 
 */
public enum WeatherType {

  /**
   * 天气类型
   */
  SUNNY("阳光"), RAINY("大雨"), WINDY("微风"), COLD("寒冷");

  private String name;
  WeatherType(String name){
    this.name= name;

  }
  @Override
  public String toString() {
    return this.name.toLowerCase();
  }
}
