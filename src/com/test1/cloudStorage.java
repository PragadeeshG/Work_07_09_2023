package com.test1;

public class cloudStorage {
	private String id;
	private String storageType;
	private String storageProvider;
	private String host;
	private String userName;
	private String encryptedPassword;
	private int capacity;
	private boolean secured;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public cloudStorage() {

	}

	public cloudStorage(String id, String storageProvider, String host, String userName, String encryptedPassword,
			int capacity, boolean secured, int errorCode, String errorSeverity, String entityState) {
		super();
		this.id = id;
		this.storageProvider = storageProvider;
		this.host = host;
		this.userName = userName;
		this.encryptedPassword = encryptedPassword;
		this.capacity = capacity;
		this.secured = secured;
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

	public String getStorageProvider() {
		return storageProvider;
	}

	public void setStorageProvider(String storageProvider) {
		this.storageProvider = storageProvider;
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

	public boolean isSecured() {
		return secured;
	}

	public void setSecured(boolean secured) {
		this.secured = secured;
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
