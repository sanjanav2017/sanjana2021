package springbeanfactoryDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Message{
	
	List addressList;
	
	Set addressSet;
	
	Map addressMap;
	
	Properties addressproperties;

	public List getAddressList() {
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressproperties() {
		return addressproperties;
	}

	public void setAddressproperties(Properties addressproperties) {
		this.addressproperties = addressproperties;
	}
	
	
	
	

}
