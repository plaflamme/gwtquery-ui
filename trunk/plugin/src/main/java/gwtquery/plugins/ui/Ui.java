package gwtquery.plugins.ui;

import static gwtquery.plugins.ui.widgets.Accordion.Accordion;
import static gwtquery.plugins.ui.widgets.Button.Button;
import static gwtquery.plugins.ui.widgets.Menu.Menu;
import static gwtquery.plugins.ui.widgets.Dialog.Dialog;
import gwtquery.plugins.ui.widgets.Accordion;
import gwtquery.plugins.ui.widgets.Button;
import gwtquery.plugins.ui.widgets.Dialog;
import gwtquery.plugins.ui.widgets.Menu;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.JSArray;
import com.google.gwt.query.client.JsMap;
import com.google.gwt.query.client.Plugin;

/**
 * Experimental Gwt Query plugin for integrating JQuery UI.
 */
public class Ui extends GQuery {

  /**
   * Used to register the plugin.
   */
  private static class UiGQueryPlugin implements Plugin<Ui> {

    public Ui init(GQuery gq) {
      return new Ui(gq.get());
    }
  }

  public static final Class<Ui> Ui = Ui.class;

  static {
    GQuery.registerPlugin(Ui.class, new UiGQueryPlugin());
  }
  
  private static JsMap<Class<? extends Ui>, UiPlugin<? extends Ui>> plugins;

  protected JavaScriptObject jquery = null;

  public Ui(Element element) {
    super(element);
  }

  public Ui(JSArray elements) {
    super(elements);
  }

  public Ui(NodeList<Element> list) {
    super(list);
  }

  protected Ui(NodeList<Element> list, JavaScriptObject jquery) {
    super(list);
    this.jquery = jquery;
  }
  
  public final Accordion accordion() {
    return asWidget(Accordion);
  }

  public final Accordion accordion(Accordion.Options options) {
    return asWidget(Accordion, options);
  }

  public final Accordion accordion(String options) {
    return asWidget(Accordion, options);
  }

  public final Button button() {
    return asWidget(Button);
  }

  public final Button button(Button.Options options) {
    return asWidget(Button, options);
  }

  public final Button button(String options) {
    return asWidget(Button, options);
  }
  
  public final Dialog dialog() {
    return asWidget(Dialog);
  }

  public final Dialog dialog(Dialog.Options options) {
    return asWidget(Dialog, options);
  }

  public final Dialog Didialogalog(String options) {
    return asWidget(Dialog, options);
  }

  public final Menu menu() {
    return asWidget(Menu);
  }

  public final Menu menu(Menu.Options options) {
    return asWidget(Menu, options);
  }

  public final Menu menu(String options) {
    return asWidget(Menu, options);
  }

  public static void registerPlugin(Class<? extends Ui> plugin, UiPlugin<? extends Ui> pluginFactory) {
    if (plugins == null) {
      plugins = JsMap.createObject().cast();
    }
    plugins.put(plugin, pluginFactory);
  }

  
  public <T extends Ui> T asWidget(Class<T> plugin) {
    return asWidget(plugin, (WidgetOptions<?>)null);
  }
  
  public <T extends Ui> T asWidget(Class<T> plugin, String options) {
    return asWidget(plugin, (WidgetOptions<?>)JsonUtils.unsafeEval(options));
  }
  
  /**
   * Convert to Plugin interface provided by Class literal.
   */
  @SuppressWarnings("unchecked")
  public <T extends Ui> T asWidget(Class<T> plugin, WidgetOptions<?> options) {
    // GQuery is not a plugin for itself
    if (plugin == Ui) {
      return (T) $(this);
    } else if (plugins != null) {
      return (T) plugins.get(plugin).init(this, options);
    }
    throw new RuntimeException("No plugin registered for class " + plugin);
  }

}
