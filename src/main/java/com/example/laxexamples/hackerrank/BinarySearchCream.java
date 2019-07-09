import java.util.Arrays;
import java.util.Scanner;


public class BinarySearchCream {

	static class IceCream implements Comparable{
		public int cost;
		public int id;

		public IceCream(int cost, int index) {
			this.cost = cost;
			this.id = index;
		}
		
		@Override
		public int compareTo(Object o) {
			IceCream iceCream = (IceCream) o;
	        
			return this.cost - iceCream.cost;
		}

		@Override
		public boolean equals(Object o){
			IceCream iceCream = (IceCream) o;
	        
			return iceCream.cost == this.cost;
		}
	        
	}
	
    public IceCream[] menu;
    public int n;
    public int money;
    
    public BinarySearchCream(IceCream[] menu, int n, int money) {
        this.menu = menu;
        Arrays.sort(this.menu);
        this.n = n;
        this.money = money;
    }
    
    public int binarySearch(int min, int max, int search) {
        
        int middle = (min + max) >> 1;
        
        while(min <= max) {
            if( menu[middle].cost == search ) {
                if(max - min <= 1 ) {
                    return menu[middle].id;
                }
                max = middle;
            }
            else {
                if ( menu[middle].cost < search ) {
                    min = middle + 1;  
                }
                else {
                    max = middle - 1;
                }
            }
            
            middle = (min + max) >> 1;
            
        } 
        return -1;
    }
    
    public void solve() {
        for(int i = 0; i < n - 1 ; i++) {
            int search = money - menu[i].cost;
            if(search >= menu[i].cost) {    
                int index = binarySearch(i + 1, n - 1, search);
                if( index != -1 ) {
                    System.out.println( Math.min(menu[i].id, index) + " " + Math.max(menu[i].id, index));
                    break;
                }
               
            }
        }   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int t = scanner.nextInt();
        while(t-- > 0) {       
            int money = scanner.nextInt();
            int n = scanner.nextInt(); 
            IceCream[] menu = new IceCream[n];
            for (int i = 0; i < n; i++) {
                menu[i] = new IceCream(scanner.nextInt(), i + 1);
            }
            
            BinarySearchCream solution = new BinarySearchCream(menu, n, money);
            solution.solve();
        }   
        scanner.close();
    }   

}
