import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Введите id товара: ");
        int id = scanner.nextInt();
        System.out.println("Введите бренд товара: ");
        String brand = scanner.next();
        System.out.println("Введите название товара: ");
        String name = scanner.next();
        System.out.println("Введите расцветку товара: ");
        String coloring = scanner.next();
        System.out.println("Введите стоимость товара: ");
        int price = scanner.nextInt();
        System.out.println("Введите диагональ экрана: ");
        int screenDiagonal = scanner.nextInt();
        System.out.println("Введите разрешение экрана (например: 720 480): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Monitor a = new Monitor(id, brand, name, coloring, price, x, y, screenDiagonal);
        Monitor b = new Monitor(id, brand, name, coloring, price - 1, x, y, screenDiagonal);
        int c;
        c = b.PriceDifference(a.getprice());
        
        b.changeprice(); 
        b.changeprice(); 
        c = b.PriceDifference(a.getprice());
        
        
        int number;
        Product.setquanity(100);
        
        number = Product.countofproduct();
        
        Monitor[][] arr = new Monitor[3][3];
        for (int i = 0; i < 3; i++)for (int j = 0; j < 3; j++){arr[i][j] = new Monitor(id, brand, name, coloring, price, x, y, screenDiagonal);}
        
        for (int i = 0; i < 3; i++)for (int j = 0; j < 2; j++)arr[i][j].PriceDifference(arr[i][j+1].getprice());
                
        scanner.close();
    }
}
