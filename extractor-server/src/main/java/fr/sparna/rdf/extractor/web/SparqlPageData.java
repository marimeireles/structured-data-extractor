package fr.sparna.rdf.extractor.web;

public class SparqlPageData {

	public static final String KEY = SparqlPageData.class.getCanonicalName();
	
	protected String endpoint;

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
}
