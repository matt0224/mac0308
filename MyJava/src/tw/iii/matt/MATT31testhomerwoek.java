package tw.iii.matt;

public class MATT31testhomerwoek {

	public static void main(String[] args) {
		  for(int i=2;i<=100;i++){
			  boolean isPrime = true ;
				  for(int y=2;y<i;y++){
					  if(i%y==0) {
						  isPrime=false;
					  break;
				  }
		  }
				  if(isPrime){
					  System.out.print(i+"*"+"\t");
		  }else System.out.print(i+"\t");
		  if(i%10==0){
			 System.out.println();
		 }
	  }

}
}