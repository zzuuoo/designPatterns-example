package create.abstractfactory;

/**
 * 
 * GuaziArmy
 *
 */
public class GuaziArmy implements Army {

  static final String DESCRIPTION = "这是瓜子小军队!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
