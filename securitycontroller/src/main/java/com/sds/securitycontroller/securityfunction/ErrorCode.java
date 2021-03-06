package com.sds.securitycontroller.securityfunction;

import java.util.HashMap;

public enum ErrorCode {
	SUCCESS, 
	
	PROCESS_IN_PROGRESS,
	
	SERVER_EXCEPTION, 
	
	SECURITY_FUNCTION_NOT_SUPPORTED, 
	SECURITY_FUNCTION_TYPE_NOT_SUPPORTED, 
	
	CANNOT_FIND_DEVICE, 
	CANNOT_FIND_DEVICE_INSUFFICIENT_RESOURCE, 
	CANNOT_FIND_DEVICE_UNRECOGNIZED, 
	DEVICE_NOT_SUPPORTED_BY_DRIVER, 
	
	OPERATION_NOT_SUPPORTED, 
	PARSE_REQUEST_FAILED, 
	MISSING_FIELD_APP_ID, 
	MISSING_FIELD_TENANT_ID, 
	MISSING_FIELD_SIGNATURE, 
	INVALID_FIELD_SIGNATURE, 
	MISSING_FIELD_DATA, 
	MISSING_FIELD_HEAD, 
	MISSING_FIELD_METHOD, 
	MISSING_FIELD_OPTYPE, 
	INVALID_FIELD_OPTYPE, 
	MISSING_FIELD_PROTOCOL, 
	MISSING_FIELD_IP, 
	MISSING_FIELD_DOMAIN, 
	MISSING_FIELD_PORT, 
	INVALID_FIELD_PORT, 
	MISSING_ARGUMENT, 
	INVALID_ARGUMENT, 
	
	DATABASE_INIT_FAILED, 
	DATABASE_CREATE_TABLE_FAILED, 
	DATABASE_UPDATE_DATA_FAILED, 
	DATABASE_DELETE_DATA_FAILED, 
	
	TARGET_DOES_NOT_EXIST, 
	DEVICE_DOES_NOT_EXIST, 
	
	RESOURCE_ALREADY_EXIST, 
	RESOURCE_DOES_NOT_EXIST, 
	
	DEVICE_ERROR, 
	DEVICE_RESPONSE_INVALID, 
	DEVICE_DRIVER_ERROR, 
	DEVICE_DOES_NOT_SUPPORT, 
	
	COMMUNICATE_WITH_DEVICE_ERROR, 
	
	JSON_PARSE_ERROR, 
	JSON_WRITE_ERROR, 
	
	PERMISSION_DENIED, 
	
	CLONE_FAILED;
	
	public int getIntegerCode()
	{
		final HashMap<ErrorCode, Integer> codeMap = new HashMap<ErrorCode, Integer>()
		{
			private static final long serialVersionUID = 538797627858785698L;

			{
				put(SUCCESS, 200);
				put(PROCESS_IN_PROGRESS, 500);
				put(SERVER_EXCEPTION, 500);
				
				put(SECURITY_FUNCTION_NOT_SUPPORTED, 503); 
				put(SECURITY_FUNCTION_TYPE_NOT_SUPPORTED, 503); 
				
				put(CANNOT_FIND_DEVICE, 500); 
				put(CANNOT_FIND_DEVICE_INSUFFICIENT_RESOURCE,  500);
				put(CANNOT_FIND_DEVICE_UNRECOGNIZED, 500);
				put(DEVICE_NOT_SUPPORTED_BY_DRIVER, 500);
				
				put(OPERATION_NOT_SUPPORTED, 400);
				put(PARSE_REQUEST_FAILED, 400);
				put(MISSING_FIELD_APP_ID, 400);
				put(MISSING_FIELD_TENANT_ID, 400);
				put(MISSING_FIELD_SIGNATURE, 400);
				put(INVALID_FIELD_SIGNATURE, 400);
				put(MISSING_FIELD_DATA, 400);
				put(MISSING_FIELD_HEAD, 400);
				put(MISSING_FIELD_METHOD, 400);
				put(MISSING_FIELD_OPTYPE, 400);
				put(INVALID_FIELD_OPTYPE, 400);
				put(MISSING_FIELD_PROTOCOL, 400);
				put(MISSING_FIELD_IP, 400);
				put(MISSING_FIELD_DOMAIN, 400);
				put(MISSING_FIELD_PORT, 400);
				put(INVALID_FIELD_PORT, 400);
				put(MISSING_ARGUMENT, 400);
				put(INVALID_ARGUMENT, 400);
				
				put(DATABASE_INIT_FAILED, 500);
				put(DATABASE_CREATE_TABLE_FAILED, 500);
				put(DATABASE_UPDATE_DATA_FAILED, 500);
				put(DATABASE_DELETE_DATA_FAILED, 500);
				
				put(TARGET_DOES_NOT_EXIST, 404);
				put(DEVICE_DOES_NOT_EXIST, 404);
				
				put(RESOURCE_ALREADY_EXIST, 400);
				put(RESOURCE_DOES_NOT_EXIST, 404);
				
				put(DEVICE_ERROR, 500);
				put(DEVICE_RESPONSE_INVALID, 500);
				put(DEVICE_DRIVER_ERROR, 500);
				put(DEVICE_DOES_NOT_SUPPORT, 500);
				
				put(COMMUNICATE_WITH_DEVICE_ERROR, 500);
				
				put(JSON_PARSE_ERROR, 500);
				put(JSON_WRITE_ERROR, 500);
				
				put(PERMISSION_DENIED, 403);
				
				put(CLONE_FAILED, 500);
			}
		};
		
		return codeMap.get(this);
	}
}

//public class ErrorCode {
//	public static final int SUCCESS = 0;
//	
//	public static final int PROCESS_IN_PROGRESS = SUCCESS + 1;
//	
//	public static final int SECURITY_FUNCTION_NOT_SUPPORTED = SUCCESS + 2;
//	public static final int SECURITY_FUNCTION_TYPE_NOT_SUPPORTED = SUCCESS + 3;
//	
//	public static final int CANNOT_FIND_DEVICE = SUCCESS + 4;
//	public static final int CANNOT_FIND_DEVICE_INSUFFICIENT_RESOURCE = SUCCESS + 5;
//	public static final int CANNOT_FIND_DEVICE_UNRECOGNIZED = SUCCESS + 6;
//	public static final int DEVICE_NOT_SUPPORTED_BY_DRIVER = SUCCESS + 7;
//	
//	public static final int PARSE_REQUEST_FAILED = SUCCESS + 8;
//	public static final int MISSING_FIELD_APP_ID = SUCCESS + 9;
//	public static final int MISSING_FIELD_TENANT_ID = SUCCESS + 10;
//	public static final int MISSING_FIELD_SIGNATURE = SUCCESS + 11;
//	public static final int INVALID_FIELD_SIGNATURE = SUCCESS + 12;
//	public static final int MISSING_FIELD_DATA = SUCCESS + 13;
//	public static final int MISSING_FIELD_HEAD = SUCCESS + 14;
//	public static final int MISSING_FIELD_METHOD = SUCCESS + 15;
//	public static final int MISSING_FIELD_OPTYPE = SUCCESS + 16;
//	public static final int INVALID_FIELD_OPTYPE = SUCCESS + 17;
//	public static final int MISSING_FIELD_PROTOCOL = SUCCESS + 18;
//	public static final int MISSING_FIELD_IP = SUCCESS + 19;
//	public static final int MISSING_FIELD_DOMAIN = SUCCESS + 20;
//	public static final int MISSING_FIELD_PORT = SUCCESS + 21;
//	public static final int INVALID_FIELD_PORT = SUCCESS + 22;
//	public static final int MISSING_ARGUMENT = SUCCESS + 23;
//	public static final int INVALID_ARGUMENT = SUCCESS + 24;
//	
//	public static final int DATABASE_INIT_FAILED = SUCCESS + 25;
//	public static final int DATABASE_CREATE_TABLE_FAILED = SUCCESS + 26;
//	public static final int DATABASE_UPDATE_DATA_FAILED = SUCCESS + 27;
//	public static final int DATABASE_DELETE_DATA_FAILED = SUCCESS + 28;
//	
//	public static final int TARGET_DOES_NOT_EXIST = SUCCESS + 29;
//	public static final int DEVICE_DOES_NOT_EXIST = SUCCESS + 30;
//	
//	public static final int RESOURCE_ALREADY_EXIST = SUCCESS + 31;
//	public static final int RESOURCE_DOES_NOT_EXIST = SUCCESS + 32;
//	
//	public static final int DEVICE_ERROR = SUCCESS + 33;
//	public static final int DEVICE_RESPONSE_INVALID = SUCCESS + 34;
//	public static final int DEVICE_DRIVER_ERROR = SUCCESS + 35;
//	
//	public static final int COMMUNICATE_WITH_DEVICE_ERROR = SUCCESS + 36;
//	
//	public static final int PERMISSION_DENIED = SUCCESS + 37;
//}
