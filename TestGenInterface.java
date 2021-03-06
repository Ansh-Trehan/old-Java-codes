interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}
class MinimumMaximum<T extends Comparable<T>> implements MinMax<T>{
   T[] array;
   MinimumMaximum(T[] o){
	array=o;
    }
   public  T min(){
        T  min=array[0];
        for(int i=1;i<array.length;i++){
		if(array[i].compareTo(min)<0)
			min=array[i];
         }
        return min;
   }
   public T max(){
        T  max=array[0];
        for(int i=1;i<array.length;i++){
		if(array[i].compareTo(max)>0)
			max=array[i];
         }
        return max;
   }
}
class TestGenInterface{
     public static void main(String[] args){
        Integer i[]={7,2,3,4,5,12};
        MinimumMaximum<Integer> mmi=new MinimumMaximum<Integer>(i);
        System.out.println("Minimum in Integer array is"+mmi.min());
        System.out.println("Maximum in Integer array is"+mmi.max());
        Character c[]={'d','s','f','r','u','p','l'};
        MinimumMaximum<Character> mmc=new MinimumMaximum<Character>(c);
        System.out.println("Minimum in Character array is"+mmc.min());
        System.out.println("Maximum in Character array is"+mmc.max());        
    }
}





