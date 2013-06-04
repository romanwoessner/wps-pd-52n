package net.disy.wps.n52.wps.io.data.binding.complex;

import net.disy.ogc.wpspd.v_1_0_0.GeometryType;

import org.n52.wps.io.data.IComplexData;

public class PDGeometryBinding implements IComplexData{

	private static final long serialVersionUID = 5139380428844498783L;
	protected transient GeometryType pdGeometry;
	
	public PDGeometryBinding(GeometryType payload) {
		this.pdGeometry = payload;
	}
	
	@Override
	public GeometryType getPayload() {
		return pdGeometry;
	}

	@Override
	public Class<?> getSupportedClass() {
		return GeometryType.class;
	}
}
