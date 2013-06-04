# 52°North WPS-PD Extension

Extension for the 52°North WPS Server which makes a process able to generate [WPS-PD](http://schemas.disy.net/wps-pd/1.0.0/wps-pd.xsd) Elements.

## Supported WPS-PD Elements
 * Link
 * Message
 * Viewport
 * Marker
 * Geometry
 * StyledFeatureCollection
 * Group
 
## Configuration
Register each generator you want to use in the wps_config.xml of the 52n WPS-Server.
Use the appropriate schema according to [disy WPS-PD](https://www.legato.net/display/LEGATO/WPS+Presentation+Directives).

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
