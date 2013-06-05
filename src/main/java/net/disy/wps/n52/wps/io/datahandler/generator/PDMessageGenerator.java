package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDMessageBinding;

/**
 * Generates a PD-Message Element and holds a PDMessageBinding
 * @author romanwoessner
 *
 */
public class PDMessageGenerator extends AbstractPDGenerator{

	public PDMessageGenerator() {
		super();
		supportedIDataTypes.add(PDMessageBinding.class);
	}
	
}
