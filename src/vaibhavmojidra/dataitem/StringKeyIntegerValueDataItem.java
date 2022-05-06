package vaibhavmojidra.dataitem;
/**
 * StringKeyIntegerValueDataItem class is the model class to store key value pair item for data set where key will be a string and value will be an integer
 * @author Vaibhav Mojidra
 *
*/

public class StringKeyIntegerValueDataItem {
	private String key;
	private int value;
	/**
	 * This will create the class StringKeyIntegerValueDataItem's object with default value key as "" and value as -1.
	 * @see #setKey(String)
	 * @see #setValue(int)
	 */
	public StringKeyIntegerValueDataItem() {
		key="";
		value=-1;
	}
	/**
	 * This will create the class StringKeyIntegerValueDataItem's object with specified key and value.
	 * @param key It will assign a string value to key.
	 * @param value It will assign a integer value to value.
	 * @see #setKey(String)
	 * @see #setValue(int)
	 */
	public StringKeyIntegerValueDataItem(String key, int value) {
		this.key = key;
		this.value = value;
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
	public int getValue() {
		return value;
	}
	/**
	 * This function will set value to value.
	 * @param value It takes integer as argument and sets the value with same
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
