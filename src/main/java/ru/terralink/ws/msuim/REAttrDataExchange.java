package ru.terralink.ws.msuim;

import ru.terralink.ws.object.request.REDataExchangeAttrECD;
import ru.terralink.ws.object.response.REAttrDataExchangeResponse;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by AzarovD on 19.01.2016.
 */
public interface REAttrDataExchange {

    String reAttrDataExchangeResponseMessage(REAttrDataExchangeResponse reAttrDataExchangeResponse);


    public void reAttrDataExchangeMessage(REDataExchangeAttrECD reAttrDataExchangeMessage);
}
