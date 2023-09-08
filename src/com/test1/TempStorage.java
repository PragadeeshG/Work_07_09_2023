package com.test1;

public class TempStorage {
	private String id;
	private String os;
	private String storageType;
	private String host;
	private String userName;
	private String encryptedPassword;
	private int capacity;
	private String passwordExpiryDate;
	private boolean adminUserName;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public TempStorage() {

	}

	public TempStorage(String id, String os, String storageType, String host, String userName, String encryptedPassword,
			int capacity, String passwordExpiryDate, boolean adminUserName, int errorCode, String errorSeverity,
			String entityState) {
		super();
		this.id = id;
		this.os = os;
		this.storageType = storageType;
		this.host = host;
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.capacity = capacity;
		this.passwordExpiryDate = passwordExpiryDate;
		this.adminUserName = adminUserName;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.entityState = entityState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getPasswordExpiryDate() {
		return passwordExpiryDate;
	}

	public void setPasswordExpiryDate(String passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}

	public boolean isAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(boolean adminUserName) {
		this.adminUserName = adminUserName;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
