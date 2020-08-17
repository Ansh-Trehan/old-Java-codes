class Gen<T> {
	T ob; 
	Gen(T o){ 
	   ob = o;
         	}
	T getob(){ 
           	   return ob; 
         	}
	void showType(){ 
	   System.out.println("Type of T is " +   ob.getClass().getName());
	}
}
class InferenceDiamondDemo {
	public static void main(String args[]) {
		Gen<Integer> iOb;
		iOb = new Gen<>(88);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("value: " + v);
		Gen<String> strOb = new Gen<>("Testing Generic");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);
 	} 
}
