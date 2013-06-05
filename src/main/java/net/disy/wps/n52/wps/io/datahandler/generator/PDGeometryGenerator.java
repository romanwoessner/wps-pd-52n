package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDGeometryBinding;

/**
 * Generates a PD-Geometry Element and holds a PDGeometryBinding
 * @author romanwoessner
 *
 */
public class PDGeometryGenerator extends AbstractPDGenerator{

	public PDGeometryGenerator() {
		super();
		supportedIDataTypes.add(PDGeometryBinding.class);
	}
}
