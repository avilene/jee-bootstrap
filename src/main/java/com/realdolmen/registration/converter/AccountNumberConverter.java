package com.realdolmen.registration.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass = AccountNumber.class)
public class AccountNumberConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        String[] accountNrs = s.split("-");
        AccountNumber accountNumber = new AccountNumber();
        if(accountNrs.length > 2) {
            accountNumber.setPrefix(Integer.parseInt(accountNrs[0]));
            accountNumber.setMiddle(Integer.parseInt(accountNrs[1]));
            accountNumber.setControl(Integer.parseInt(accountNrs[2]));
        }else{
            FacesMessage message = new FacesMessage("Bad account number");
            throw new ConverterException(message);
        }

        return accountNumber;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return o.toString();
    }
}
