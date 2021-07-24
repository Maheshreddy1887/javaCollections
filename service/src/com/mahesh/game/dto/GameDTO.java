package com.mahesh.game.dto;

public class GameDTO implements Serializable{
	
private String name;
private String version;
private String developerBy;
private int Maxplayers;
private double memoryRequired;
private boolean online;

    public GameDTO() {
    	System.out.println("invoked defaultconstruter");
    	
    }

	public GameDTO(String name, String version, String developerBy, int maxplayers, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developerBy = developerBy;
		Maxplayers = maxplayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developerBy=" + developerBy + ", Maxplayers="
				+ Maxplayers + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}
    
	@Override
	public boolean equals(Object ref) {
		if(ref == null) return false;
		if(ref instanceof GameDTO) {
			GameDTO cast = (GameDTO) ref;
			if(this.name.equals(cast.name) && this.version.equals(cast.version)&& this.developedBy.equals(cast.developedBy)) {
	
			}
		}
		return true;

	}
	
	@Override
	public int hashCode() {
		System.out.println("hascode : " + this);
		return 63;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeveloperBy() {
		return developerBy;
	}

	public void setDeveloperBy(String developerBy) {
		this.developerBy = developerBy;
	}

	public int getMaxplayers() {
		return Maxplayers;
	}

	public void setMaxplayers(int maxplayers) {
		Maxplayers = maxplayers;
	}

	public double getMemoryRequired() {
		return memoryRequired;
	}

	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
    
    
    
}
