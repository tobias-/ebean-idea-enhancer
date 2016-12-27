package y;

import java.io.IOException;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class InnerClassCrash {
    @Inject
    public InnerClassCrash() throws IOException {
	final ObjectMapper objectMapper = new ObjectMapper();
	ArrayNode jsonNode = objectMapper.readValue("[]", ArrayNode.class);

	    for (JsonNode node : jsonNode) {
		String code = node.get("_id").asText();

		JsonNode translationsNode = node.get("translations");
	    System.err.println(translationsNode);
	}
    }
}
