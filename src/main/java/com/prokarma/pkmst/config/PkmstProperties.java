package com.prokarma.pkmst.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "pkmst", ignoreUnknownFields = false)
public class PkmstProperties {

	private final Swagger swagger = new Swagger();
	
	
	public Swagger getSwagger() {
		return swagger;
	}


	public static class Swagger {

	    private String title = "Pkmst API";

	    private String description = "Pkmst API documentation";

	    private String version = "0.0.1";

	    private String termsOfServiceUrl;

	    private String contactName;

	    private String contactUrl;

	    private String contactEmail;

	    private String license;

	    private String licenseUrl;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getVersion() {
	        return version;
	    }

	    public void setVersion(String version) {
	        this.version = version;
	    }

	    public String getTermsOfServiceUrl() {
	        return termsOfServiceUrl;
	    }

	    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
	        this.termsOfServiceUrl = termsOfServiceUrl;
	    }

	    public String getContactName() {
	        return contactName;
	    }

	    public void setContactName(String contactName) {
	        this.contactName = contactName;
	    }

	    public String getContactUrl() {
	        return contactUrl;
	    }

	    public void setContactUrl(String contactUrl) {
	        this.contactUrl = contactUrl;
	    }

	    public String getContactEmail() {
	        return contactEmail;
	    }

	    public void setContactEmail(String contactEmail) {
	        this.contactEmail = contactEmail;
	    }

	    public String getLicense() {
	        return license;
	    }

	    public void setLicense(String license) {
	        this.license = license;
	    }

	    public String getLicenseUrl() {
	        return licenseUrl;
	    }

	    public void setLicenseUrl(String licenseUrl) {
	        this.licenseUrl = licenseUrl;
	    }
	}
}

