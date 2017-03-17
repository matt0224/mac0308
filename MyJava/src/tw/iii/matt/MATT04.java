package tw.iii.matt;

public class MATT04 {

	public static void main(String[] args) {
		int  score = (int)(Math.random()*101); //因為是double 100會變成 0-99 ;101則是0-100.(小數點) 用int強制轉型
				System.out.println(score);  //顯示亂數成績
				if(score>=60){
					System.out.println("b");
				}
				else if(score>=80){
					System.out.println("a");  
												/* 1.特例上面的條件會先執行例如此案例亂數是90分 但答案先顯示b
												 * 2.else if(score>=80) 一定要放條件在括號裡面（）
												 * 3.else 是剩下的是
												 */ 
				}
				else {
					System.out.println("c");
				}
         
	}

}
