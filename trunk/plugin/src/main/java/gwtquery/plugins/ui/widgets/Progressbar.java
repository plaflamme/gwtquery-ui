package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Progressbar
 * 
 * @see <a href="http://docs.jquery.com/UI/Progressbar">jQuery-UI's Progressbar</a>
 * 
 * @author Philippe Laflamme
 */
public class Progressbar extends UiWidget<Progressbar, Progressbar.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options value(int value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final Options value(float value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final Options value(Number value)
    /*-{
      this["value"] = value;
      return this;
    }-*/;

    public native final Number value()
    /*-{
      return this["value"];
    }-*/;
  }

  /**
   * Used to register the plugin.
   */
  private static class ProgressbarPlugin implements UiPlugin<Progressbar> {

    public Progressbar init(Ui ui, WidgetOptions<?> options) {
      return new Progressbar(ui.get(), (Progressbar.Options) options.cast());
    }

  }

  public static final Class<Progressbar> Progressbar = Progressbar.class;

  static {
    registerPlugin(Progressbar.class, new ProgressbarPlugin());
  }

  public Progressbar(NodeList<Element> list, Progressbar.Options options) {
    super(list, "progressbar", options);
  }

  public native final Number value()
  /*-{
    return this.@gwtquery.plugins.ui.UiWidget::ui["progressbar"]("value");
  }-*/;

  public Progressbar value(int value) {
    invoke("value", value);
    return this;
  }

  public Progressbar value(float value) {
    invoke("value", value);
    return this;
  }

  public Progressbar value(Number value) {
    invoke("value", value);
    return this;
  }

}
