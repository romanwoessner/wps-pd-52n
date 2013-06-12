package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDStyledFeatureCollectionBinding;

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
