package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Buttonset
 * 
 * @see <a href="http://docs.jquery.com/UI/Button">jQuery-UI's Buttonset</a>
 * 
 * @author Philippe Laflamme
 */
public class Buttonset extends UiWidget<Buttonset, Button.Options> {

  /**
   * Used to register the plugin.
   */
  private static class ButtonPlugin implements UiPlugin<Buttonset> {

    public Buttonset init(Ui ui, WidgetOptions<?> options) {
      return new Buttonset(ui.get(), (Button.Options) options.cast());
    }
  }

  public static final Class<Buttonset> Buttonset = Buttonset.class;

  static {
    registerPlugin(Buttonset.class, new ButtonPlugin());
  }

  public Buttonset(NodeList<Element> list, Button.Options options) {
    super(list, initUiWidget(list, options));
  }

  public Buttonset refresh() {
    invoke("refresh");
    return this;
  }

  @Override
  protected String getWidgetType() {
    return "buttonset";
  }

  @Override
  protected Buttonset getWidgetInstance() {
    return this;
  }

  private static native final JavaScriptObject initUiWidget(NodeList<Element> list, Button.Options options) /*-{
    return $wnd.jQuery(list).buttonset(options);
  }-*/;

}
