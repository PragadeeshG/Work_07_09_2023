package com.test1;

public class UnixFileSystem {
	private String id;
	private int capacity;
	private String rootUserName;
	private int numberOfUsers;
	private String transferMechanism;
	private boolean secureCopyAvailable;
	private boolean sftpAvailable;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public UnixFileSystem() {

	}

	public UnixFileSystem(String id, int capacity, String rootUserName, int numberOfUsers, String transferMechanism,
			boolean secureCopyAvailable, boolean sftpAvailable, int errorCode, String errorSeverity,
			String entityState) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.rootUserName = rootUserName;
		this.numberOfUsers = numberOfUsers;
		this.transferMechanism = transferMechanism;
		this.secureCopyAvailable = secureCopyAvailable;
		this.sftpAvailable = sftpAvailable;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getRootUserName() {
		return rootUserName;
	}

	public void setRootUserName(String rootUserName) {
		this.rootUserName = rootUserName;
	}

	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	public String getTransferMechanism() {
		return transferMechanism;
	}

	public void setTransferMechanism(String transferMechanism) {
		this.transferMechanism = transferMechanism;
	}

	public boolean isSecureCopyAvailable() {
		return secureCopyAvailable;
	}

	public void setSecureCopyAvailable(boolean secureCopyAvailable) {
		this.secureCopyAvailable = secureCopyAvailable;
	}

	public boolean isSftpAvailable() {
		return sftpAvailable;
	}

	public void setSftpAvailable(boolean sftpAvailable) {
		this.sftpAvailable = sftpAvailable;
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
