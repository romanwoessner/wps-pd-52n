package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDGeometryBinding;

public class PDGeometryGenerator extends PDGenerator{

	public PDGeometryGenerator() {
		super();
		supportedIDataTypes.add(PDGeometryBinding.class);
	}
}
