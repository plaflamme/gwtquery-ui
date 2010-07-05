package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class Checkboxes extends BaseDemoPanel {

  @UiTemplate("Checkboxes.ui.xml")
  interface MyBinder extends UiBinder<Widget, Checkboxes> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  public Checkboxes() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setupDemo(Element demo) {
    // TODO: implement buttonset
    $("#check", demo).as(Ui).button();
    $("#format", demo).as(Ui).button();
  }
}
