package gwtquery.samples.client;

import static com.google.gwt.query.client.GQuery.$;
import static gwtquery.plugins.ui.Ui.Ui;
import gwtquery.plugins.ui.widgets.Accordion;
import gwtquery.plugins.ui.widgets.Button;
import gwtquery.plugins.ui.widgets.Dialog;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.Function;
import com.google.gwt.user.client.Event;

public class GwtQueryUiModule implements EntryPoint {

  public void onModuleLoad() {

    $(".outer").eq(0).after("<button id='enhance'>Enhance</button>");

    $("#enhance").one(Event.ONCLICK, null, new Function() {
      @Override
      public boolean f(Event e) {
        $("#enhance").hide();
        $(".btn:nth-child(odd)").as(Ui).button().click(new Function() {
          @Override
          public void f(Element e) {
            GWT.log("You clicked: " + $(e).text());
          }
        });

        $(".btn:nth-child(even)").as(Ui).button(Button.Options.create().label("A disabled Button")).disable();

        $(".menu").as(Ui).menu().children().eq(0).click(new Function() {
          @Override
          public void f(Element e) {
            GWT.log("You clicked on the first item: " + e.getInnerText());
          }
        }).next().click(new Function() {
          @Override
          public void f(Element e) {
            GWT.log("You clicked on the second item: " + e.getInnerText());
          }
        }).after($("<li><a>Third Item</a></li>").click(new Function() {
          @Override
          public void f(Element e) {
            GWT.log("You clicked on the new item! " + e.getInnerText());
          }
        })).parent().as(Ui).menu().refresh();

        $(".accordion").as(Ui).accordion(Accordion.Options.create().collapsible(true).active(false)).after(//
        $("<button>Activate tab 2</button>").as(Ui).button().click(new Function() {
          @Override
          public void f(Element e) {
            $(".accordion").as(Ui).accordion().activate(1);
          }
        })).after(//
        $("<button>Activate tab 1</button>").as(Ui).button().click(new Function() {
          @Override
          public void f(Element e) {
            $(".accordion").as(Ui).accordion().activate(0);
          }
        }));

        $(".accordion").as(Ui).accordion().bind(Accordion.ChangeEvent.NAME, new Function() {
          @Override
          public boolean f(Event e, Object data) {
            Accordion.ChangeEvent accordionChange = ((JavaScriptObject)data).cast();
            GWT.log("AccordionChange: " + stringify(accordionChange));
            return false;
          }
        });

        $(".dialog").as(Ui).dialog(Dialog.Options.create().modal(true).show("fade").hide("slide").buttons(Dialog.Buttons.create().define("Very much!", new Function() {
          @Override
          public boolean f(Event e) {
            GWT.log($(e).text());
            $(".dialog").as(Ui).dialog().close();
            return false;
          }
        }).define("Yes!", new Function() {
          @Override
          public boolean f(Event e) {
            GWT.log($(e).text());
            $(".dialog").as(Ui).dialog().close();
            return false;
          }
        })));

        return true;
      }
    });
  }
  
  private native static String stringify(JavaScriptObject jso) /*-{
    return JSON.stringify(jso);
  }-*/;
}