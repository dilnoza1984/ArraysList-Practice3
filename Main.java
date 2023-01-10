import java.util.*;

class Main{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(-6);
    list.add(3);
    list.add(-8);
    list.add(-1);
    list.add(4);
    list.add(3);

   System.out.println(sumAppend(list)); // [4,3,4,3,14]


	}

  public static ArrayList<Integer> sumAppend(ArrayList<Integer> nums){
    ArrayList<Integer> result = new ArrayList<>();
    int sum = 0;
    for(int i = 0; i < nums.size(); i++){
      if(i%2 == 0)
      sum += nums.get(i);
      result.add(sum);
    }
    return result;

     
  }
  

	
}