public class receipt {

        public static void main(String[] args) {


            CandleShop mahogany = new CandleShop("Mahogany Teakwood", 3, 7.50);
            mahogany.printReceipt();


            CandleShop linen = new CandleShop("Clean Linen", 1, 10.50);
            linen.printReceipt();


            CandleShop cupcake = new CandleShop("Birthday", 5, 8.75);
            cupcake.printReceipt();
        }

    }
