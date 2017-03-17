package tw.iii.matt;

public class MATT0310 {

	public static void main(String[] args) {
		  for(int i=2;i<100;i++){
			  boolean isPrime = false ;
				  for(int y=2;y<i;y++){
					  if(i%y==0) {
						  isPrime=true;
					  break;
				  }
		  }
				  if(isPrime){
					  System.out.println(i+"");
		  }
				  
	  }

}
}