package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.query.client.Function;

/**
 * Implements jQuery-UI's Datepicker
 * 
 * @see <a href="http://docs.jquery.com/UI/Datepicker">jQuery-UI's Datepicker</a>
 * 
 * @author Philippe Laflamme
 */
public class Datepicker extends UiWidget<Datepicker, Datepicker.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options altField(String altField)
    /*-{
      this["altField"] = altField;
      return this;
    }-*/;

    public native final String altField()
    /*-{
      return this["altField"];
    }-*/;

    public native final Options altFormat(String altFormat)
    /*-{
      this["altFormat"] = altFormat;
      return this;
    }-*/;

    public native final String altFormat()
    /*-{
      return this["altFormat"];
    }-*/;

    public native final Options appendText(String appendText)
    /*-{
      this["appendText"] = appendText;
      return this;
    }-*/;

    public native final String appendText()
    /*-{
      return this["appendText"];
    }-*/;

    public native final Options autoSize(Boolean autoSize)
    /*-{
      this["autoSize"] = autoSize;
      return this;
    }-*/;

    public native final Boolean autoSize()
    /*-{
      return this["autoSize"];
    }-*/;

    public native final Options buttonImage(String buttonImage)
    /*-{
      this["buttonImage"] = buttonImage;
      return this;
    }-*/;

    public native final String buttonImage()
    /*-{
      return this["buttonImage"];
    }-*/;

    public native final Options buttonImageOnly(Boolean buttonImageOnly)
    /*-{
      this["buttonImageOnly"] = buttonImageOnly;
      return this;
    }-*/;

    public native final Boolean buttonImageOnly()
    /*-{
      return this["buttonImageOnly"];
    }-*/;

    public native final Options buttonText(String buttonText)
    /*-{
      this["buttonText"] = buttonText;
      return this;
    }-*/;

    public native final String buttonText()
    /*-{
      return this["buttonText"];
    }-*/;

    public native final Options calculateWeek(Function calculateWeek)
    /*-{
      this["calculateWeek"] = calculateWeek;
      return this;
    }-*/;

    public native final Options changeMonth(Boolean changeMonth)
    /*-{
      this["changeMonth"] = changeMonth;
      return this;
    }-*/;

    public native final Boolean changeMonth()
    /*-{
      return this["changeMonth"];
    }-*/;

    public native final Options changeYear(Boolean changeYear)
    /*-{
      this["changeYear"] = changeYear;
      return this;
    }-*/;

    public native final Boolean changeYear()
    /*-{
      return this["changeYear"];
    }-*/;

    public native final Options closeText(String closeText)
    /*-{
      this["closeText"] = closeText;
      return this;
    }-*/;

    public native final String closeText()
    /*-{
      return this["closeText"];
    }-*/;

    public native final Options constrainInput(Boolean constrainInput)
    /*-{
      this["constrainInput"] = constrainInput;
      return this;
    }-*/;

    public native final Boolean constrainInput()
    /*-{
      return this["constrainInput"];
    }-*/;

    public native final Options currentText(String currentText)
    /*-{
      this["currentText"] = currentText;
      return this;
    }-*/;

    public native final String currentText()
    /*-{
      return this["currentText"];
    }-*/;

    public native final Options dateFormat(String dateFormat)
    /*-{
      this["dateFormat"] = dateFormat;
      return this;
    }-*/;

    public native final String dateFormat()
    /*-{
      return this["dateFormat"];
    }-*/;

    public native final Options dayNames(JsArrayString dayNames)
    /*-{
      this["dayNames"] = dayNames;
      return this;
    }-*/;

    public native final JsArrayString dayNames()
    /*-{
      return this["dayNames"];
    }-*/;

    public native final Options dayNamesMin(JsArrayString dayNamesMin)
    /*-{
      this["dayNamesMin"] = dayNamesMin;
      return this;
    }-*/;

    public native final JsArrayString dayNamesMin()
    /*-{
      return this["dayNamesMin"];
    }-*/;

    public native final Options dayNamesShort(JsArrayString dayNamesShort)
    /*-{
      this["dayNamesShort"] = dayNamesShort;
      return this;
    }-*/;

    public native final JsArrayString dayNamesShort()
    /*-{
      return this["dayNamesShort"];
    }-*/;

    public native final Options defaultDate(Date defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options defaultDate(Number defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options defaultDate(String defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options duration(String duration)
    /*-{
      this["duration"] = duration;
      return this;
    }-*/;

    public native final Options duration(Number duration)
    /*-{
      this["duration"] = duration;
      return this;
    }-*/;

    public native final Options firstDay(Number firstDay)
    /*-{
      this["firstDay"] = firstDay;
      return this;
    }-*/;

    public native final Number firstDay()
    /*-{
      this["firstDay"] = firstDay;
      return this;
    }-*/;

    public native final Options gotoCurrent(Boolean gotoCurrent)
    /*-{
      this["gotoCurrent"] = gotoCurrent;
      return this;
    }-*/;

    public native final Boolean gotoCurrent()
    /*-{
      return this["gotoCurrent"];
    }-*/;

    public native final Options hideIfNoPrevNext(Boolean hideIfNoPrevNext)
    /*-{
      this["hideIfNoPrevNext"] = hideIfNoPrevNext;
      return this;
    }-*/;

    public native final Boolean hideIfNoPrevNext()
    /*-{
      return this["hideIfNoPrevNext"];
    }-*/;

    public native final Options isRTL(Boolean isRTL)
    /*-{
      this["isRTL"] = isRTL;
      return this;
    }-*/;

    public native final Boolean isRTL()
    /*-{
      return this["isRTL"];
    }-*/;

    public native final Options maxDate(Date maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options maxDate(Number maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options maxDate(String maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options minDate(Date minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options minDate(Number minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options minDate(String minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options monthNames(JsArrayString monthNames)
    /*-{
      this["monthNames"] = monthNames;
      return this;
    }-*/;

    public native final JsArrayString monthNames()
    /*-{
      return this["monthNames"];
    }-*/;

    public native final Options monthNamesShort(JsArrayString monthNamesShort)
    /*-{
      this["monthNamesShort"] = monthNamesShort;
      return this;
    }-*/;

    public native final JsArrayString monthNamesShort()
    /*-{
      return this["monthNamesShort"];
    }-*/;

    public native final Options navigationAsDateFormat(Boolean navigationAsDateFormat)
    /*-{
      this["navigationAsDateFormat"] = navigationAsDateFormat;
      return this;
    }-*/;

    public native final Boolean navigationAsDateFormat()
    /*-{
      return this["navigationAsDateFormat"];
    }-*/;

    public native final Options nextText(String nextText)
    /*-{
      this["nextText"] = nextText;
      return this;
    }-*/;

    public native final String nextText()
    /*-{
      return this["nextText"];
    }-*/;

    public native final Options numberOfMonths(int numberOfMonths)
    /*-{
      this["numberOfMonths"] = numberOfMonths;
      return this;
    }-*/;

    public native final Options numberOfMonths(int rows, int cols)
    /*-{
      this["numberOfMonths"] = [rows, cols];
      return this;
    }-*/;

    public native final Options prevText(String prevText)
    /*-{
      this["prevText"] = prevText;
      return this;
    }-*/;

    public native final String prevText()
    /*-{
      return this["prevText"];
    }-*/;

    public native final Options selectOtherMonths(Boolean selectOtherMonths)
    /*-{
      this["selectOtherMonths"] = selectOtherMonths;
      return this;
    }-*/;

    public native final Boolean selectOtherMonths()
    /*-{
      return this["selectOtherMonths"];
    }-*/;

    public native final Options shortYearCutoff(String shortYearCutoff)
    /*-{
      this["shortYearCutoff"] = shortYearCutoff;
      return this;
    }-*/;

    public native final Options shortYearCutoff(Number shortYearCutoff)
    /*-{
      this["shortYearCutoff"] = shortYearCutoff;
      return this;
    }-*/;

    public native final Options showAnim(String showAnim)
    /*-{
      this["showAnim"] = showAnim;
      return this;
    }-*/;

    public native final String showAnim()
    /*-{
      return this["showAnim"];
    }-*/;

    public native final Options showButtonPanel(Boolean showButtonPanel)
    /*-{
      this["showButtonPanel"] = showButtonPanel;
      return this;
    }-*/;

    public native final Boolean showButtonPanel()
    /*-{
      return this["showButtonPanel"];
    }-*/;

    public native final Options showCurrentAtPos(Number showCurrentAtPos)
    /*-{
      this["showCurrentAtPos"] = showCurrentAtPos;
      return this;
    }-*/;

    public native final Number showCurrentAtPos()
    /*-{
      return this["showCurrentAtPos"];
    }-*/;

    public native final Options showMonthAfterYear(Boolean showMonthAfterYear)
    /*-{
      this["showMonthAfterYear"] = showMonthAfterYear;
      return this;
    }-*/;

    public native final Boolean showMonthAfterYear()
    /*-{
      return this["showMonthAfterYear"];
    }-*/;

    public native final Options showOn(String showOn)
    /*-{
      this["showOn"] = showOn;
      return this;
    }-*/;

    public native final String showOn()
    /*-{
      return this["showOn"];
    }-*/;

    public native final Options showOptions(JavaScriptObject showOptions)
    /*-{
      this["showOptions"] = showOptions;
      return this;
    }-*/;

    public native final JavaScriptObject showOptions()
    /*-{
      return this["showOptions"];
    }-*/;

    public native final Options showOtherMonths(Boolean showOtherMonths)
    /*-{
      this["showOtherMonths"] = showOtherMonths;
      return this;
    }-*/;

    public native final Boolean showOtherMonths()
    /*-{
      return this["showOtherMonths"];
    }-*/;

    public native final Options showWeek(Boolean showWeek)
    /*-{
      this["showWeek"] = showWeek;
      return this;
    }-*/;

    public native final Boolean showWeek()
    /*-{
      return this["showWeek"];
    }-*/;

    public native final Options stepMonths(Number stepMonths)
    /*-{
      this["stepMonths"] = stepMonths;
      return this;
    }-*/;

    public native final Number stepMonths()
    /*-{
      return this["stepMonths"];
    }-*/;

    public native final Options weekHeader(String weekHeader)
    /*-{
      this["weekHeader"] = weekHeader;
      return this;
    }-*/;

    public native final String weekHeader()
    /*-{
      return this["weekHeader"];
    }-*/;

    public native final Options yearRange(String yearRange)
    /*-{
      this["yearRange"] = yearRange;
      return this;
    }-*/;

    public native final String yearRange()
    /*-{
      return this["yearRange"];
    }-*/;

    public native final Options yearSuffix(String yearSuffix)
    /*-{
      this["yearSuffix"] = yearSuffix;
      return this;
    }-*/;

    public native final String yearSuffix()
    /*-{
      return this["yearSuffix"];
    }-*/;
  }

  public static class Event extends JavaScriptObject {

    public static final String beforeShow = "beforeShow";

    public static final String beforeShowDay = "beforeShowDay";

    public static final String onChangeMonthYear = "onChangeMonthYear";

    public static final String onClose = "onClose";

    public static final String onSelect = "onSelect";

    protected Event() {
    }

  }

  /**
   * Used to register the plugin.
   */
  private static class DatepickerPlugin implements UiPlugin<Datepicker> {

    public Datepicker init(Ui ui, WidgetOptions<?> options) {
      return new Datepicker(ui.get(), (Options) options.cast());
    }
  }

  public static final Class<Datepicker> Datepicker = Datepicker.class;

  static {
    registerPlugin(Datepicker.class, new DatepickerPlugin());
  }

  public Datepicker(NodeList<Element> list, Datepicker.Options options) {
    super(list, "datepicker", options);
  }

  public Datepicker close() {
    invoke("close");
    return this;
  }

  public Datepicker dialog(Date date, Function onSelect, Options settings, JsArrayInteger position) {
    // TODO: implement for other arguments
    invoke("dialog", date);
    return this;
  }

  public boolean isDisabled() {
    // TODO: implement for other arguments
    throw new UnsupportedOperationException();
  }

  public Datepicker hide() {
    invoke("hide");
    return this;
  }

  public Datepicker show() {
    invoke("show");
    return this;
  }

  public Datepicker refresh() {
    invoke("refresh");
    return this;
  }

  public Date getDate() {
    invoke("getDate");
    return null;
  }

  public Datepicker setDate(Date date) {
    invoke("setDate", date);
    return this;
  }

  /**
   * Sets the current date for the datepicker. The new date may be a Date object or a string in the current date format
   * (e.g. '01/26/2009'), a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm'
   * for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null to clear the selected date.
   */
  public Datepicker setDate(String date) {
    invoke("setDate", date);
    return this;
  }
}
