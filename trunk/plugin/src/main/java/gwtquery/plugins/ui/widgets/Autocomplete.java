package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;

/**
 * Implements jQuery-UI's Autocomplete
 * 
 * @see <a href="http://docs.jquery.com/UI/Autocomplete">jQuery-UI's Autocomplete</a>
 * 
 * @author Philippe Laflamme
 */
public class Autocomplete extends UiWidget<Autocomplete, Autocomplete.Options> {

  public static class Options extends WidgetOptions<Options> {
    
    protected Options() {
      
    }

    public static native final Options create() /*-{
      return {};
    }-*/;

    public native final Options delay(int delay) /*-{
      this["delay"] = delay;
      return this;
    }-*/;

    public native final int delay() /*-{
      return this["delay"] || 300;
    }-*/;
    

    public native final Options minLength(int minLength) /*-{
      this["minLength"] = minLength;
      return this;
    }-*/;

    public native final int minLength() /*-{
      return this["minLength"] || 1;
    }-*/;

    public native final Options source(String[] data) /*-{
      this["source"] = data;
      return this;
    }-*/;

    public native final Options source(Source[] data) /*-{
      this["source"] = data;
      return this;
    }-*/;

    public native final Options source(String url) /*-{
      this["source"] = url;
      return this;
    }-*/;
    
    // TODO: another flavor of source is a callback function
  }
  
  public static class Source extends JavaScriptObject {

    protected Source() {
      
    }

    public static native final Source create() /*-{
      return {};
    }-*/;

    public native final Source label(String label) /*-{
      this["label"] = label;
      return this;
    }-*/;
    
    public native final String label() /*-{
      return this["label"];
    }-*/;
    
    public native final Source value(String value) /*-{
      this["value"] = value;
      return this;
    }-*/;
  
    public native final String value() /*-{
      return this["value"];
    }-*/;

  }

  public static class SearchEvent extends JavaScriptObject {
    protected SearchEvent() {}
    
    public static final String NAME = "autocompletesearch";

  }
  
  public static class OpenEvent extends JavaScriptObject {
    protected OpenEvent() {}
    
    public static final String NAME = "autocompleteopen";
  }

  public static class FocusEvent extends JavaScriptObject {
    protected FocusEvent() {}
    
    public static final String NAME = "autocompletefocus";

    public native final JavaScriptObject item() /*-{
      return this["item"];
    }-*/;
  }

  public static class SelectEvent extends JavaScriptObject {
    protected SelectEvent() {}
    
    public static final String NAME = "autocompleteselect";

    public native final JavaScriptObject item() /*-{
      return this["item"];
    }-*/;
  }

  public static class CloseEvent extends JavaScriptObject {
    protected CloseEvent() {}
    
    public static final String NAME = "autocompleteclose";
  }

  public static class ChangeEvent extends JavaScriptObject {
    protected ChangeEvent() {}
    
    public static final String NAME = "autocompletechange";

    public native final JavaScriptObject item() /*-{
      return this["item"];
    }-*/;
  }

  private static class AutocompletePlugin implements UiPlugin<Autocomplete> {

    public Autocomplete init(Ui ui, WidgetOptions<?> options) {
      return new Autocomplete(ui.get(), (Options) options.cast());
    }
  }

  public static final Class< Autocomplete> Autocomplete = Autocomplete.class;

  static {
    registerPlugin(Autocomplete.class, new AutocompletePlugin());
  }

  public Autocomplete(NodeList<Element> list, Autocomplete.Options options) {
    super(list, initUiWidget(list, options));
  }

  public Autocomplete search() {
    invoke("search");
    return this;
  }

  public Autocomplete search(String value) {
    invoke("search", value);
    return this;
  }

  public Autocomplete close() {
    invoke("close");
    return this;
  }

  @Override
  protected String getWidgetType() {
    return "autocomplete";
  }
  
  @Override
  protected Autocomplete getWidgetInstance() {
    return this;
  }

  private static native final JavaScriptObject initUiWidget(NodeList<Element> list, Autocomplete.Options options) /*-{
    return $wnd.jQuery(list).autocomplete(options);
  }-*/;

}
