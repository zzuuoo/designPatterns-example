package create.abstractfactory;

/**
 * 抽象工厂
 */
public class Client {


  private King king;
  private Castle castle;
  private Army army;

  /**
   * Creates kingdom
   */
  public void createKingdom(final KingdomFactory factory) {
    setKing(factory.createKing());
    setCastle(factory.createCastle());
    setArmy(factory.createArmy());
  }

  King getKing(final KingdomFactory factory) {
    return factory.createKing();
  }

  public King getKing() {
    return king;
  }

  private void setKing(final King king) {
    this.king = king;
  }


  public Castle getCastle() {
    return castle;
  }

  private void setCastle(final Castle castle) {
    this.castle = castle;
  }
  
  Army getArmy(final KingdomFactory factory) {
    return factory.createArmy();
  }

  public Army getArmy() {
    return army;
  }

  private void setArmy(final Army army) {
    this.army = army;
  }
  

  public static void main(String[] args) {

    Client client = new Client();

    System.out.println("瓜子王国");
    client.createKingdom(new GuaziKingdomFactory());
    System.out.println(client.getArmy().getDescription());
    System.out.println(client.getCastle().getDescription());
    System.out.println(client.getKing().getDescription());


    System.out.println("毛豆王国");
    client.createKingdom(new MaodouKingdomFactory());
    System.out.println(client.getArmy().getDescription());
    System.out.println(client.getCastle().getDescription());
    System.out.println(client.getKing().getDescription());


  }

}
