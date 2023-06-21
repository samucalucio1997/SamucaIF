package Teste;

import java.io.Serializable;

public class SycallTest implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int serviceNumber;


	private String serviceName;

	public SycallTest(int serviceNumber, String serviceName) {
		super();
		this.serviceNumber = serviceNumber;
		this.serviceName = serviceName;
	}
	public void setServiceNumber(int serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public String getServiceName() {
		return serviceName;
	}

	@Override
	public String toString() {
		return "SycallTest{" +
				"serviceNumber=" + serviceNumber +
				", serviceName='" + serviceName + '\'' +
				'}';
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getServiceNumber() {
		return serviceNumber;
	}
}