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

  protected UiWidget(NodeList<Element> nodeList, JavaScriptObject jquery) {
    super(nodeList, jquery);
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

  /**
   * Binds a custom event to a callback function. This is used by jQuery-ui's event binding system.
   * 
   * @param name the widget's custom event name
   * @param f the callback function. The instance should override {@code Function#f(com.google.gwt.user.client.Event,
   * Object)}
   * @return this
   */
  public native final T bind(String name, Function f) /*-{
    this.@gwtquery.plugins.ui.Ui::jquery = this.@gwtquery.plugins.ui.Ui::jquery.bind(name, function(event, ui) {
      f.@com.google.gwt.query.client.Function::f(Lcom/google/gwt/user/client/Event;Ljava/lang/Object;)(event, ui);
    });
    return this;
  }-*/;

  protected void invoke(String method) {
    invoke(getWidgetType(), method);
  }

  protected void invoke(String method, Object arg) {
    invoke(getWidgetType(), method, arg);
  }

  protected void invoke(String method, int arg) {
    invoke(getWidgetType(), method, arg);
  }

  protected void invoke(String method, boolean arg) {
    invoke(getWidgetType(), method, arg);
  }

  protected abstract T getWidgetInstance();

  protected abstract String getWidgetType();

  private native final void invoke(String type, String method) /*-{
    this.@gwtquery.plugins.ui.Ui::jquery = this.@gwtquery.plugins.ui.Ui::jquery[type](method);
  }-*/;

  private native final void invoke(String type, String method, Object arg) /*-{
    this.@gwtquery.plugins.ui.Ui::jquery = this.@gwtquery.plugins.ui.Ui::jquery[type](method, arg);
  }-*/;

  private native final void invoke(String type, String method, int arg) /*-{
    this.@gwtquery.plugins.ui.Ui::jquery = this.@gwtquery.plugins.ui.Ui::jquery[type](method, arg);
  }-*/;

  private native final void invoke(String type, String method, boolean arg) /*-{
    this.@gwtquery.plugins.ui.Ui::jquery = this.@gwtquery.plugins.ui.Ui::jquery[type](method, arg);
  }-*/;
}
