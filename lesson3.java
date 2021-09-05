
public class Main{

	public static void main(String[] massiv){

		int num1 = 6;
		int num2 = 4;
		
		if(num1>num2)
		    System.out.println("Первое число больше второго");
		 //cкобки можно не ставить, если у условия одна команда
		 
		 if(num1==5){
		     num1++;
		     System.out.println("if");
		 }
		 
		 else if(num2==6)
		    System.out.println("else if");
		    
		  else{
		      num2++;
		      num1++;
		      System.out.println("else");
		  }
		  
		int num = 8;
		
        switch(num){
                     
            case 1: // если num=1
                System.out.println("число равно 1");
                break; //прерывание процесса
            case 2:
            case 3:
            case 8: 
            // если num=8 или 3 или 2
                System.out.println("число равно 8");
                num++;
                break;
            case 9: // если num=9
                System.out.println("число равно 9");
                break;
            default: // остальыне вариации
                System.out.println("число не равно 1, 8, 9");
                
            // выполнится case 8
            // но если убрать у него break, выполнится и case 9
            // а если и у него убрать break, выполнится и default
            // обратите внимание, что несколько case можно объединить, как с 2, 3 и 8
        }

		int x=3;
        int y=2;
        int z = x<y? (x+y) : (x-y); //if x<y: (x+y), иначе (x-y)
        System.out.println(z); // 1 (x-y=3-2)
        
	}
	
}	
