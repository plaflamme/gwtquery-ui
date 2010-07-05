package gwtquery.samples.client;

import gwtquery.samples.client.buttons.ButtonSamples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class GwtQueryUiModule implements EntryPoint {

  public void onModuleLoad() {
    RootLayoutPanel.get().add(new ButtonSamples());
  }

}