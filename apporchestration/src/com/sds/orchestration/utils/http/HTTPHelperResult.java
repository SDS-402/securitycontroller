package com.sds.orchestration.utils.http;

import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class HTTPHelperResult {
 
		private int code=0;
		private String msg="";
		
		public HTTPHelperResult() {
			super();
		}
		public HTTPHelperResult(int code, String msg) {
			super();
			this.code = code;
			this.msg = msg;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
	
		public String toJson(){
			StringWriter writer = new StringWriter();
			JsonFactory jsonFactory = new JsonFactory();
			try {
				JsonGenerator generator = jsonFactory.createJsonGenerator(writer);
				generator.writeStartObject();
					generator.writeStringField("code",this.getCode()+"");
					generator.writeStringField("msg", this.getMsg());
				generator.writeEndObject();
				generator.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return writer.toString();
		}
		public static HTTPHelperResult fromJson(String json){
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = null;
			try {
				root = mapper.readTree(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
			int code =root.path("code").asInt();
			String msgString=root.path("msg").asText();
			HTTPHelperResult helperResult=new HTTPHelperResult(code,msgString);
			return helperResult;
		}
	

}
