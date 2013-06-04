package net.disy.wps.n52.wps.io.data.binding.complex;

import net.disy.ogc.wpspd.v_1_0_0.LinkType;

import org.n52.wps.io.data.IComplexData;

public class PDLinkBinding implements IComplexData{
	
	private static final long serialVersionUID = 8021745389298884695L;
	protected transient LinkType pdLink;
	
	public PDLinkBinding(LinkType payload) {
		this.pdLink = payload;
	}
	
	@Override
	public LinkType getPayload() {
		return pdLink;
	}

	@Override
	public Class<?> getSupportedClass() {
		return LinkType.class;
	}
}
