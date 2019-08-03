package create.abstractfactory;

/**
 * 
 * GuaziKingdomFactory
 * 
 */
public class GuaziKingdomFactory implements KingdomFactory {

  @Override
  public Castle createCastle() {
    return new GuaziCastle();
  }

  @Override
  public King createKing() {
    return new GuaziKing();
  }

  @Override
  public Army createArmy() {
    return new GuaziArmy();
  }

}
