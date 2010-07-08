package gwtquery.plugins.ui;

import static gwtquery.plugins.ui.interactions.Resizable.Resizable;
import static gwtquery.plugins.ui.interactions.Sortable.Sortable;
import static gwtquery.plugins.ui.widgets.Accordion.Accordion;
import static gwtquery.plugins.ui.widgets.Autocomplete.Autocomplete;
import static gwtquery.plugins.ui.widgets.Button.Button;
import static gwtquery.plugins.ui.widgets.Buttonset.Buttonset;
import static gwtquery.plugins.ui.widgets.Dialog.Dialog;
import static gwtquery.plugins.ui.widgets.Menu.Menu;
import gwtquery.plugins.ui.interactions.Resizable;
import gwtquery.plugins.ui.interactions.Sortable;
import gwtquery.plugins.ui.widgets.Accordion;
import gwtquery.plugins.ui.widgets.Autocomplete;
import gwtquery.plugins.ui.widgets.Button;
import gwtquery.plugins.ui.widgets.Buttonset;
import gwtquery.plugins.ui.widgets.Dialog;
import gwtquery.plugins.ui.widgets.Menu;

import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.JSArray;
import com.google.gwt.query.client.JsMap;
import com.google.gwt.query.client.Plugin;

/**
 * Experimental Gwt Query plugin for integrating JQuery UI.
 * @author Philippe Laflamme
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

  public Ui(Element element) {
    super(element);
  }

  public Ui(JSArray elements) {
    super(elements);
  }

  public Ui(NodeList<Element> list) {
    super(list);
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

  public final Autocomplete autocomplete() {
    return asWidget(Autocomplete);
  }

  public final Autocomplete autocomplete(Autocomplete.Options options) {
    return asWidget(Autocomplete, options);
  }

  public final Autocomplete autocomplete(String options) {
    return asWidget(Autocomplete, options);
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

  public final Buttonset buttonset() {
    return asWidget(Buttonset);
  }

  public final Buttonset buttonset(Button.Options options) {
    return asWidget(Buttonset, options);
  }

  public final Buttonset buttonset(String options) {
    return asWidget(Buttonset, options);
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

  public final Resizable resizable() {
    return asWidget(Resizable);
  }

  public final Resizable resizable(Resizable.Options options) {
    return asWidget(Resizable, options);
  }

  public final Resizable resizable(String options) {
    return asWidget(Resizable, options);
  }

  public final Sortable sortable() {
    return asWidget(Sortable);
  }

  public final Sortable sortable(Sortable.Options options) {
    return asWidget(Sortable, options);
  }

  public final Sortable sortable(String options) {
    return asWidget(Sortable, options);
  }

  public static void registerPlugin(Class<? extends Ui> plugin, UiPlugin<? extends Ui> pluginFactory) {
    if(plugins == null) {
      plugins = JsMap.createObject().cast();
    }
    plugins.put(plugin, pluginFactory);
  }

  public <T extends Ui> T asWidget(Class<T> plugin) {
    return asWidget(plugin, (WidgetOptions<?>) null);
  }

  public <T extends Ui> T asWidget(Class<T> plugin, String options) {
    return asWidget(plugin, (WidgetOptions<?>) JsonUtils.unsafeEval(options));
  }

  /**
   * Convert to Plugin interface provided by Class literal.
   */
  @SuppressWarnings("unchecked")
  public <T extends Ui> T asWidget(Class<T> plugin, WidgetOptions<?> options) {
    // GQuery is not a plugin for itself
    if(plugin == Ui) {
      return (T) $(this);
    } else if(plugins != null) {
      return (T) plugins.get(plugin).init(this, options);
    }
    throw new RuntimeException("No plugin registered for class " + plugin);
  }

}
