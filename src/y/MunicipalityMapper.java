package y;

import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MunicipalityMapper {
    @Inject
    private MunicipalityMapper() throws IOException {
	ObjectMapper om = new ObjectMapper();
	try (InputStream is = getClass().getResourceAsStream("/foo.json")) {
	    JsonNode jsonNode = om.readValue(is, JsonNode.class);
	} catch (IOException e) {
	    throw e;
	}
    }
}
