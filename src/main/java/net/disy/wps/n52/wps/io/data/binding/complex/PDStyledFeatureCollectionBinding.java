package net.disy.wps.n52.wps.io.data.binding.complex;

import net.disy.ogc.wpspd.v_1_0_0.StyledFeatureCollectionType;

import org.n52.wps.io.data.IComplexData;

public class PDStyledFeatureCollectionBinding implements IComplexData{

	private static final long serialVersionUID = 1885888727610648000L;
	protected transient StyledFeatureCollectionType pdSfc;

	public PDStyledFeatureCollectionBinding(StyledFeatureCollectionType payload) {
		this.pdSfc = payload;
	}

	@Override
	public StyledFeatureCollectionType getPayload() {
		return pdSfc;
	}

	@Override
	public Class<?> getSupportedClass() {
		return StyledFeatureCollectionType.class;
	}
}