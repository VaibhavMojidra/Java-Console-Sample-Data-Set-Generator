package vaibhavmojidra.dataitem;

/**
 * IntegerKeyIntegerValueDataItem class is the model class to store key value pair item for data set where both data and key will be integers
 * @author Vaibhav Mojidra
 *
*/
public class IntegerKeyIntegerValueDataItem {
	private int key;
	private int value;
	/**
	 * This will create the class IntegerKeyIntegerValueDataItem's object with specified key and value.
	 * @see #setKey(int)
	 * @see #setValue(int)
	 * @param key It will assign an integer value to key.
	 * @param value It will assign an integer value to value.
	 */
	public IntegerKeyIntegerValueDataItem (int key, int value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * This will create the class IntegerKeyIntegerValueDataItem's object with default value key as -1 and value as -1.
	 * @see #setKey(int)
	 * @see #setValue(int)
	 */
	public IntegerKeyIntegerValueDataItem () {
		key = -1;
		value = -1;
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
