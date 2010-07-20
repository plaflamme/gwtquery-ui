package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Slider
 * 
 * TODO Implement value() and values() methods
 * 
 * @see <a href="http://docs.jquery.com/UI/Slider">jQuery-UI's Slider</a>
 * 
 * @author Philippe Laflamme
 */
public class Slider extends UiWidget<Slider, Slider.Options> {

  public static class Options extends WidgetOptions<Options> {
    
    protected Options() {
      
    }

    public static native final Options create() /*-{
      return {};
    }-*/;

    public native final Options animate(boolean animate) /*-{
      this["animate"] = animate;
      return this;
    }-*/;
    
    public native final boolean isAnimated() /*-{
      return this["animate"] ? true : false;
    }-*/;
    
    public native final Options animate(String animate) /*-{
      this["animate"] = animate;
      return this;
    }-*/;

    public native final String animate() /*-{
      return this["animate"];
    }-*/;

    public native final Options max(Number max) /*-{
      this["max"] = max;
      return this;
    }-*/;

    public native final Number max() /*-{
      return this["max"];
    }-*/;

    public native final Options min(Number min) /*-{
      this["min"] = min;
      return this;
    }-*/;

    public native final Number min() /*-{
      return this["min"];
    }-*/;
    
    public native final Options orientation(String orientation) /*-{
      this["orientation"] = orientation;
      return this;
    }-*/;

    public native final String orientation() /*-{
      return this["orientation"];
    }-*/;
    
    public native final Options range(boolean range) /*-{
      this["range"] = range;
      return this;
    }-*/;

    public native final boolean isRange() /*-{
      return this["range"];
    }-*/;

    public native final Options range(String range) /*-{
      this["range"] = range;
      return this;
    }-*/;
   
    public native final String range() /*-{
      return this["range"];
    }-*/;

    public native final Options step(Number step) /*-{
      this["step"] = step;
      return this;
    }-*/;
  
    public native final Number step() /*-{
      return this["step"];
    }-*/;

    public native final Options value(Number value) /*-{
      this["value"] = value;
      return this;
    }-*/;
  
    public native final Number value() /*-{
      return this["value"];
    }-*/;

    public native final Options values(JsArrayNumber values) /*-{
      this["values"] = values;
      return this;
    }-*/;

    public native final Options values(int lower, int upper) /*-{
      this["values"] = [lower, upper];
      return this;
    }-*/;

    public native final Options values(Number lower, Number upper) /*-{
      this["values"] = [lower, upper];
      return this;
    }-*/;

    public native final JsArrayNumber values() /*-{
      return this["values"];
    }-*/;
  }
  
  public static class Event extends JavaScriptObject {

    public static final String start = "slidestart";
    public static final String slide = "slide";
    public static final String change = "slidechange";
    public static final String stop = "slidestop";

    protected Event() {
    }

    public native final Number value()/*-{
      return this["value"];
    }-*/;

    public native final int intValue()/*-{
      return this["value"];
    }-*/;

    public native final JsArrayNumber values() /*-{
      return this["values"];
    }-*/;
    
    public native final JsArrayInteger intValues() /*-{
      return this["values"];
    }-*/;
  }


  private static class SliderPlugin implements UiPlugin<Slider> {

    public Slider init(Ui ui, WidgetOptions<?> options) {
      return new Slider(ui.get(), (Options) options.cast());
    }
  }

  public static final Class< Slider> Slider = Slider.class;

  static {
    registerPlugin(Slider.class, new SliderPlugin());
  }

  public Slider(NodeList<Element> list, Slider.Options options) {
    super(list, "slider", options);
  }

  public Slider value(Number value) {
    invoke("value", value);
    return this;
  }
  
  public int intValue() {
    return invokeForInt(ui, widgetType, "value");
  }

  public int intValues(int index) {
    return invoke(ui, widgetType, "values", index);
  }

  public Slider values(int index, JsArrayNumber values) {
    ui = invoke(ui, widgetType, "values", index, values);
    return this;
  }

  private native final int invoke(JavaScriptObject ui, String type, String method, int index) /*-{
    return ui[type](method, index);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, int index, Object args) /*-{
    return ui[type](method, index, args);
  }-*/;
}
