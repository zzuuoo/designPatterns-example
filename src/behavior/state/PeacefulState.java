
package behavior.state;



/**
 * 
 * 平静 状态.
 *
 */
public class PeacefulState implements State {


  private Mammoth mammoth;

  public PeacefulState(Mammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {

    System.out.println(mammoth+" 平和又平静。");
  }

  @Override
  public void onEnterState() {
    System.out.println(mammoth +" 正在冷静！");
  }

}
