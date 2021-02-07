package nodtos;

import java.util.HashMap;
import java.util.Map;

public class JsonPage implements Page {
	private final Map<String, String> map;
   
	JsonPage(){
		this(new HashMap<String, String>());
	}
	
	JsonPage(Map<String, String> map){
		this.map = map;
	}

	@Override
	public Page with(String name, String value) {
		Map<String, String> map = new HashMap<String,String>();
		map.putAll(this.map);
		map.put(name, value);
		return new JsonPage(map);
	}

	@Override
	public String value() {
        StringBuilder json = new StringBuilder();
        for(Map.Entry ent : this.map.entrySet()) {
        	json.append(ent.getKey());
        	json.append(ent.getValue());
        }
		return json.toString();
	}
}
