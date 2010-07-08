package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.samples.client.Demo;

import com.google.gwt.dom.client.Element;

public class Radios implements Demo {

  public String getName() {
    return "Radios";
  }

  public String getDemoHtml() {
    return "buttons/radios.html";
  }

  public String getJavaSource() {
    return "buttons/Radios.java";
  }

  public void setupDemoElement(Element demo) {
    $("#radio", demo).as(Ui).buttonset();
  }
}
