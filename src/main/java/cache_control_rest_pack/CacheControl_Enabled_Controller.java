//package cache_control_rest_pack;
//
//public class CacheControl_Enabled_Controller {
//	
//	@Path("/book/{id}")
//	@GET
//	public Response getBook(@PathParam("id") long id
//
//	    Book myBook = getBookFromDB(id);
//		
//	    CacheControl cc = new CacheControl();
//	    cc.setMaxAge(86400);
//	    cc.setPrivate(true);
//
//	    ResponseBuilder builder = Response.ok(myBook);
//	    builder.cacheControl(cc);
//	    return builder.build();
//	}
//
//
//}
