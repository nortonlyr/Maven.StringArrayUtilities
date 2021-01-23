package com.zipcodewilmington;

import com.sun.codemodel.internal.JArray;
import com.sun.tools.internal.xjc.model.CArrayInfo;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * edited by leon on 1/17/21.
 */
public class StringArrayUtils {
	/**
	 * @param array array of String objects
	 * @return first element of specified array
	 */ // TODO
	public static String getFirstElement(String[] array) {
		return array[0];
	}

	/**
	 * @param array array of String objects
	 * @return second element in specified array
	 */
	public static String getSecondElement(String[] array) {
		return array[1];
	}

	/**
	 * @param array array of String objects
	 * @return last element in specified array
	 */ // TODO
	public static String getLastElement(String[] array) {
		return array[array.length - 1];
	}

	/**
	 * @param array array of String objects
	 * @return second to last element in specified array
	 */ // TODO
	public static String getSecondToLastElement(String[] array) {
		return array[array.length - 2];
	}

	/**
	 * @param array array of String objects
	 * @param value value to check array for
	 * @return true if the array contains the specified `value`
	 */ // TODO
	public static boolean contains(String[] array, String value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param array of String objects
	 * @return an array with identical contents in reverse order
	 */ // TODO
	public static String[] reverse(String[] array) {
		String[] newArr = new String[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			newArr[array.length - 1 - i] = array[i];
		}
		return newArr;
	}

	/**
	 * @param array array of String objects
	 * @return true if the order of the array is the same backwards and forwards
	 */ // TODO
	public static boolean isPalindromic(String[] array) {
		String[] newArr = reverse(array);
		boolean isPali = false;
		for (int i = 0; i < array.length; i++) {
			if (newArr[i].equals(array[i])) {
				isPali = true;
			} else {
				isPali = false;
				break;
			}
		}
		return isPali;
	}

	/**
	 * @param array array of String objects
	 * @return true if each letter in the alphabet has been used in the array
	 */ // TODO
	public static boolean isPangramic(String[] array) {
		String newStr = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) != ' ') {
					newStr += Character.toLowerCase(array[i].charAt(j));
				}
			}
		}

		int counter = 0;
		for (int i = 0; i < alphabet.length(); i++) {
			for (int j = 0; j < newStr.length(); j++) {
				if (alphabet.charAt(i) == newStr.charAt(j)) {
					counter++;
					break;
				}
			}
		}
		return counter == 26;
	}

	/**
	 * @param array array of String objects
	 * @param value value to check array for
	 * @return number of occurrences the specified `value` has occurred
	 */ // TODO
	public static int getNumberOfOccurrences(String[] array, String value) {
		int num = 0;
		for (String i : array) {
			if (i.equals(value)) {
				num++;
			}
		}
		return num;
	}

	/**
	 * @param array         array of String objects
	 * @param valueToRemove value to remove from array
	 * @return array with identical contents excluding values of `value`
	 */ // TODO
	public static String[] removeValue(String[] array, String valueToRemove) {
		String[] newArr = new String[array.length - 1];
		int index = 0;
		for (String s : array) {
			if (!s.equals(valueToRemove)) {
				newArr[index] = s;
				index++;
			}
		}
		return newArr;
	}

	/**
	 * @param array array of chars
	 * @return array of Strings with consecutive duplicates removes
	 */ // TODO
	public static String[] removeConsecutiveDuplicates(String[] array) {
		int counter = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (!array[i].equals(array[i + 1])) {
				counter++;
			}
		}
		String[] newArr = new String[counter + 1];
		counter = 0;

		for (int i = 0; i < array.length - 1; i++) {

			if (!array[i].equals(array[i + 1])) {
				newArr[counter] = array[i];
				counter++;
			} else if (array[i].equals(array[array.length - 1])) {
				newArr[counter] = array[i];
			}
		}
		newArr[newArr.length - 1] = array[array.length - 1];
		return newArr;
	}

	/**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        
    	int counter = 0;
    	for (int i = 0; i < array.length -1; i++) {
    		if (!array[i].equals(array[i+1])) {
    			counter++;
    		}
    	}
    	
    	String[] newArr = new String[counter +1];
    	String test = "";
    	int y = 0;
    	for (int i = 0; i < array.length - 1; i++) {
    		
    		if (array[i].equals(array[i + 1])) {
    			test += array[i];
    			
    		} else if (!array[i].equals(array[i + 1])) {
    			test += array[i];
    			newArr[y] = test;
    			newArr[y] = test;
    			y++;
    			test = "";
    		}
    	}
    	newArr[y] = test + array[array.length -1];
        return newArr;
    }

}
