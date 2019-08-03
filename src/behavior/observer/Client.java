
package behavior.observer;

public class Client {
  public static void main(String[] args) {

    Weather weather = new Weather();
    weather.addObserver(new MaoDou());
    weather.addObserver(new GuaGua());

    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
  }
}
