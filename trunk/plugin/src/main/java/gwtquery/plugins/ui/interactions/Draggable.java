package gwtquery.plugins.ui.interactions;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Draggable
 * 
 * @see <a href="http://docs.jquery.com/UI/Draggable">jQuery-UI's Draggable</a>
 * 
 * @author Philippe Laflamme
 */
public class Draggable extends UiWidget<Draggable, Draggable.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create() 
    /*-{
      return {};
    }-*/;

    // TODO: implement options
  }

  // TODO: expose events

  /**
   * Used to register the plugin.
   */
  private static class DraggablePlugin implements UiPlugin<Draggable> {

    public Draggable init(Ui ui, WidgetOptions<?> options) {
      return new Draggable(ui.get(), (Draggable.Options) options.cast());
    }

  }

  public static final Class<Draggable> Draggable = Draggable.class;

  static {
    registerPlugin(Draggable.class, new DraggablePlugin());
  }

  public Draggable(NodeList<Element> list, Draggable.Options options) {
    super(list, "draggable", options);
  }
}
