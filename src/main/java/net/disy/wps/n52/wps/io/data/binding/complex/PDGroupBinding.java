package net.disy.wps.n52.wps.io.data.binding.complex;

import net.disy.ogc.wpspd.v_1_0_0.GroupType;

import org.n52.wps.io.data.IComplexData;

public class PDGroupBinding implements IComplexData{

	private static final long serialVersionUID = -1432164107847780936L;
	protected transient GroupType pdGroup;
	
	public PDGroupBinding(GroupType payload) {
		this.pdGroup = payload;
	}
	
	@Override
	public GroupType getPayload() {
		return pdGroup;
	}

	@Override
	public Class<?> getSupportedClass() {
		return GroupType.class;
	}
}
