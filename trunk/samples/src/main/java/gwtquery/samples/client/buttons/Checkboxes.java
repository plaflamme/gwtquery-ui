package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.samples.client.Demo;

import com.google.gwt.dom.client.Element;

public class Checkboxes implements Demo {

  public String getName() {
    return "Checkboxes";
  }

  public String getDemoHtml() {
    return "buttons/checkboxes.html";
  }

  public void setupDemoElement(Element demo) {
    $("#check", demo).as(Ui).button();
    $("#format", demo).as(Ui).buttonset();
  }

}
