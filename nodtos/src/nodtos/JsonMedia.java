package nodtos;

public class JsonMedia implements Media{
	private final Page page;
	
	public JsonMedia(Page page) {
		this.page = page;
	}

	@Override
	public Media with(String name, String value) {
		return new JsonMedia(this.page.with(name, value));
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return this.page.value();
	}

}
