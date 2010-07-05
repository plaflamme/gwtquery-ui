package gwtquery.samples.client.buttons;

import static com.google.gwt.query.client.GQuery.$;

import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public abstract class BaseDemoPanel extends Composite {

  @UiField
  HTMLPanel demoPanel;

  BaseDemoPanel() {

  }

  @Override
  protected void initWidget(Widget widget) {
    super.initWidget(widget);
    setupDemo($(".demo", demoPanel.getElement()).elements()[0]);
  }

  protected abstract void setupDemo(Element demo);

}
