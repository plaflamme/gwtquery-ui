package gwtquery.samples.client;

import static com.google.gwt.query.client.GQuery.$;
import gwtquery.samples.client.accordions.AccordionSamples;
import gwtquery.samples.client.buttons.ButtonSamples;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class GwtQueryUiModule implements EntryPoint {

  @UiTemplate("GwtQueryUiModule.ui.xml")
  interface Binder extends UiBinder<Widget, GwtQueryUiModule> {
  }

  private static Binder uiBinder = GWT.create(Binder.class);
  
  private final Widget app;

  private final Map<String, Widget> samples = new HashMap<String, Widget>();

  @UiField
  HTMLPanel demoLinks;

  @UiField
  HasWidgets center;
  
  public GwtQueryUiModule() {
    samples.put("AccordionSamples", new AccordionSamples());
    samples.put("ButtonSamples", new ButtonSamples());
    app = uiBinder.createAndBindUi(this);
  }

  public void onModuleLoad() {
    RootLayoutPanel.get().add(app);

    $("a", demoLinks.getElement()).click(new Function() {
      @Override
      public boolean f(Event e) {
        center.clear();
        center.add(samples.get($(e).attr("href")));
        return false;
      }
    });
  }

}