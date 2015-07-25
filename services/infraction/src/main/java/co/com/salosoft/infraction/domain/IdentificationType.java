package co.com.salosoft.infraction.domain;

public class IdentificationType {

	private Integer identificationTypeId;
	
	private String name;

	public Integer getIdentificationTypeId() {
		return identificationTypeId;
	}

	public void setIdentificationTypeId(Integer identificationTypeId) {
		this.identificationTypeId = identificationTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "IdentificationType [identificationTypeId=" + identificationTypeId + ", name=" + name + "]";
	}
	
}
