package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDMarkerBinding;

public class PDMarkerGenerator extends AbstractPDGenerator{

	public PDMarkerGenerator() {
		super();
		supportedIDataTypes.add(PDMarkerBinding.class);
	}
}
