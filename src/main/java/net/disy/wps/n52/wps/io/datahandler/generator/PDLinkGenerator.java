package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDLinkBinding;

public class PDLinkGenerator extends PDGenerator{

	public PDLinkGenerator() {
		super();
		supportedIDataTypes.add(PDLinkBinding.class);
	}
	
}
