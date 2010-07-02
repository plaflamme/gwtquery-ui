package gwtquery.plugins.ui;

import com.google.gwt.core.client.JavaScriptObject;

public class WidgetOptions<T extends WidgetOptions<?>> extends JavaScriptObject {

  protected WidgetOptions() {
    
  }

  public native final String stringify() /*-{
    return JSON.stringify(this);
  }-*/;

  public native final T disabled(boolean disabled) /*-{
    this["disabled"] = disabled;
    return this;
  }-*/;

  public native final boolean disabled() /*-{
    return this["disabled"] || false;
  }-*/;

}
