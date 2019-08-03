package create.abstractfactory;

/**
 * 
 * MaodouCastle
 *
 */
public class MaodouCastle implements Castle {

  static final String DESCRIPTION = "这是毛豆小城堡!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
