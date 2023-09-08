package com.test1;

public class FileSystem {
	private String storageId;
	private String type;
	private int capacity;
	private int partitions;
	private String mainPartition;
	private int availableCapacity;
	private int restrictedCapacity;
	private boolean secured;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public FileSystem() {

	}

	public FileSystem(String storageId, String type, int capacity, int partitions, String mainPartition,
			int availableCapacity, int restrictedCapacity, boolean secured, int errorCode, String errorSeverity,
			String entityState) {
		super();
		this.storageId = storageId;
		this.type = type;
		this.capacity = capacity;
		this.partitions = partitions;
		this.mainPartition = mainPartition;
		this.availableCapacity = availableCapacity;
		this.restrictedCapacity = restrictedCapacity;
		this.secured = secured;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.entityState = entityState;
	}

	public String getStorageId() {
		return storageId;
	}

	public void setStorageId(String storageId) {
		this.storageId = storageId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPartitions() {
		return partitions;
	}

	public void setPartitions(int partitions) {
		this.partitions = partitions;
	}

	public String getMainPartition() {
		return mainPartition;
	}

	public void setMainPartition(String mainPartition) {
		this.mainPartition = mainPartition;
	}

	public int getAvailableCapacity() {
		return availableCapacity;
	}

	public void setAvailableCapacity(int availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	public int getRestrictedCapacity() {
		return restrictedCapacity;
	}

	public void setRestrictedCapacity(int restrictedCapacity) {
		this.restrictedCapacity = restrictedCapacity;
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
