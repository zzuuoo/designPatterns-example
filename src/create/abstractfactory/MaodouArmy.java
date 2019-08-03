package create.abstractfactory;

/**
 * 
 * MaodouArmy
 *
 */
public class MaodouArmy implements Army {

  static final String DESCRIPTION = "这是毛豆小军队!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
