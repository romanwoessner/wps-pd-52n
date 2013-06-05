package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDLinkBinding;

/**
 * Generates a PD-Link Element and holds a PDLinkBinding
 * @author romanwoessner
 *
 */
public class PDLinkGenerator extends AbstractPDGenerator{

	public PDLinkGenerator() {
		super();
		supportedIDataTypes.add(PDLinkBinding.class);
	}
	
}
