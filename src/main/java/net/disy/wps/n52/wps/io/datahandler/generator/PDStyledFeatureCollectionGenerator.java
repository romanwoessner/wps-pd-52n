package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDStyledFeatureCollectionBinding;


public class PDStyledFeatureCollectionGenerator extends PDGenerator{

	public PDStyledFeatureCollectionGenerator() {
		super();
		supportedIDataTypes.add(PDStyledFeatureCollectionBinding.class);
	}
}