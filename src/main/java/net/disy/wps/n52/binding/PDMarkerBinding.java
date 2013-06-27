package net.disy.wps.n52.binding;

import net.disy.ogc.wpspd.v_1_0_0.MarkerType;

import org.n52.wps.io.data.IComplexData;

public class PDMarkerBinding implements IComplexData{

	private static final long serialVersionUID = -8827635070282557913L;
	protected transient MarkerType pdMarker;
	
	public PDMarkerBinding(MarkerType payload) {
		this.pdMarker = payload;
	}
	
	@Override
	public MarkerType getPayload() {
		return pdMarker;
	}

	@Override
	public Class<?> getSupportedClass() {
		return MarkerType.class;
	}

	@Override
	public void dispose() {
		
	}
}
