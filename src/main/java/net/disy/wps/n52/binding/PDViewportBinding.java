package net.disy.wps.n52.binding;

import net.disy.ogc.wpspd.v_1_0_0.ViewportType;

import org.n52.wps.io.data.IComplexData;

public class PDViewportBinding implements IComplexData{

	private static final long serialVersionUID = 986075386690785319L;
	protected transient ViewportType pdViewport;
	
	public PDViewportBinding(ViewportType payload) {
		this.pdViewport = payload;
	}
	
	@Override
	public ViewportType getPayload() {
		return pdViewport;
	}

	@Override
	public Class<?> getSupportedClass() {
		return ViewportType.class;
	}
	
	@Override
	public void dispose() {
		
	}
}
