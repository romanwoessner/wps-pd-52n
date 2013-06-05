package net.disy.wps.n52.wps.io.datahandler.generator;

import net.disy.wps.n52.wps.io.data.binding.complex.PDGroupBinding;

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
