package gwtquery.samples.client;

import static com.google.gwt.query.client.GQuery.$;

import com.google.gwt.core.client.GWT;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class DemoPanel extends Composite {

  @UiTemplate("DemoPanel.ui.xml")
  interface MyBinder extends UiBinder<Widget, DemoPanel> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  @UiField
  Label title;

  @UiField
  HasWidgets center;

  @UiField
  HTMLPanel demoLinks;

  public DemoPanel(String title, Demo ... demos) {
    initWidget(uiBinder.createAndBindUi(this));

    this.title.setText(title);
    for(final Demo d : demos) {
      $("ul", demoLinks.getElement()).append($("<li><a href=\"#\">" + d.getName() + "</a></li>").click(new Function() {
        @Override
        public boolean f(Event e) {
          center.clear();
          HTMLPanel p = new HTMLPanel(d.getDemoHtml());
          center.add(p);
          d.setupDemoElement($(".demo", p.getElement()).elements()[0]);
          center.add(new ViewSourcePanel(d));
          return false;
        }
      }));
    }
  }
}
