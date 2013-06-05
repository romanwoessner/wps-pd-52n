package net.disy.wps.n52.wps.io.datahandler.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import net.disy.ogc.wps.v_1_0_0.WpsConstants;
import net.disy.ogc.wpspd.v_1_0_0.Geometry;
import net.disy.ogc.wpspd.v_1_0_0.GeometryType;
import net.disy.ogc.wpspd.v_1_0_0.Group;
import net.disy.ogc.wpspd.v_1_0_0.GroupType;
import net.disy.ogc.wpspd.v_1_0_0.Link;
import net.disy.ogc.wpspd.v_1_0_0.LinkType;
import net.disy.ogc.wpspd.v_1_0_0.Marker;
import net.disy.ogc.wpspd.v_1_0_0.MarkerType;
import net.disy.ogc.wpspd.v_1_0_0.Message;
import net.disy.ogc.wpspd.v_1_0_0.MessageType;
import net.disy.ogc.wpspd.v_1_0_0.ObjectFactory;
import net.disy.ogc.wpspd.v_1_0_0.PresentationDirectiveType;
import net.disy.ogc.wpspd.v_1_0_0.StyledFeatureCollectionType;
import net.disy.ogc.wpspd.v_1_0_0.Viewport;
import net.disy.ogc.wpspd.v_1_0_0.ViewportType;
import net.disy.ogc.wpspd.v_1_0_0.WpspdUtils;

import org.n52.wps.io.data.IData;
import org.n52.wps.io.datahandler.generator.AbstractGenerator;

public abstract class AbstractPDGenerator extends AbstractGenerator {

	private final ObjectFactory objectFactory = WpspdUtils.createObjectFactory();
	
	public AbstractPDGenerator() {
		super();
	}

	private void writeToStream(IData coll, OutputStream os) throws IOException,
			JAXBException {

		JAXBContext context = WpspdUtils.createJaxbContext();
		Marshaller m = context.createMarshaller();
		try {
			m.setProperty("com.sun.xml.bind.namespacePrefixMapper",
					WpsConstants.NAMESPACE_PREFIX_MAPPER);
		} catch (PropertyException e) {
			e.printStackTrace();
		}

		PresentationDirectiveType pdColl = (PresentationDirectiveType) coll
				.getPayload();
		
		if (pdColl instanceof LinkType) {
			LinkType lt = (LinkType) pdColl;
			Link link = objectFactory.createLink(lt);
			m.marshal(link, os);
			return;
		}
		else if (pdColl instanceof MessageType) {
			MessageType mt = (MessageType) pdColl;
			Message msg = objectFactory.createMessage(mt);
			m.marshal(msg, os);
			return;
		}
		else if (pdColl instanceof ViewportType) {
			ViewportType vpt = (ViewportType) pdColl;
			Viewport vp = objectFactory.createViewport(vpt);
			m.marshal(vp, os);
			return;
		}
		else if (pdColl instanceof MarkerType) {
			MarkerType mkt = (MarkerType) pdColl;
			Marker mk = objectFactory.createMarker(mkt);
			m.marshal(mk, os);
			return;
		}
		else if (pdColl instanceof GeometryType) {
			GeometryType geomt = (GeometryType) pdColl;
			Geometry geom = objectFactory.createGeometry(geomt);
			m.marshal(geom, os);
			return;
		}
		else if (pdColl instanceof GroupType) {
			GroupType groupt = (GroupType) pdColl;
			Group group = objectFactory.createGroup(groupt);
			m.marshal(group, os);
			return;
		}
		
		else if (pdColl instanceof StyledFeatureCollectionType) {
			StyledFeatureCollectionType sfct = (StyledFeatureCollectionType) pdColl;
			m.marshal(objectFactory.createStyledFeatureCollection(sfct), os);
			return;
		}
	}

	@Override
	public InputStream generateStream(IData data, String mimeType, String schema)
			throws IOException {

		String uuid = UUID.randomUUID().toString();
		File file = File.createTempFile("pd" + uuid, ".xml");
		FileOutputStream outputStream = new FileOutputStream(file);
		try {
			this.writeToStream(data, outputStream);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		outputStream.flush();
		outputStream.close();
		if (file.length() <= 0) {
			return null;
		}
		FileInputStream inputStream = new FileInputStream(file);

		return inputStream;
	}

}
