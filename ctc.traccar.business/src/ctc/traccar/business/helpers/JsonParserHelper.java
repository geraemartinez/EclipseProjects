package ctc.traccar.business.helpers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonParserHelper {

	private static Logger logger = Logger.getLogger(JsonParserHelper.class);

	public static String toJson( Object object) {
	
	    try {
	    	final OutputStream out = new ByteArrayOutputStream();
		    final ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(out, object);
			final byte[] data = ((ByteArrayOutputStream) out).toByteArray();
			String json = new String(data);
			return json;
		} catch (JsonGenerationException e) {
			
			logger.error("[ERROR] JsonGenerationException - the following error ocurred at UserController in UserAll() method \n "+ e);
			e.printStackTrace();
		} catch (JsonMappingException e) {
			logger.error("[ERROR] JsonMappingException - the following error ocurred at UserController in UserAll() method \n "+ e);
			e.printStackTrace();
		} catch (IOException e) {
			logger.error("[ERROR] IOException - the following error ocurred at UserController in UserAll() method \n "+ e);
			e.printStackTrace();
		}
	    return null;
	}
}
