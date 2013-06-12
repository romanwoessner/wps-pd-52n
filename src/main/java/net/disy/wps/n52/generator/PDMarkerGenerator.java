package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDMarkerBinding;

/**
 * Generates a PD-Marker Element and holds a PDMarkerBinding
 * @author romanwoessner
 *
 */
public class PDMarkerGenerator extends AbstractPDGenerator{

	public PDMarkerGenerator() {
		super();
		supportedIDataTypes.add(PDMarkerBinding.class);
	}
}
