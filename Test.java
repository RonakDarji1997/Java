
public class Test {
	
	
	/*
	 * String : 
	 * 1) String is immutable means we cannot change value of a string, When we create an object
	 * of a string it will check in string constant pool if the same string is already existed, if 
	 * it is existed it will still return the same memory, After any operations being done on string ,
	 * it will always create a new object first and then process goes on.
	 * 2) String is a class and also a data type.
	 * 3) Look at the below program, look at the hash code before an operation and after operation made
	 * on string. They are different meaning it allocated different memory for new s1 which will be 
	 * different s1 then old one.
	 * 
	 * StringBuffer :
	 * 1) StringBuffer is a class, we can make a object of it and initialize it at the time of initialization,
	 * or after initialization. 
	 * 2) With StringBuffer, we can change the value of the string unlike string where we can't change the values.
	 * 3) Look at the below program, look at the hash code before an operation and after append operation made
	 * on the StringBuffer. They are same meaning it override the previous allocated memory with new string value.
	 * 4) It is good to know that StringBuffer is having synchronized methods which makes it thread safe.
	 * that means all the operations with StringBuffer will be executed one by one.
	 * 
	 * StringBulder :
	 * 1) StringBuilder is a class, we can make a object of it and initialize it at the time of initialization,
	 * or after initialization just like StringBuilder. 
	 * 2) With StringBuilder, we can change the value of the string unlike string where we can't change the values.
	 * 3) Look at the below program, look at the hash code before an operation and after append operation made
	 * on the StringBuilder. They are same meaning it override the previous allocated memory with new string value.
	 * 4) It is good to know that StringBuilder is having Unsynchronized methods which is not thread safe.
	 * 5) StringBuilder is faster then any other method because of unsynchronized methods and thread non safe.
	 **/

	public static String string(String s1) {
		s1 = s1 + "String";
		return s1;
	}
	
	public static StringBuffer stringBuffer(StringBuffer s1) {
		s1.append(" String Buffer");
		return s1;
	}
	
	public static StringBuilder stringBuilder(StringBuilder s1) {
		s1.append(" String Builder");
		return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hi ";
	    System.out.println("Hashcode before appending string : " + str.hashCode());
		System.out.println(string(str));
		System.out.println("Hashcode after appending string : " +string(str).hashCode());
		
		StringBuffer sb = new StringBuffer("Hi");
		System.out.println("Hashcode before appending stringBuffer : "+ sb.hashCode());
		System.out.println(stringBuffer(sb));
		System.out.println("Hashcode after appending stringBuffer : " +stringBuffer(sb).hashCode());
		
		StringBuilder sbl = new StringBuilder("Hi");
		System.out.println("Hashcode before appending stringBuilder : " + sbl.hashCode());
		System.out.println(stringBuilder(sbl));
		System.out.println("Hashcode after appending stringBuffer : " +stringBuilder(sbl).hashCode());
	
	}

}
