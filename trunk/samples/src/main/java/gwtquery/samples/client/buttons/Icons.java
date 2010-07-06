package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Button;
import gwtquery.samples.client.Demo;

import com.google.gwt.dom.client.Element;

public class Icons implements Demo {

  public void setupDemoElement(Element demo) {
    $("button", demo).eq(0) //
    .as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-locked")).text(false)).next()//
    .as(Ui).button("{icons: {primary: 'ui-icon-locked'}}").next()//
    .as(Ui).button(Button.Options.create().icons(Button.Icons.create().primary("ui-icon-gear").secondary("ui-icon-triangle-1-s"))).next()//
    .as(Ui).button("{icons: {primary: 'ui-icon-gear',secondary: 'ui-icon-triangle-1-s'}, text: false}");
  }

  public String getDemoHtml() {
    return new StringBuilder() //
    .append("<div class=\"demo\">") //
    .append("<button>Button with icon only</button>") //
    .append("<button>Button with icon on the left</button>") //
    .append("<button>Button with two icons</button>") //
    .append("<button>Button with two icons and no text</button>") //
    .append("</div>") //
    .append("<div class=\"demo-description\">") //
    .append("<p>Some buttons with various combinations of text and icons, here specified via metadata.</p>") //
    .append("</div>").toString();
  }

  public String getName() {
    return "Icons";
  }
}
