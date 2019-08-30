// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public enum UserType
{
	Internal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Internal" }, new java.lang.String[] { "nl_NL", "Intern" } }),
	External(new java.lang.String[][] { new java.lang.String[] { "en_US", "External" }, new java.lang.String[] { "nl_NL", "Extern" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private UserType(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("nl_NL");
	}

	public java.lang.String getCaption()
	{
		return captions.get("nl_NL");
	}
}
