public class CandleShop {

        public String name;
        public int amount;

        public double price;


        public CandleShop(String name, int amount, double price) {
            this.name = name;
            this.amount = amount;
            this.price = price;
        }

        public void printReceipt() {
            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(name);
            System.out.println("Amount: " + amount);
            System.out.println("Price: $" + price);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }


