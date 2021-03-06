package de.sambalmueslie.wot_api_lib.strongholds_api.request;

import de.sambalmueslie.wot_api_lib.common.BaseWotRequest;
import java.lang.String;
import java.util.Map;
import java.lang.Object;

public class StrongholdAccountStatsRequest extends BaseWotRequest  {

	public StrongholdAccountStatsRequest(final long account_id) {
		this.account_id = account_id;
	}

	@Override
	public String getMethod(  ) { 
		return "wot/stronghold/accountstats/";
	}

	@Override
	public  void getParameter( Map<String, Object> params ) { 
		if (access_token != null ) {
			params.put("access_token",access_token);
		}
if (account_id > 0) {
			params.put("account_id",account_id);
		}

	}

	public  void setAccess_token( String access_token ) { 
		this.access_token = access_token;

	}

	private java.lang.String access_token;
	private long account_id;
}

