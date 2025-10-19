import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
    String no, item;
	int price,qty,subtotal;
	
	public ItemList (String no,String item,int price,int qty){
	    this.no = no;
        this.item = item;
	    this.price = price;
	    this.qty = qty;
	    this.subtotal = price * qty;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList <ItemList> itemList = new ArrayList<ItemList>();
		itemList.add(new ItemList("01", "Bags", 100000,2));
			itemList.add(new ItemList ("02", "Hat", 20000,2));
			String jawab;
			do{
				System.out.print("No Barang: ");
				String no=input.nextLine();

				System.out.print("Nama Barang: ");
				String item=input.nextLine();

				System.out.print("Harga Barang: ");
				int price=input.nextInt();

				System.out.print("Jumlah Barang: ");
				int qty=input.nextInt();
				
			itemList.add(new ItemList (no,item,price,qty));
			System.out.print("Apakah ingin menambah barang?(iya/tidak): ");
			jawab=input.nextLine();
            }while (jawab.equalsIgnoreCase("iya"));

			System.out.println("N0\tItem\tPrice\tQty\t\tSubtotal");
			System.out.println("---------------------------------------");
			int total=0;
			for (ItemList x:itemList){
			    System.out.println(x.no + "\t" + x.item + "\t" + x.price + "\t" + x.qty + "\t" + x.subtotal);
				total+=x.subtotal;
		
			    }
		System.out.println("---------------------------------------");
		System.out.println("Total\t\t\t\t" + total);
		input.close();
		
	
}
}
