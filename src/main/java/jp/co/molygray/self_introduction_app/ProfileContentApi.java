package jp.co.molygray.self_introduction_app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jp.co.molygray.self_introduction_app.def.ContentTypeEnum;
import jp.co.molygray.self_introduction_app.service.ProfileContentService;

@Path("profileContent")
public class ProfileContentApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("contentId") String contentId) {
	ProfileContentService service = new ProfileContentService();
	try {
	    Long contentIdLong = Long.valueOf(contentId);
	    ContentTypeEnum contentType = ContentTypeEnum.of(service.getConentType(contentIdLong));
	    Object body = null;
	    switch (contentType) {
	    case BASIC:
		body = service.getBasicContent(contentIdLong);
		break;
	    case LIST:
		body = service.getListContent(contentIdLong);
		break;
	    case SIMPLE_TEXT:
		body = service.getSimpleTextContent(contentIdLong);
		break;
	    default:
		throw new IllegalStateException(String.format("illegal contentType: %s", contentType));
	    }
	    return Response.ok(body).build();
	} catch (Exception ex) {
	    ex.printStackTrace();
	    return Response.status(500).build();
	}
    }
}
