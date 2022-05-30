package jp.co.molygray.self_introduction_app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jp.co.molygray.self_introduction_app.service.AuthorizeService;

@Path("authorize")
public class AuthorizeApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("profileId") String profileId) {
	AuthorizeService service = new AuthorizeService();
	try {
	    long profileIdLong = Long.valueOf(profileId);
	    if (service.authorize(profileIdLong)) {
		return Response.status(200).build();
	    } else {
		return Response.status(403).build();
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	    return Response.status(500).build();
	}
    }
}
