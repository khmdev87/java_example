package singleton.after;

import java.io.Serializable;
/*
자바에서 라이브러리나 프레임웤없이 가장 안전하게 싱글톤을 생성할 수 있는 방법 중의 하나는 inner static class singleton입니다.
이 방법을 사용하면 멀티쓰레드에 안전하고, Lazy loading을 지원하며, serialization에도 안전한 싱글톤을 만들 수 있습니다.
 */

public class InnerStaticSingleton implements Serializable {

  private InnerStaticSingleton() {
  }

  public static InnerStaticSingleton getInstance() {
    return InnerClass.instance;
  }

  private static class InnerClass {
    private static final InnerStaticSingleton instance = new InnerStaticSingleton();
  }
}