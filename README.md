# 52°North WPS-PD Extension

Extension for the 52°North WPS Server which makes a process able to generate [WPS-PD](http://schemas.disy.net/wps-pd/1.0.0/wps-pd.xsd) Elements.
The extension contains an AbstractPDGenerator, seven generators for practical PD-Elements and seven PD-Bindings to wrap the PD-Elements. Each of the PD-Generators supports the appropriate PD-Binding IDataType.

## Supported WPS-PD Elements
 * Link
 * Message
 * Viewport
 * Marker
 * Geometry
 * StyledFeatureCollection
 * Group
 
## Configuration
Register each necessary generator in the wps_config.xml of your 52n WPS-Server instance.
Use the appropriate schema according to [disy WPS-PD](https://www.legato.net/display/LEGATO/WPS+Presentation+Directives) as exclusive format. 

Example:
```xml
<Generator name="PDViewportGenerator"
    className="net.disy.wps.n52.wps.io.datahandler.generator.PDViewportGenerator"
    active="true">
    <Format mimetype="text/xml"
        encoding="default"
        schema="http://schemas.disy.net/wps-pd/1.0.0/wps-pd.xsd#Viewport" />
</Generator>
```

## Usage
Once the generators are registered, you can use PD-Elements as outputs of algorithms. The following code-sample shows an extract of an AbstractAnnotatedAlgorithm.
```java
private ViewportType outputPDViewport;

@ComplexDataOutput(identifier ="PDViewport", binding = PDViewportBinding.class)
    public ViewportType getPDViewport() {
    	return this.outputPDViewport;
    }
```
