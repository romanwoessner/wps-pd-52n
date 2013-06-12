package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDMessageBinding;

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
