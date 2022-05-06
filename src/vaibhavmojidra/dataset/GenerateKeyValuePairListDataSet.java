package vaibhavmojidra.dataset;

import java.util.ArrayList;

import vaibhavmojidra.dataitem.IntegerKeyIntegerValueDataItem;
import vaibhavmojidra.dataitem.IntegerKeyStringValueDataItem;
import vaibhavmojidra.dataitem.StringKeyIntegerValueDataItem;
import vaibhavmojidra.dataitem.StringKeyStringValueDataItem;

/**
 * @author Vaibhav Mojidra
 *
*/
public class GenerateKeyValuePairListDataSet {

	/**
	 * This function returns an list of random key-value pair list where key and value both are integers.
	 * @param lengthOfDataSet It should be an integer value that determines the number of random key-value pair you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @return This returns an list of random key-value pair where key and value both are integers.
	 */
	public ArrayList<IntegerKeyIntegerValueDataItem> generateIntegerKeyIntegerValueDataItemList(int lengthOfDataSet,boolean printTheDataSet){
		ArrayList<IntegerKeyIntegerValueDataItem> arrayList=new ArrayList<>();
		ArrayList<Integer> keys=new GenerateSingleValueListDataSet().generateIntegerSingleValueList(lengthOfDataSet,false,false);
		ArrayList<Integer> values=new GenerateSingleValueListDataSet().generateIntegerSingleValueList(lengthOfDataSet,false,false);

		for(int i=0;i<lengthOfDataSet;i++) {
			int key=keys.get(i);
			int value=values.get(i);
			arrayList.add(new IntegerKeyIntegerValueDataItem(key,value));
			if(printTheDataSet) {System.out.println("("+key+","+value+")");}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random key-value pair list where key and value both are integers.
	 * @return This returns an list of 10 random key-value pair where key and value both are integers.
	 */
	public ArrayList<IntegerKeyIntegerValueDataItem> generateIntegerKeyIntegerValueDataItemList(){
		return generateIntegerKeyIntegerValueDataItemList(10,true);
	}

	/**
	 * This function returns an list of random key-value pair list where key is an integer and value is a string.
	 * @param lengthOfDataSet It should be an integer value that determines the number of random key-value pair you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @return This returns an list of random key-value pair where key is an integer and value is a string.
	 */
	public ArrayList<IntegerKeyStringValueDataItem> generateIntegerKeyStringValueDataItemList(int lengthOfDataSet,boolean printTheDataSet){
		ArrayList<IntegerKeyStringValueDataItem> arrayList=new ArrayList<>();

		ArrayList<Integer> keys=new GenerateSingleValueListDataSet().generateIntegerSingleValueList(lengthOfDataSet,false,false);
		ArrayList<String> values=new GenerateSingleValueListDataSet().generateStringSingleValueList(lengthOfDataSet,false,false,false);

		for(int i=0;i<lengthOfDataSet;i++) {
			int key=keys.get(i);
			String value=values.get(i);
			arrayList.add(new IntegerKeyStringValueDataItem(key,value));
			if(printTheDataSet) {System.out.println("("+key+",\""+value+"\")");}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random key-value pair list where key is an integer and value is a string.
	 * @return This returns an list of 10 random key-value pair where key is an integer and value is a string.
	 */
	public ArrayList<IntegerKeyStringValueDataItem> generateIntegerKeyStringValueDataItemList(){
		return generateIntegerKeyStringValueDataItemList(10,true);
	}


	/**
	 * This function returns an list of random key-value pair list where key and value both are strings.
	 * @param lengthOfDataSet It should be an integer value that determines the number of random key-value pair you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @return This returns an list of random key-value pair where key and value both are strings.
	 */
	public ArrayList<StringKeyStringValueDataItem> generateStringKeyStringValueDataItemList(int lengthOfDataSet,boolean printTheDataSet){
		ArrayList<StringKeyStringValueDataItem> arrayList=new ArrayList<>();
		ArrayList<String> keys=new GenerateSingleValueListDataSet().generateStringSingleValueList(lengthOfDataSet,false,false,false);
		ArrayList<String> values=new GenerateSingleValueListDataSet().generateStringSingleValueList(lengthOfDataSet,false,false,false);

		for(int i=0;i<lengthOfDataSet;i++) {
			String key=keys.get(i);
			String value=values.get(i);
			arrayList.add(new StringKeyStringValueDataItem(key,value));
			if(printTheDataSet) {System.out.println("(\""+key+"\",\""+value+"\")");}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random key-value pair list where key and value both are strings.
	 * @return This returns an list of 10 random key-value pair where key and value both are strings.
	 */
	public ArrayList<StringKeyStringValueDataItem> generateStringKeyStringValueDataItemList(){
		return generateStringKeyStringValueDataItemList(10,true);
	}


	/**
	 * This function returns an list of random key-value pair list where key is a string and value is an integer.
	 * @param lengthOfDataSet It should be an integer value that determines the number of random key-value pair you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @return This returns an list of random key-value pair where key is a string and value is an integer.
	 */
	public ArrayList<StringKeyIntegerValueDataItem> generateStringKeyIntegerValueDataItemList(int lengthOfDataSet,boolean printTheDataSet){
		ArrayList<StringKeyIntegerValueDataItem> arrayList=new ArrayList<>();
		ArrayList<String> keys=new GenerateSingleValueListDataSet().generateStringSingleValueList(lengthOfDataSet,false,false,false);
		ArrayList<Integer> values=new GenerateSingleValueListDataSet().generateIntegerSingleValueList(lengthOfDataSet,false,false);

		for(int i=0;i<lengthOfDataSet;i++) {
			String key=keys.get(i);
			int value=values.get(i);
			arrayList.add(new StringKeyIntegerValueDataItem(key,value));
			if(printTheDataSet) {System.out.println("(\""+key+"\","+value+")");}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random key-value pair list where key is a string and value is an integer.
	 * @return This returns an list of 10 random key-value pair where key key is a string and value is an integer.
	 */
	public ArrayList<StringKeyIntegerValueDataItem> generateStringKeyIntegerValueDataItemList(){
		return generateStringKeyIntegerValueDataItemList(10,true);
	}
}
