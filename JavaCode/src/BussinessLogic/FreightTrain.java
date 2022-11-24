package BussinessLogic;

public class FreightTrain extends Train
{

	private String FreightType;

	public String getFreightType() {
		return FreightType;
	}
	public void setFreightType(String freightType) {
		FreightType = freightType;
	}

	public FreightTrain(int iD, String name, String type, int maxCapacity, String freightType) {
		super(iD, name, type, maxCapacity);
		FreightType = freightType;
	}
	
}
