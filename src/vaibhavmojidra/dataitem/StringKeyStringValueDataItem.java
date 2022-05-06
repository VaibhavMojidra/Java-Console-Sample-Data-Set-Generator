package vaibhavmojidra.dataitem;

/**
 * StringKeyStringValueDataItem class is the model class to store key value pair item for data set where both data and key will be strings
 * @author Vaibhav Mojidra
 *
*/
public class StringKeyStringValueDataItem {
	private String key;
	private String value;
	/**
	 * This will create the class StringKeyStringValueDataItem's object with specified key and value.
	 * @see #setKey(String)
	 * @see #setValue(String)
	 * @param key It will assign a string value to key.
	 * @param value It will assign a string value to value.
	 */
	public StringKeyStringValueDataItem (String key, String value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * This will create the class StringKeyStringValueDataItem's object with default value key as "" and value as "".
	 * @see #setKey(String)
	 * @see #setValue(String)
	 */
	public StringKeyStringValueDataItem () {
		key ="";
		value = "";
	}
	/**
	 * This function will return value of key.
	 * @return This returns value of key.
	 */
	public String getKey() {
		return key;
	}
	/**
	 * This function will set value to key.
	 * @param key It takes string as argument and sets the key with same
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * This function will return value of value.
	 * @return This returns value of value.
	 */
	public String getValue() {
		return value;
	}
	/**
	 * This function will set value to value.
	 * @param value It takes string as argument and sets the value with same
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
