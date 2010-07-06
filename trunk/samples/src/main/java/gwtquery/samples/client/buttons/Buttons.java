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
    return new StringBuilder()
    .append("<div class=\"demo\">") //
    .append("<button>A button element</button>") //
    .append("<input value=\"A submit button\" type=\"submit\" />") //
    .append("<a href=\"#\">An anchor</a>") //
    .append("</div>") //
    .append("<div class=\"demo-description\">") //
    .append("<p>Examples of the markup that can be used for buttons: A button element, an input of type submit and an anchor.</p>")//
    .append("</div>").toString();
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
