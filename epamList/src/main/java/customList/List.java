package customList;
import java.util.Arrays;


public class List<T> {
private int size=0;
private final int defaultSize=10;
private Object list[];
public List()
{
	list=new Object[defaultSize];
}
public void add(T t)
{
	if(size==list.length)
	{
		increaseCapacity();
	}
	list[size]=t;
		size++;
}
public void remove(T t)
{
	int i;
	for(i=0;i<size;i++)
	{
		if(t==list[i])
			//Object remove=list[i];
			break;
		if(i==size-1)
		{
			System.out.println("element" +t+ "is not present in the list");
		}
	}
	int numElts = list.length - ( i + 1 ) ;
    System.arraycopy( list, i + 1, list, i, numElts ) ;
    size--;
}
public void print()
{
	 StringBuilder sb = new StringBuilder();
     sb.append('[');
     for(int i = 0; i < size ;i++) {
         sb.append(list[i].toString());
         if(i<size-1){
             sb.append(",");
         }
     }
     sb.append(']');
     System.out.println(sb.toString());
	
	
}
public void increaseCapacity()
{
	int newSize=size*2;
	list = Arrays.copyOf(list, newSize);
}
public int size()
{
	return size;
}
public T get(int i)
{
	if(i>=size || i< 0)
	      System.out.println("list out of bound");

	return (T) list[i];
}
}
