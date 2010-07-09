package gwtquery.samples.client;

import gwtquery.samples.client.accordions.AccordionSamples;
import gwtquery.samples.client.buttons.ButtonSamples;
import gwtquery.samples.client.selectables.SelectableSamples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class GwtQueryUiModule implements EntryPoint {

  @UiTemplate("GwtQueryUiModule.ui.xml")
  interface Binder extends UiBinder<Widget, GwtQueryUiModule> {
  }

  private static Binder uiBinder = GWT.create(Binder.class);

  private final Widget app;

  @UiField
  FlowPanel demos;

  @UiField
  HasWidgets demo;

  public GwtQueryUiModule() {
    app = uiBinder.createAndBindUi(this);
  }

  public void onModuleLoad() {
    RootLayoutPanel.get().add(app);
    demos.add(new SelectableSamples(demo));
    demos.add(new AccordionSamples(demo));
    demos.add(new ButtonSamples(demo));
  }

}