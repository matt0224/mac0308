package tw.iii.matt;

public class MATT03 {

	public static void main(String[] args) {
		int  score = (int)(Math.random()*101); //因為是double 100會變成 0-99 ;101則是0-100.(小數點) 用int強制轉型
				System.out.println(score);  //顯示亂數成績
				if(score>=60){
					System.out.println("成績及格");
				}
				else {
					System.out.println("不合格");
				}
				
         
	}

}
