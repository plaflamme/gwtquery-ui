package gwtquery.plugins.ui.interactions;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Sortable
 * 
 * @see <a href="http://docs.jquery.com/UI/Sortable">jQuery-UI's Sortable</a>
 * 
 * @author Philippe Laflamme
 */
public class Sortable extends UiWidget<Sortable, Sortable.Options> {

  public static class Options extends WidgetOptions<Options> {
    
    protected Options() {
      
    }

    public static native final Options create() /*-{
      return {};
    }-*/;
    
    // TODO: implement options
  }
  
  // TODO: expose events
 
  /**
   * Used to register the plugin.
   */
  private static class SortablePlugin implements UiPlugin<Sortable> {

    public Sortable init(Ui ui, WidgetOptions<?> options) {
      return new Sortable(ui.get(), (Sortable.Options)options.cast());
    }

  }

  public static final Class<Sortable> Sortable = Sortable.class;

  static {
    registerPlugin(Sortable.class, new SortablePlugin());
  }

  public Sortable(NodeList<Element> list, Sortable.Options options) {
    super(list, "sortable", options);
  }
}
