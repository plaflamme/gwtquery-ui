function gwtquery_samples_GwtQueryUi(){
  var $wnd_0 = window, $doc_0 = document, $stats = $wnd_0.__gwtStatsEvent?function(a){
    return $wnd_0.__gwtStatsEvent(a);
  }
  :null, $sessionId_0 = $wnd_0.__gwtStatsSessionId?$wnd_0.__gwtStatsSessionId:null, scriptsDone, loadDone, bodyDone, base = '', metaProps = {}, values = [], providers = [], answers = [], onLoadErrorFunc, propertyErrorFunc;
  $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'begin'});
  if (!$wnd_0.__gwt_stylesLoaded) {
    $wnd_0.__gwt_stylesLoaded = {};
  }
  if (!$wnd_0.__gwt_scriptsLoaded) {
    $wnd_0.__gwt_scriptsLoaded = {};
  }
  function isHostedMode(){
    var result = false;
    try {
      var query = $wnd_0.location.search;
      return (query.indexOf('gwt.codesvr=') != -1 || (query.indexOf('gwt.hosted=') != -1 || $wnd_0.external && $wnd_0.external.gwtOnLoad)) && query.indexOf('gwt.hybrid') == -1;
    }
     catch (e) {
    }
    isHostedMode = function(){
      return result;
    }
    ;
    return result;
  }

  function maybeStartModule(){
    if (scriptsDone && loadDone) {
      var iframe = $doc_0.getElementById('gwtquery.samples.GwtQueryUi');
      var frameWnd = iframe.contentWindow;
      if (isHostedMode()) {
        frameWnd.__gwt_getProperty = function(name_0){
          return computePropValue(name_0);
        }
        ;
      }
      gwtquery_samples_GwtQueryUi = null;
      frameWnd.gwtOnLoad(onLoadErrorFunc, 'gwtquery.samples.GwtQueryUi', base);
      $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'moduleStartup', millis:(new Date).getTime(), type:'end'});
    }
  }

  function computeScriptBase(){
    var thisScript, markerId = '__gwt_marker_gwtquery.samples.GwtQueryUi', markerScript;
    $doc_0.write('<script id="' + markerId + '"><\/script>');
    markerScript = $doc_0.getElementById(markerId);
    thisScript = markerScript && markerScript.previousSibling;
    while (thisScript && thisScript.tagName != 'SCRIPT') {
      thisScript = thisScript.previousSibling;
    }
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf('#');
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf('?');
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf('/', Math.min(queryIndex, hashIndex));
      return slashIndex >= 0?path.substring(0, slashIndex + 1):'';
    }

    ;
    if (thisScript && thisScript.src) {
      base = getDirectoryOfFile(thisScript.src);
    }
    if (base == '') {
      var baseElements = $doc_0.getElementsByTagName('base');
      if (baseElements.length > 0) {
        base = baseElements[baseElements.length - 1].href;
      }
       else {
        base = getDirectoryOfFile($doc_0.location.href);
      }
    }
     else if (base.match(/^\w+:\/\//)) {
    }
     else {
      var img = $doc_0.createElement('img');
      img.src = base + 'clear.cache.gif';
      base = getDirectoryOfFile(img.src);
    }
    if (markerScript) {
      markerScript.parentNode.removeChild(markerScript);
    }
  }

  function processMetas(){
    var metas = document.getElementsByTagName('meta');
    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i], name_0 = meta.getAttribute('name'), content;
      if (name_0) {
        if (name_0 == 'gwt:property') {
          content = meta.getAttribute('content');
          if (content) {
            var value, eq = content.indexOf('=');
            if (eq >= 0) {
              name_0 = content.substring(0, eq);
              value = content.substring(eq + 1);
            }
             else {
              name_0 = content;
              value = '';
            }
            metaProps[name_0] = value;
          }
        }
         else if (name_0 == 'gwt:onPropertyErrorFn') {
          content = meta.getAttribute('content');
          if (content) {
            try {
              propertyErrorFunc = eval(content);
            }
             catch (e) {
              alert('Bad handler "' + content + '" for "gwt:onPropertyErrorFn"');
            }
          }
        }
         else if (name_0 == 'gwt:onLoadErrorFn') {
          content = meta.getAttribute('content');
          if (content) {
            try {
              onLoadErrorFunc = eval(content);
            }
             catch (e) {
              alert('Bad handler "' + content + '" for "gwt:onLoadErrorFn"');
            }
          }
        }
      }
    }
  }

  function unflattenKeylistIntoAnswers(propValArray, value){
    var answer = answers;
    for (var i = 0, n = propValArray.length - 1; i < n; ++i) {
      answer = answer[propValArray[i]] || (answer[propValArray[i]] = []);
    }
    answer[propValArray[n]] = value;
  }

  function computePropValue(propName){
    var value = providers[propName](), allowedValuesMap = values[propName];
    if (value in allowedValuesMap) {
      return value;
    }
    var allowedValuesList = [];
    for (var k in allowedValuesMap) {
      allowedValuesList[allowedValuesMap[k]] = k;
    }
    if (propertyErrorFunc) {
      propertyErrorFunc(propName, allowedValuesList, value);
    }
    throw null;
  }

  var frameInjected;
  function maybeInjectFrame(){
    if (!frameInjected) {
      frameInjected = true;
      var iframe = $doc_0.createElement('iframe');
      iframe.src = "javascript:''";
      iframe.id = 'gwtquery.samples.GwtQueryUi';
      iframe.style.cssText = 'position:absolute;width:0;height:0;border:none';
      iframe.tabIndex = -1;
      $doc_0.body.appendChild(iframe);
      $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'moduleStartup', millis:(new Date).getTime(), type:'moduleRequested'});
      iframe.contentWindow.location.replace(base + initialHtml);
    }
  }

  providers['selectorCapability'] = function(){
    if (document.querySelectorAll && /native/.test(String(document.querySelectorAll))) {
      return 'native';
    }
    return 'js';
  }
  ;
  values['selectorCapability'] = {js:0, 'native':1};
  providers['user.agent'] = function(){
    var ua = navigator.userAgent.toLowerCase();
    var makeVersion = function(result){
      return parseInt(result[1]) * 1000 + parseInt(result[2]);
    }
    ;
    if (ua.indexOf('opera') != -1) {
      return 'opera';
    }
     else if (ua.indexOf('webkit') != -1) {
      return 'safari';
    }
     else if (ua.indexOf('msie') != -1) {
      if (document.documentMode >= 8) {
        return 'ie8';
      }
       else {
        var result_0 = /msie ([0-9]+)\.([0-9]+)/.exec(ua);
        if (result_0 && result_0.length == 3) {
          var v = makeVersion(result_0);
          if (v >= 6000) {
            return 'ie6';
          }
        }
      }
    }
     else if (ua.indexOf('gecko') != -1) {
      var result_0 = /rv:([0-9]+)\.([0-9]+)/.exec(ua);
      if (result_0 && result_0.length == 3) {
        if (makeVersion(result_0) >= 1008)
          return 'gecko1_8';
      }
      return 'gecko';
    }
    return 'unknown';
  }
  ;
  values['user.agent'] = {gecko:0, gecko1_8:1, ie6:2, ie8:3, opera:4, safari:5};
  gwtquery_samples_GwtQueryUi.onScriptLoad = function(){
    if (frameInjected) {
      loadDone = true;
      maybeStartModule();
    }
  }
  ;
  gwtquery_samples_GwtQueryUi.onInjectionDone = function(){
    scriptsDone = true;
    $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'loadExternalRefs', millis:(new Date).getTime(), type:'end'});
    maybeStartModule();
  }
  ;
  computeScriptBase();
  var strongName;
  var initialHtml;
  if (isHostedMode()) {
    if ($wnd_0.external && ($wnd_0.external.initModule && $wnd_0.external.initModule('gwtquery.samples.GwtQueryUi'))) {
      $wnd_0.location.reload();
      return;
    }
    initialHtml = 'hosted.html?gwtquery_samples_GwtQueryUi';
    strongName = '';
  }
  processMetas();
  $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'selectingPermutation'});
  if (!isHostedMode()) {
    try {
      unflattenKeylistIntoAnswers(['js', 'gecko'], '01BA988B519A0C4EE2930E6663AFFBBA');
      unflattenKeylistIntoAnswers(['js', 'gecko1_8'], '223B6526BC237064740A9B8D3382E4DE');
      unflattenKeylistIntoAnswers(['native', 'opera'], '44FEE4887DC45CC97F448A22EDCC736F');
      unflattenKeylistIntoAnswers(['native', 'gecko1_8'], '4A124BF4719A301C316D12BE131419ED');
      unflattenKeylistIntoAnswers(['js', 'safari'], '52D076A92D4CFA291E8565F5A4EE4B54');
      unflattenKeylistIntoAnswers(['js', 'ie8'], '9889113EE74FACFC7A94E8B76C0E2F24');
      unflattenKeylistIntoAnswers(['js', 'ie6'], 'C143AE714DA0808B0AA01C91CFD3ED28');
      unflattenKeylistIntoAnswers(['native', 'safari'], 'C378EAA9412A9C95AB05C521CE105953');
      unflattenKeylistIntoAnswers(['native', 'ie8'], 'E09F9AFA3DD858D81A5BE8127924CDB8');
      unflattenKeylistIntoAnswers(['js', 'opera'], 'E1463EDD0976BFA08C622F37FE3BCF1A');
      unflattenKeylistIntoAnswers(['native', 'ie6'], 'E9C1F024E5C00F472F210788454621BB');
      unflattenKeylistIntoAnswers(['native', 'gecko'], 'EA71AABE7E5794F899593371A0DCEB97');
      strongName = answers[computePropValue('selectorCapability')][computePropValue('user.agent')];
      initialHtml = strongName + '.cache.html';
    }
     catch (e) {
      return;
    }
  }
  var onBodyDoneTimerId;
  function onBodyDone(){
    if (!bodyDone) {
      bodyDone = true;
      if (!__gwt_stylesLoaded['themes/base/jquery-ui.css']) {
        var l = $doc_0.createElement('link');
        __gwt_stylesLoaded['themes/base/jquery-ui.css'] = l;
        l.setAttribute('rel', 'stylesheet');
        l.setAttribute('href', base + 'themes/base/jquery-ui.css');
        $doc_0.getElementsByTagName('head')[0].appendChild(l);
      }
      maybeStartModule();
      if ($doc_0.removeEventListener) {
        $doc_0.removeEventListener('DOMContentLoaded', onBodyDone, false);
      }
      if (onBodyDoneTimerId) {
        clearInterval(onBodyDoneTimerId);
      }
    }
  }

  if ($doc_0.addEventListener) {
    $doc_0.addEventListener('DOMContentLoaded', function(){
      maybeInjectFrame();
      onBodyDone();
    }
    , false);
  }
  var onBodyDoneTimerId = setInterval(function(){
    if (/loaded|complete/.test($doc_0.readyState)) {
      maybeInjectFrame();
      onBodyDone();
    }
  }
  , 50);
  $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'end'});
  $stats && $stats({moduleName:'gwtquery.samples.GwtQueryUi', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'loadExternalRefs', millis:(new Date).getTime(), type:'begin'});
  if (!__gwt_scriptsLoaded['jquery-ui/jquery-1.4.2.js']) {
    __gwt_scriptsLoaded['jquery-ui/jquery-1.4.2.js'] = true;
    document.write('<script language="javascript" src="' + base + 'jquery-ui/jquery-1.4.2.js"><\/script>');
  }
  if (!__gwt_scriptsLoaded['jquery-ui/ui/jquery-ui.js']) {
    __gwt_scriptsLoaded['jquery-ui/ui/jquery-ui.js'] = true;
    document.write('<script language="javascript" src="' + base + 'jquery-ui/ui/jquery-ui.js"><\/script>');
  }
  if (!__gwt_scriptsLoaded['http://jqueryui.com/themeroller/themeswitchertool/']) {
    __gwt_scriptsLoaded['http://jqueryui.com/themeroller/themeswitchertool/'] = true;
    document.write('<script language="javascript" src="http://jqueryui.com/themeroller/themeswitchertool/"><\/script>');
  }
  $doc_0.write('<script defer="defer">gwtquery_samples_GwtQueryUi.onInjectionDone(\'gwtquery.samples.GwtQueryUi\')<\/script>');
}

gwtquery_samples_GwtQueryUi();
