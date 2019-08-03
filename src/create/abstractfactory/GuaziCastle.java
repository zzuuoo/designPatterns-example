package create.abstractfactory;

/**
 * 
 * GuaziCastle
 *
 */
public class GuaziCastle implements Castle {

  static final String DESCRIPTION = "这是瓜子小城堡!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
