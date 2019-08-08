
package behavior.state;

/**
 * 状态模式
 */
public class Client {

  public static void main(String[] args) {

    Mammoth mammoth = new Mammoth();
    mammoth.observe();

    mammoth.timePasses();
    mammoth.observe();

    mammoth.timePasses();
    mammoth.observe();

  }
}
