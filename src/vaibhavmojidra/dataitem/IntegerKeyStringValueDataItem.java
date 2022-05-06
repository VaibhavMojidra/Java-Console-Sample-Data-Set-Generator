package vaibhavmojidra.dataitem;
/**
 * IntegerKeyStringValueDataItem class is the model class to store key value pair item for data set where key will be an integer and value will be string
 * @author Vaibhav Mojidra
 *
*/

public class IntegerKeyStringValueDataItem {
	private int key;
	private String value;
	/**
	 * This will create the class IntegerKeyStringValueDataItem's object with default value key as -1 and value as "".
	 * @see #setKey(int)
	 * @see #setValue(String)
	 */
	public IntegerKeyStringValueDataItem() {
		key=-1;
		value="";
	}
	/**
	 * This will create the class IntegerKeyStringValueDataItem's object with specified key and value.
	 * @param key It will assign an integer value to key.
	 * @param value It will assign a string value to value.
	 * @see #setKey(int)
	 * @see #setValue(String)
	 */
	public IntegerKeyStringValueDataItem(int key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * This function will return value of key.
	 * @return This returns value of key.
	 */
	public int getKey() {
		return key;
	}
	/**
	 * This function will set value to key.
	 * @param key It takes integer as argument and sets the key with same
	 */
	public void setKey(int key) {
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
