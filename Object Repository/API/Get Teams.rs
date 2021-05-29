<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Teams</name>
   <tag></tag>
   <elementGuidId>6eff95be-2d8c-4b16-8b2b-8e08d63aebf9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;channel_id\&quot;: \&quot;zmr9pk4cmigujjbrp8pu11sxtw\&quot;,\n  \&quot;create_at\&quot;: \&quot;0\&quot;,\n  \&quot;file_ids\&quot;: \&quot;[]\&quot;,\n  \&quot;message\&quot;: \&quot;Alo A bình Gold\\n\&quot;,\n  \&quot;metadata\&quot;: \&quot;{}\&quot;,\n  \&quot;pending_post_id\&quot;: \&quot;ec1p9o5do7g97gttuusr7uw94c:1622277726905\&quot;,\n  \&quot;disable_group_highlight\&quot;: \&quot;true\&quot;,\n  \&quot;reply_count\&quot;: \&quot;0\&quot;,\n  \&quot;update_at\&quot;: \&quot;1622277726913\&quot;,\n  \&quot;user_id\&quot;: \&quot;ec1p9o5do7g97gttuusr7uw94c\&quot;,\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>rl_anonymous_id=%229f760e29-c17e-4f83-ba8e-fef063a84dab%22; rl_user_id=%225jiaxjwanibyzr8mn7mfupomfe%22; rl_trait=%7B%7D; MMAUTHTOKEN=w8ds3u8f478n3bqk8wcrcpwyac; MMUSERID=ec1p9o5do7g97gttuusr7uw94c; MMCSRF=onwnoon1dfftxn48jt1znp74ho</value>
   </httpHeaderProperties>
   <katalonVersion>8.0.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>Request URL: https://doanccdnc.herokuapp.com/api/v4/posts</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
