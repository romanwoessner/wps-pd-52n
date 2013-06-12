package net.disy.wps.n52.example;

import java.util.Arrays;

import net.disy.ogc.wps.v_1_0_0.util.WpsUtils;
import net.disy.ogc.wpspd.v_1_0_0.ObjectFactory;
import net.disy.ogc.wpspd.v_1_0_0.ViewportType;
import net.disy.ogc.wpspd.v_1_0_0.WpspdUtils;
import net.disy.wps.n52.binding.PDViewportBinding;
import net.opengis.gml.v_3_1_1.EnvelopeType;

import org.n52.wps.algorithm.annotation.Algorithm;
import org.n52.wps.algorithm.annotation.ComplexDataOutput;
import org.n52.wps.algorithm.annotation.Execute;
import org.n52.wps.server.AbstractAnnotatedAlgorithm;

@Algorithm(
		version = "1.0.0",
		title = "PDViewport dummy",
		abstrakt ="This is a dummy algorithm on a 52N WPS-Server which generates a pd:Viewport"
		)
public class PDViewportDummy extends AbstractAnnotatedAlgorithm {

    public PDViewportDummy() {
        super();
    }
    private ViewportType outputPDViewport;
    
    private final ObjectFactory objectFactory = WpspdUtils.createObjectFactory();
    final net.opengis.gml.v_3_1_1.ObjectFactory gmlObjectFactory = new net.opengis.gml.v_3_1_1.ObjectFactory();
    
    @ComplexDataOutput(
    		identifier ="PDViewport", title = "pd:Viewport output",
    		abstrakt="This is a dummy pd:Viewport", binding = PDViewportBinding.class)
    public ViewportType getPDViewport() {
    	return this.outputPDViewport;
    }
    
    @Execute
    public void runPDViewportTest() {
    	
    	final ViewportType viewportType = objectFactory.createViewportType();
    	final EnvelopeType envelopeType = gmlObjectFactory.createEnvelopeType();

    	// set properties of the pd:Viewport
    	viewportType.setPresentationDirectiveTitle(WpsUtils.createLanguageStringType("This is a pd:Viewport test."));
    	viewportType.setAbstract(WpsUtils.createLanguageStringType("Description of the pd:Viewport"));
    	
    	// assign gml:envelope to pd:Viewport
    	viewportType.setEnvelope(gmlObjectFactory.createEnvelope(envelopeType));
    	
    	// Set properties of the gml:envelope
        envelopeType.setLowerCorner(gmlObjectFactory.createDirectPositionType());
        envelopeType.setUpperCorner(gmlObjectFactory.createDirectPositionType());
        envelopeType.setSrsName("urn:ogc:def:crs:EPSG::4326");
        envelopeType.getLowerCorner().setValue(Arrays.<Double> asList(4.1, 42.3));
        envelopeType.getUpperCorner().setValue(Arrays.<Double> asList(20.5, 58.8));
    	
    	this.outputPDViewport = viewportType;
    }
}