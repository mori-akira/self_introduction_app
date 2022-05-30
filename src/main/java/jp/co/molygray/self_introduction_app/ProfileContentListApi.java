package jp.co.molygray.self_introduction_app;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import jp.co.molygray.self_introduction_app.entity.ProfileContent;
import jp.co.molygray.self_introduction_app.service.ProfileContentService;

@Path("profileContentList")
public class ProfileContentListApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProfileContent> get(@QueryParam("profileId") String profileId) {
	ProfileContentService service = new ProfileContentService();
	try {
	    Long profileIdLong = Long.valueOf(profileId);
	    return service.getContentIdList(Long.valueOf(profileIdLong));
	} catch (Exception ex) {
	    ex.printStackTrace();
	    throw new WebApplicationException(500);
	}

    }
}
