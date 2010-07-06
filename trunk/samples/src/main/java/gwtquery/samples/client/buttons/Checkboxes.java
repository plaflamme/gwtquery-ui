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
    return new StringBuilder() //
    .append("<div class=\"demo\">") //
    .append("<input type=\"checkbox\" id=\"check\" />") //
    .append("<label for=\"check\">Toggle</label>") //
    .append("<div id=\"format\">") //
    .append("<input type=\"checkbox\" id=\"check1\" />") //
    .append("<label for=\"check1\">B</label>") //
    .append("<input type=\"checkbox\" id=\"check2\" />") //
    .append("<label for=\"check2\">I</label>") //
    .append("<input type=\"checkbox\" id=\"check3\" />") //
    .append("<label for=\"check3\">U</label>") //
    .append("</div>") //
    .append("</div>") //
    .append("<div class=\"demo-description\">") //
    .append("<p>A checkbox is styled as a toggle button with the button widget. The label element associated with the checkbox is used for the button text.</p>") //
    .append("<p>This demo also demonstrates three checkboxes styled as a button set by calling <code>.buttonset()</code> on a common container.</p>") //
    .append("</div>").toString();

  }

  public void setupDemoElement(Element demo) {
    // TODO: implement buttonset
    $("#check", demo).as(Ui).button();
    $("#format", demo).as(Ui).button();
  }

}
