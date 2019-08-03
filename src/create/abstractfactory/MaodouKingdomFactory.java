package create.abstractfactory;

/**
 * 
 * MaodouKingdomFactory
 * 
 */
public class MaodouKingdomFactory implements KingdomFactory {

  @Override
  public Castle createCastle() {
    return new MaodouCastle();
  }

  @Override
  public King createKing() {
    return new MaodouKing();
  }

  @Override
  public Army createArmy() {
    return new MaodouArmy();
  }
}
