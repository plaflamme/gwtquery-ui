package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;
import gwtquery.plugins.ui.widgets.Button.Icons;
import gwtquery.plugins.ui.widgets.Button.Options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.Function;

public class Accordion extends UiWidget<Accordion, Accordion.Options> {

  public static class Options extends WidgetOptions<Options> {
    
    protected Options() {
      
    }

    public static native final Options create() /*-{
      return {};
    }-*/;

    public native final Options active(boolean active) /*-{
      this["active"] = active;
      return this;
    }-*/;

    public native final Options animated(boolean animated) /*-{
      this["animated"] = animated;
      return this;
    }-*/;
    
    public native final boolean isAnimated() /*-{
      return this["animated"] ? true : false;
    }-*/;
    
    public native final Options animated(String animated) /*-{
      this["animated"] = animated;
      return this;
    }-*/;

    public native final String animated() /*-{
      return this["animated"];
    }-*/;

    public native final Options autoHeight(boolean autoHeight) /*-{
      this["autoHeight"] = autoHeight;
      return this;
    }-*/;

    public native final boolean autoHeight() /*-{
      return this["autoHeight"] || true;
    }-*/;

    public native final Options clearStyle(boolean clearStyle) /*-{
      this["clearStyle"] = clearStyle;
      return this;
    }-*/;

    public native final boolean clearStyle() /*-{
      return this["clearStyle"] || false;
    }-*/;

    public native final Options collapsible(boolean collapsible) /*-{
      this["collapsible"] = collapsible;
      return this;
    }-*/;

    public native final boolean collapsible() /*-{
      return this["collapsible"] || false;
    }-*/;

    public native final Options event(String event) /*-{
      this["event"] = event;
      return this;
    }-*/;

    public native final String event() /*-{
      return this["event"] || "click";
    }-*/;
    
    public native final Options fillSpace(boolean fillSpace) /*-{
      this["fillSpace"] = fillSpace;
      return this;
    }-*/;

    public native final boolean fillSpace() /*-{
      return this["fillSpace"] || false;
    }-*/;

    public native final Options header(String header) /*-{
      this["header"] = header;
      return this;
    }-*/;

    public native final String header() /*-{
      return this["header"];
    }-*/;

    public native final Options icons(Icons icons) /*-{
      this["icons"] = icons;
      return this;
    }-*/;

    public native final Icons icons() /*-{
      return this["icons"];
    }-*/;

    public native final Options navigation(boolean navigation) /*-{
      this["navigation"] = navigation;
      return this;
    }-*/;

    public native final boolean navigation() /*-{
      return this["navigation"] || false;
    }-*/;

    public native final Options navigationFilter(Function f) /*-{
      this["navigationFilter"] = f;
      return this;
    }-*/;

    public native final Function navigationFilter() /*-{
      return this["navigationFilter"];
    }-*/;
  }
  
  public static class Icons extends JavaScriptObject {

    protected Icons() {
      
    }

    public static native final Icons create() /*-{
      return {};
    }-*/;

    public native final Icons header(String header) /*-{
      this["header"] = header;
      return this;
    }-*/;
    
    public native final String header() /*-{
      return this["header"] || 'ui-icon-triangle-1-e';
    }-*/;
    
    public native final Icons headerSelected(String headerSelected) /*-{
      this["headerSelected"] = headerSelected;
      return this;
    }-*/;
  
    public native final String headerSelected() /*-{
      return this["headerSelected"] || 'ui-icon-triangle-1-s';
    }-*/;

    public native final Options icons(Icons icons) /*-{
      this["icons"] = icons;
      return this;
    }-*/;

    public native final Icons icons() /*-{
      return this["icons"];
    }-*/;
  }

  public static class Events extends WidgetOptions<Options> {
    
    protected Events() {
      
    }

    public static native final Events create() /*-{
      return {};
    }-*/;

    public native final Events change(Function f)/*-{
      this["change"] = function(event, ui) {
      }
      return this;
    }-*/;

  }
  
  public static class AccordionChangeEvent extends JavaScriptObject {
    protected AccordionChangeEvent() {}
    
    public static final String NAME = "accordionchange";

    public native final JavaScriptObject newHeader()/*-{
      return this["newHeader"];
    }-*/;

    public native final JavaScriptObject newContent()/*-{
      return this["newContent"];
    }-*/;

    public native final JavaScriptObject oldHeader()/*-{
      return this["oldHeader"];
    }-*/;

    public native final JavaScriptObject oldContent()/*-{
      return this["oldContent"];
    }-*/;
  }
  
  public static class AccordionChangeStartEvent extends JavaScriptObject {
    protected AccordionChangeStartEvent() {}
    
    public static final String NAME = "accordionchangestart";

    public native final JavaScriptObject newHeader()/*-{
      return this["newHeader"];
    }-*/;

    public native final JavaScriptObject newContent()/*-{
      return this["newContent"];
    }-*/;

    public native final JavaScriptObject oldHeader()/*-{
      return this["oldHeader"];
    }-*/;

    public native final JavaScriptObject oldContent()/*-{
      return this["oldContent"];
    }-*/;
  }
  
  /**
   * Used to register the plugin.
   */
  private static class AccordionPlugin implements UiPlugin<Accordion> {

    public Accordion init(Ui ui, WidgetOptions<?> options) {
      return new Accordion(ui.get(), (Options) options.cast());
    }
  }

  public static final Class< Accordion> Accordion = Accordion.class;

  static {
    registerPlugin(Accordion.class, new AccordionPlugin());
  }

  public Accordion(NodeList<Element> list, Accordion.Options options) {
    super(list, initUiWidget(list, options));
  }

  public Accordion resize() {
    invoke("resize");
    return this;
  }

  public Accordion activate(int index) {
    invoke("activate", index);
    return this;
  }

  public Accordion activateNone() {
    invoke("activate", false);
    return this;
  }

  public Accordion option(String name, String value) {
    return this;
  }

  @Override
  protected String getWidgetType() {
    return "accordion";
  }
  
  @Override
  protected Accordion getWidgetInstance() {
    return this;
  }

  private static native final JavaScriptObject initUiWidget(NodeList<Element> list, Accordion.Options options) /*-{
    return $wnd.jQuery(list).accordion(options);
  }-*/;

}
