package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.GQuery;

public class Menu extends UiWidget<Menu, Menu.Options> {

  public static class Options extends WidgetOptions<Options> {
    
    protected Options() {
      
    }

    public static native final Options create() /*-{
      return {};
    }-*/;
  }
 
  /**
   * Used to register the plugin.
   */
  private static class MenuPlugin implements UiPlugin<Menu> {

    public Menu init(Ui ui, WidgetOptions<?> options) {
      return new Menu(ui.get(), (Menu.Options)options.cast());
    }

  }

  public static final Class< Menu> Menu = Menu.class;

  static {
    registerPlugin(Menu.class, new MenuPlugin());
  }

  public Menu(NodeList<Element> list, Menu.Options options) {
    super(list, initUiWidget(list));
  }
  
  public Menu refresh() {
    invoke("refresh");
    return this;
  }
  
  @Override
  protected String getWidgetType() {
    return "menu";
  }
  
  @Override
  protected Menu getWidgetInstance() {
    return this;
  }

  private static native final JavaScriptObject initUiWidget(NodeList<Element> list) /*-{
    return $wnd.jQuery(list).menu();
  }-*/;

}
