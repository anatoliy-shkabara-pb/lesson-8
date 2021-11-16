package hw7;


public class Atelier {

    //------------------- Enum -----------------------
    enum Size {
        XXS("Детский размер", 32),
        XS( 34),
        S( 36),
        M( 38),
        L( 40);

        private String description;
        private int euroSize;

        Size(String description, int euroSize) {
            this.description = description;
            this.euroSize = euroSize;
        }

        Size(int euroSize) {
            this.description = "Взрослый размер";
            this.euroSize = euroSize;
        }

        public String getDescription() {
            return description;
        }

        public int getEuroSize() {
            return euroSize;
        }
    }

    //------------------------- Interfaces -----------------
    interface ManClothes {
        void dressMan();
    }

    interface WomenClothes {
        void dressWomen();
    }

    //------------------------ Classes ----------------------
    static abstract class Clothes {
        protected final Size size;
        protected final float price;
        protected final String color;

        public Clothes(Size size, float price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        public Size getSize() {
            return size;
        }

        public float getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getInfo() {
            return "размер " + size.name() + " " + size.getEuroSize() + " " + size.getDescription() +
                    " цвет " + color + " цена " + price;
        }
    }

    static class Tshirt extends Clothes implements ManClothes, WomenClothes {
        public Tshirt(Size size, float price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println("мужчина одевает футболку " + getInfo());
        }

        @Override
        public void dressWomen() {
            System.out.println("женщина одевает футболку " + getInfo());
        }
    }

    static class Pants extends Clothes implements ManClothes, WomenClothes {
        public Pants(Size size, float price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println("мужчина одевает штаны " + getInfo());
        }

        @Override
        public void dressWomen() {
            System.out.println("женщина одевает штаны " + getInfo());
        }
    }

    static class Skirt extends Clothes implements WomenClothes {
        public Skirt(Size size, float price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressWomen() {
            System.out.println("женщина одевает юбку " + getInfo());
        }
    }

    static class Tie extends Clothes implements ManClothes {
        public Tie(Size size, float price, String color) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println("мужчина одевает галстук " + getInfo());
        }
    }

    //-------------------------------- main ------------------------------

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new Tshirt(Size.S, 58.75f, "желтый"),
                new Pants(Size.M, 105.50f, "черный"),
                new Skirt(Size.M, 78.45f, "зеленый"),
                new Tie(Size.XXS, 15.20f, "красный")
        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);
    }

    //-------------------------------- methods ---------------------------

    private static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}
