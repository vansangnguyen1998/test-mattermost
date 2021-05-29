<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Information User</name>
   <tag></tag>
   <elementGuidId>d0940e85-666a-4010-a65d-b8686c1bb60c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \t\&quot;create_at\&quot;: 0\n \t\&quot;creator_id\&quot;: \&quot;\&quot;\n\t\&quot;delete_at\&quot;: 0\n\t\&quot;display_name\&quot;: \&quot;Channel 2\&quot;\n\t\&quot;extra_update_at\&quot;: 0\n\t\&quot;group_constrained\&quot;: false\n\t\&quot;header\&quot;: \&quot;\&quot;\n\t\&quot;id\&quot;: \&quot;\&quot;\n\t\&quot;last_post_at\&quot;: 0\n\t\&quot;name\&quot;: \&quot;channel-2\&quot;\n\t\&quot;purpose\&quot;: \&quot;\&quot;\n\t\&quot;scheme_id\&quot;: \&quot;\&quot;\n\t\&quot;team_id\&quot;: \&quot;s1cb3awantrj3xgqknn6endn3o\&quot;\n\t\&quot;total_msg_count\&quot;: 0\n\t\&quot;type\&quot;: \&quot;O\&quot;\n\t\&quot;update_at\&quot;: 0 \n}&quot;,
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
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://doanccdnc.herokuapp.com/api/v4/users/me</restUrl>
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
