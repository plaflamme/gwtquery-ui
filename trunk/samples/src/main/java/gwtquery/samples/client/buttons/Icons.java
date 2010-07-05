package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Widget;

public class Icons extends BaseDemoPanel {

  @UiTemplate("Icons.ui.xml")
  interface MyBinder extends UiBinder<Widget, Icons> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  public Icons() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setupDemo(Element demo) {
    $("button", demo).eq(0) //
    .as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-locked")).text(false)).next()//
    .as(Ui).button("{icons: {primary: 'ui-icon-locked'}}").next()//
    .as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-gear").secondary("ui-icon-triangle-1-s"))).next()//
    .as(Ui).button("{icons: {primary: 'ui-icon-gear',secondary: 'ui-icon-triangle-1-s'}, text: false}");
  }
}
