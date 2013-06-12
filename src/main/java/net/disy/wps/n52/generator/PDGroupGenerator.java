package net.disy.wps.n52.generator;

import net.disy.wps.n52.binding.PDGroupBinding;

/**
 * Generates a PD-Group Element and holds a PDGroupBinding
 * @author romanwoessner
 *
 */
public class PDGroupGenerator extends AbstractPDGenerator{

	public PDGroupGenerator() {
		super();
		supportedIDataTypes.add(PDGroupBinding.class);
	}
}
