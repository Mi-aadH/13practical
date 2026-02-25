import java.io.*;  
import java.text.DecimalFormat;
import java.util.*;

public class Prac13{

  static class Node{
    int key;
    String data;

    Node(int key, String data){
      this.key = key;
      this.data = data;
    }
  } 

public static Node [] loadfile (String filename) throws Exception{
  Array list = new ArrayList<>();
	Scanner file = new Scanner(new File(filename));

	while(file.hasNextLine()){
		String line = file.nextLine();
		String [] parts = line.split("",2);

		int key = Integer.parseInt(parts[0]);
            String data = parts[1];
            list.add(new Node(key, data));
	}
	file.close():

	Node[] arr = new Node[list.size()];
        return list.toArray(arr);
    }

    public static int linearSearch(Node[]arr,int key){
        for (int i = 0; i <arr.length; i++){
            if (arr[i].key == key)
                return i;
            }
		return -1;

        }	
		 public static int binarySearch (Node [] arr, int key){
         int low = 0;
         int high = arr.length -1;

         while(low<=high){
             int mid = (low + high)/2;

             if(arr[mid].key == key)
                 return mid;
             if(arr[mid].key < key)
                 low = mid + 1;
             else
                 high = mid -1;
         } return -1;

         public static void main(String []args) throws Exception{
             DecimalFormat fourD = new DecimalFormat("0.0000");

             Node [] data = loadFile("ulysses-1.numbered");

             Arrays.sort(data, Comparator.comparingInt(n -> n.key));

             int repetitions = 30;
             Random rand = new Random();

             double linTotal = 0;
			 double linTotalSq = 0;
             double binTotal = 0;
             double binTotalSq = 0;

             int [] lookupKeys = new int [repetitions];
             for (int i = 0; i <repetitions ; i++){
                 lookupKeys[i] = rand.nextInt(32654)+1;
             }




