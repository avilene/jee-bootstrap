package com.realdolmen.registration;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;

@FacesComponent(value="ColoredValueComponent")
public class ColoredValueComponent extends UIComponentBase {

    @Override
    public String getFamily() {
        return null;
    }

    @Override
    public void encodeAll(FacesContext context) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        writer.startElement("span", this);
        int value = Integer.parseInt((String)getAttributes().get("value"));
        String color;
        if(value < 0){
            color = "red";
        }else{
            color = "black";
        }
        writer.writeAttribute("style", "color: " + color + ";", null);
        writer.writeText(value + "",null);
        writer.endElement("span");
    }
}
