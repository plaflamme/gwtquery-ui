package gwtquery.plugins.ui;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.Function;

/**
 * An abstract base class for all JQuery UI widgets.
 * 
 * @param <T> the widget type. Used for returning the proper type for method chaining
 * @param <O> the widget's options class
 * 
 * @author Philippe Laflamme
 */
public abstract class UiWidget<T extends UiWidget<?, ?>, O extends WidgetOptions<?>> extends Ui {

  protected final String widgetType;
  protected JavaScriptObject ui = null;

  /**
   * Constructor for building a jQuery-UI widget.
   * 
   * @param nodeList the current selection
   * @param widgetType the type of widget to build (button, accordion, etc.)
   * @param options the widget options (may be null).
   */
  protected UiWidget(NodeList<Element> nodeList, String widgetType, O options) {
    super(nodeList);
    this.widgetType = widgetType;
    ui = initUiWidget(widgetType, nodeList, options);
  }

  public T destroy() {
    invoke("destroy");
    return getWidgetInstance();
  }

  public T disable() {
    invoke("disable");
    return getWidgetInstance();
  }

  public T enable() {
    invoke("enable");
    return getWidgetInstance();
  }

  public T option(String options) {
    invoke("option", options);
    return getWidgetInstance();
  }

  public T option(O options) {
    invoke("option", options);
    return getWidgetInstance();
  }

  public T option(String options, Object value) {
    invoke("option", options, value);
    return getWidgetInstance();
  }
  /**
   * Binds a custom event to a callback function. This is used by jQuery-ui's event binding system.
   * 
   * @param name the widget's custom event name
   * @param f the callback function. The instance should override {@code Function#f(com.google.gwt.user.client.Event,
   * Object)}
   * @return this
   */
  public native final T bind(String name, Function f) /*-{
    this.@gwtquery.plugins.ui.UiWidget::ui = this.@gwtquery.plugins.ui.UiWidget::ui.bind(name, function(event, ui) {
      f.@com.google.gwt.query.client.Function::f(Lcom/google/gwt/user/client/Event;Ljava/lang/Object;)(event, ui);
    });
    return this;
  }-*/;

  protected void invoke(String method) {
    ui = invoke(ui, widgetType, method);
  }

  protected void invoke(String method, Object arg) {
    ui = invoke(ui, widgetType, method, arg);
  }

  protected void invoke(String method, int arg) {
    ui = invoke(ui, widgetType, method, arg);
  }

  protected void invoke(String method, boolean arg) {
    ui = invoke(ui, widgetType, method, arg);
  }

  protected void invoke(String method, String option, Object value) {
    invoke(ui, widgetType, method, option, value);
  }

  protected native final T getWidgetInstance() /*-{
    return this;
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method) /*-{
    return ui[type](method);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, Object arg) /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, int arg) /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, boolean arg) /*-{
    return ui[type](method, arg);
  }-*/;

  private native final JavaScriptObject invoke(JavaScriptObject ui, String type, String method, String option, Object value) /*-{
    return ui[type](method, option, value);
  }-*/;

  private native final JavaScriptObject initUiWidget(String type, NodeList<Element> list, O options) /*-{
    return $wnd.jQuery(list)[type](options);
  }-*/;

}
