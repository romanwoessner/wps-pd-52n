package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDGroupBinding;


public class PDGroupGenerator extends PDGenerator{

	public PDGroupGenerator() {
		super();
		supportedIDataTypes.add(PDGroupBinding.class);
	}
}
