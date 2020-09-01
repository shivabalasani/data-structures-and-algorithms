package academy.learnprogramming.stacks;

import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {
	// should return true
	System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
	// should return true
	System.out.println(isPalindrome1("abccba"));
	// should return true
	System.out.println(isPalindrome2("I did did I"));
	// should return false
	System.out.println(isPalindrome3("hello".toCharArray()));
	// should return true
	System.out.println(isPalindrome4("dontnod"));
    }

    //Solution #0 More elegant than below
    public static boolean checkForPalindrome1(String string) {

	LinkedList<Character> stack = new LinkedList<Character>();
	LinkedList<Character> queue = new LinkedList<Character>();
	String lowerCase = string.toLowerCase();

	for (int i = 0; i < lowerCase.length(); i++) {
	    char c = lowerCase.charAt(i);
	    if (c >= 'a' && c <= 'z') {
		queue.addLast(c);
		stack.push(c);
	    }
	}

	while (!stack.isEmpty()) {
	    if (!stack.pop().equals(queue.removeFirst())) {
		return false;
	    }
	}

	return true;
    }

    
    // Solution #1
    public static boolean checkForPalindrome(String string) {

	LinkedList<Character> stack = new LinkedList<Character>();
	StringBuilder stringNoPunctuation = new StringBuilder(string.length());
	String lowerCase = string.toLowerCase();

	for (int i = 0; i < lowerCase.length(); i++) {
	    char c = lowerCase.charAt(i);
	    if (c >= 'a' && c <= 'z') {
		stringNoPunctuation.append(c);
		stack.push(c);
	    }
	}

	StringBuilder reversedString = new StringBuilder(stack.size());
	while (!stack.isEmpty()) {
	    reversedString.append(stack.pop());
	}

	return reversedString.toString().equals(stringNoPunctuation.toString());
    }

    // Solution #2
    public static boolean isPalindrome1(String str) {

	String reverse = new StringBuffer(str).reverse().toString();

	if (reverse.equals(str))
	    return true;

	return false;
    }

    // Solution #3
    public static boolean isPalindrome2(String str) {

	int start = 0;
	int end = str.length() - 1;
	int half = end / 2;

	for (int i = 0; i < half; i++, start++, end--) {
	    if (str.charAt(start) != str.charAt(end))
		return false;
	}

	return true;
    }

    // Solution #4
    public static boolean isPalindrome3(char[] word) {
	int start = 0;
	int end = word.length - 1;
	while (end > start) {
	    if (word[start] != word[end]) {
		return false;
	    }
	    ++start;
	    --end;
	}
	return true;
    }

    // Solution #5
    private static boolean isPalindrome4(String word) {
	if (word.length() < 2) {
	    return true;
	}
	char first = word.charAt(0);
	char last = word.charAt(word.length() - 1);
	if (first != last) {
	    return false;
	} else {
	    return isPalindrome4(word.substring(1, word.length() - 1));
	}
    }
}
