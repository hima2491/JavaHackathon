package Assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Q33CircusProgram {
	  static class Person implements Comparable<Person>{
		 int height;
		 int weight;
		  public Person(int height,int weight) {
			  this.height=height;
			  this.weight=weight;
		  }
		  public int compareTo(Person other) {
			  if(this.height!=other.height)
				  return Integer.compare(this.height,other.height);
			  else
				  return Integer.compare(this.weight,other.weight);		
			  }
		 public String toString() {
			 return "(" + height + " ," + weight + ")";
		 }
	  }
	  public static int LongestTowerLength(List<Person> people) {
		  Collections.sort(people);
		  int n=people.size();
		  int[] dp=new int[n];
		  Arrays.fill(dp,1);
		  for(int i=1;i<n;i++) {
			  for(int j=0;j<i;j++) {
			  if(people.get(i).weight>people.get(j).weight) {
					  dp[i]=Math.max(dp[i],dp[j]+1);
				  }
			  }
		  }
		  int maxLength=Arrays.stream(dp).max().orElse(0);
		  return maxLength;
	  }
	public static void main(String[] args) {
	List<Person> people=new ArrayList<>();
	people.add(new Person(65,100));
	people.add(new Person(70,150));
	people.add(new Person(56,90));
	people.add(new Person(75,190));
	people.add(new Person(60,95));
	people.add(new Person(68,110));
	//people.add(new Person(65,200));	
	int maxLength = LongestTowerLength(people);
	System.out.println("the Longest Tower is Length " + maxLength + " and includes from Top to Bottom:");
	for (Person person : people) {
		System.out.println(person);
	}
	}	
}
