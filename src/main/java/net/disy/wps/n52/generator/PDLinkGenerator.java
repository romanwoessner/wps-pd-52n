package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDLinkBinding;

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
