
package behavior.state;



/**
 * 
 * 愤怒状态
 *
 */
public class AngryState implements State {


  private Mammoth mammoth;

  public AngryState(Mammoth mammoth) {
    this.mammoth = mammoth;
  }

  @Override
  public void observe() {
    System.out.println(mammoth +" 狂怒中！");
  }

  @Override
  public void onEnterState() {
    System.out.println(mammoth +" 正在生气!");
  }

}
