package create.abstractfactory;

/**
 * 
 * GuaziKing
 *
 */
public class GuaziKing implements King {

  static final String DESCRIPTION = "这是瓜子国王呱呱!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
