package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class ButtonSamples extends Composite {

  @UiTemplate("ButtonSamples.ui.xml")
  interface MyBinder extends UiBinder<Widget, ButtonSamples> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  private Map<String, Widget> widgets = new HashMap<String, Widget>();

  @UiField
  FlowPanel center;

  @UiField
  HTMLPanel demoLinks;

  public ButtonSamples() {
    initWidget(uiBinder.createAndBindUi(this));
    widgets.put("Buttons", new Buttons());
    widgets.put("Radios", new Radios());
    widgets.put("Checkboxes", new Checkboxes());
    widgets.put("Icons", new Icons());
    $("a", demoLinks.getElement()).as(Ui).button().click(new Function() {
      @Override
      public boolean f(Event e) {
        center.clear();
        center.add(widgets.get($(e).attr("id")));
        return false;
      }
    });
  }
}
