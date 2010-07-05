package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;

public class Buttons extends BaseDemoPanel {

  @UiTemplate("Buttons.ui.xml")
  interface MyBinder extends UiBinder<Widget, Buttons> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  public Buttons() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setupDemo(Element demo) {
    $("button, a, input", demo).as(Ui).button();

    $("a", demo).click(new Function() {
      @Override
      public boolean f(Event e) {
        return false;
      }
    });

  }
}
