package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDViewportBinding;

public class PDViewportGenerator extends AbstractPDGenerator{

	public PDViewportGenerator() {
		super();
		supportedIDataTypes.add(PDViewportBinding.class);
	}
	
}
