package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.samples.client.Demo;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class Buttons implements Demo {
  
  public String getName() {
    return "Default Functionality";
  }
  
  public String getDemoHtml() {
    return "buttons/buttons.html";
  }

  public void setupDemoElement(Element demo) {
    $("button, a, input", demo).as(Ui).button();

    $("a", demo).click(new Function() {
      @Override
      public boolean f(Event e) {
        return false;
      }
    });

  }
}
