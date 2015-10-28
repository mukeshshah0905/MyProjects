package main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.emdeon.ITSWebService.ITSReturn;
import com.emdeon.ITSWebService.ITSWS;
import com.emdeon.ITSWebService.ITSWSLocator;
import com.emdeon.ITSWebService.ITSWSSoap;

public class EmdeonClient {

	public static void main(String[] args) {
		
		ITSWS client=new ITSWSLocator();
		try {
			ITSWSSoap soapClient=client.getITSWSSoap();
			System.out.println("hit success");
			try {
				ITSReturn itsReturnResponse=soapClient.authenticate("","");
				System.out.println(itsReturnResponse.getErrorCode()+" : "+itsReturnResponse.getResponse());
				System.out.println(itsReturnResponse);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
