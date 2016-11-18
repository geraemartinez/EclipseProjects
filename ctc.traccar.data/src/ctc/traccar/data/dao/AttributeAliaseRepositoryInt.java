package ctc.traccar.data.dao;

import java.util.List;

import ctc.traccar.data.entities.AttributeAliase;
import ctc.traccar.data.entities.Device;

public interface AttributeAliaseRepositoryInt {
	
	public List<AttributeAliase> getAll();
	public AttributeAliase getById(AttributeAliase obj);
	public AttributeAliase getByAlias(AttributeAliase obj);
	public AttributeAliase byDevice(Device obj);
	
	public Device getDeviceByAlias(AttributeAliase obj);
	public Device getDeviceByIdAttributeAliase(AttributeAliase obj);
	public Device getDeviceByAliasAttributeAliase (AttributeAliase obj);	
}
