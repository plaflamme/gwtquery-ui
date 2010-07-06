package gwtquery.samples.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ViewSourcePanel extends Composite {

  @UiTemplate("ViewSourcePanel.ui.xml")
  interface MyBinder extends UiBinder<Widget, ViewSourcePanel> {
  }

  private static MyBinder uiBinder = GWT.create(MyBinder.class);

  @UiField
  HasText htmlSource;

  @UiField
  HasText javaSource;

  public ViewSourcePanel(Demo demo, String html) {
    initWidget(uiBinder.createAndBindUi(this));
    htmlSource.setText(html);
    javaSource.setText("TODO");
  }

}
