package vaibhavmojidra.dataset;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Vaibhav Mojidra
 *
*/
public class GenerateSingleValueListDataSet {

	private Random random;

	private int getRandomInteger(int limit) {
		return random.nextInt(limit*5);
	}

	private String getRandomString() {
		int leftLimit = 97;
	    int rightLimit = 122;
	    int targetStringLength = 5;

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	    	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    	      .limit(targetStringLength)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();

	    return generatedString;
	}

	/**
	 * This function returns an list of random integers
	 * @param lengthOfDataSet It should be an integer value that determines the number of random integers you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @param printTheDataSetInArrayFormat It should be a boolean value that determines whether you want print the list in an array format like [1,2,3,...].
	 * @return This returns an list of random numbers.
	 */
	public ArrayList<Integer> generateIntegerSingleValueList(int lengthOfDataSet, boolean printTheDataSet,boolean printTheDataSetInArrayFormat) {
		random= new Random();
		ArrayList<Integer> arrayList=new ArrayList<>();
		int count=0;
		while(count<lengthOfDataSet) {
			int randomNumber=getRandomInteger(lengthOfDataSet);
			if(!arrayList.contains(randomNumber)) {
				arrayList.add(randomNumber);
				count++;
			}
		}
		if(printTheDataSet) {
			if(printTheDataSetInArrayFormat) {
				StringBuilder sb=new StringBuilder("[");
				for(int a:arrayList) {
					sb.append(a+",");
				}
				sb.delete(sb.length()-1, sb.length());
				sb.append("]");
				System.out.println(sb);
			}else {
				for(int a:arrayList) {
					System.out.println(a);
				}
			}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random integers also it prints it in array format like [1,2,3,4,....]
	 * @return This returns an list of 10 random integers also it prints it in array format like [1,2,3,4,....]
	 */
	public ArrayList<Integer> generateIntegerSingleValueList(){
		return generateIntegerSingleValueList(10,true,true);
	}

	/**
	 * This function returns an list of random strings
	 * @param lengthOfDataSet It should be an integer value that determines the number of random strings you want to generate.
	 * @param printTheDataSet It should be a boolean value that determines whether you want print the list.
	 * @param printTheDataSetInArrayFormat It should be a boolean value that determines whether you want print the list in an array format like [a,assa,aaas,...] or ["a","assa","aaas",...].
	 * @param printWithQuotes It should be a boolean value that determines whether you want print the list with or without quotes, true for with quotes([aa,aaa,...]) and false for without quotes(["aa","aaa",...])
	 * @return This returns an list of random strings.
	 */
	public ArrayList<String> generateStringSingleValueList(int lengthOfDataSet, boolean printTheDataSet,boolean printTheDataSetInArrayFormat,boolean printWithQuotes){
		random= new Random();
		ArrayList<String> arrayList=new ArrayList<>();
		int count=0;
		while(count<lengthOfDataSet) {
			String randomString=getRandomString();
			if(!arrayList.contains(randomString)) {
				arrayList.add(randomString);
				count++;
			}
		}
		if(printTheDataSet) {
			if(printTheDataSetInArrayFormat) {
				StringBuilder sb=new StringBuilder("[");
				for(String a:arrayList) {
					if(printWithQuotes) {
						sb.append("\""+a+"\",");
					}else {
						sb.append(a+",");
					}
				}
				sb.delete(sb.length()-1, sb.length());
				sb.append("]");
				System.out.println(sb);
			}else {
				for(String a:arrayList) {
					if(printWithQuotes) {
						System.out.println("\""+a+"\"");
					}else {
						System.out.println(a);
					}
				}
			}
		}
		return arrayList;
	}

	/**
	 * This function returns an list of 10 random strings also it prints it in array format like ["fsdf","szdas","dsaas","dasds",....]
	 * @return This returns an list of 10 random strings also it prints it in array format like ["fsdf","szdas","dsaas","dasds",....]
	 */
	public ArrayList<String> generateStringSingleValueList(){
		return generateStringSingleValueList(10,true,true,true);
	}

}
