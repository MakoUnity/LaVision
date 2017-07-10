package com.MakoLab.Unity.LaVision.Commons;

public enum DatabaseHelper {
	ACTUAL_ADDRESS_ID("17ce5374-6540-11e7-907b-a6006ad3dba0"),
	ANIMATION_CONSTANTS_ID("54f0699a-6540-11e7-907b-a6006ad3dba0");
	
	private String id;
	
	DatabaseHelper(String id){
		this.id = id;			
	}
	
	public String getID(){
		return id;
	}
}
