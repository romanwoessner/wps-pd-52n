package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDStyledFeatureCollectionBinding;

/**
 * Generates a PD-StyledFeatureCollection Element and holds a PDStyledFeatureCollectionBinding
 * @author romanwoessner
 *
 */
public class PDStyledFeatureCollectionGenerator extends AbstractPDGenerator{

	public PDStyledFeatureCollectionGenerator() {
		super();
		supportedIDataTypes.add(PDStyledFeatureCollectionBinding.class);
	}
}
