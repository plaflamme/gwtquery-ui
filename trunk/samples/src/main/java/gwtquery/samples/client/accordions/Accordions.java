package gwtquery.samples.client.accordions;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.samples.client.Demo;

import com.google.gwt.dom.client.Element;

public class Accordions implements Demo {

  public String getName() {
    return "Default Functionality";
  }

  public String getDemoHtml() {
    return "accordions/accordions.html";
  }
  
  public String getJavaSource() {
    return "accordions/Accordions.java";
  }

  public void setupDemoElement(Element demo) {
    $("#accordion", demo).as(Ui).accordion();
  }
}
