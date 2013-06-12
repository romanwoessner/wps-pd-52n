package net.disy.wps.n52.binding;

import net.disy.ogc.wpspd.v_1_0_0.MessageType;

import org.n52.wps.io.data.IComplexData;

public class PDMessageBinding implements IComplexData{
	
	private static final long serialVersionUID = -3098616963534304367L;
	protected transient MessageType pdMessage;
	
	public PDMessageBinding(MessageType payload) {
		this.pdMessage = payload;
	}
	
	@Override
	public MessageType getPayload() {
		return pdMessage;
	}

	@Override
	public Class<?> getSupportedClass() {
		return MessageType.class;
	}
}
