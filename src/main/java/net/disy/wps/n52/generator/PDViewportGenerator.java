package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDViewportBinding;

/**
 * Generates a PD-Viewport Element and holds a PDViewportBinding
 * @author romanwoessner
 *
 */
public class PDViewportGenerator extends AbstractPDGenerator{

	public PDViewportGenerator() {
		super();
		supportedIDataTypes.add(PDViewportBinding.class);
	}
	
}
