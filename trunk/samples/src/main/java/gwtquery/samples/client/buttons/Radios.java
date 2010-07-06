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
    return new StringBuilder() //
    .append("<div class=\"demo\">") //
    .append("<form>") //
    .append("<div id=\"radio\">") //
    .append("<input type=\"radio\" id=\"radio1\" name=\"radio\" />") //
    .append("<label for=\"radio1\">Choice 1</label>") //
    .append("<input type=\"radio\" id=\"radio2\" name=\"radio\" checked=\"checked\"/>") //
    .append("<label for=\"radio2\">Choice 2</label>") //
    .append("<input type=\"radio\" id=\"radio1\" name=\"radio\" />") //
    .append("<label for=\"radio1\">Choice 1</label>") //
    .append("</div></form>") //
    .append("</div>") //
    .append("<div class=\"demo-description\">") //
    .append("<p>A set of three radio buttons transformed into a button set.</p>") //
    .append("</div>").toString();
  }

  public void setupDemoElement(Element demo) {
    // TODO: implement buttonset
    $("#radio", demo).as(Ui).button();
  }
}
