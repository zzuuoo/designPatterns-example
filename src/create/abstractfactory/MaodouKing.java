package create.abstractfactory;

/**
 * 
 * MaodouKing
 *
 */
public class MaodouKing implements King {

  static final String DESCRIPTION = "这是毛豆小国王豆豆!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
