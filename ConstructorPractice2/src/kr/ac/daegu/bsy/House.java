package kr.ac.daegu.bsy;

class House {
    int price;
    String dong;
    int size;
    String kind;

    public House(){
        //System.out.println(this보다 앞에서 실행");
        this(100,32,"상계동","아파트");
    }
    public House(int price){
        this(price,32,"상계동","아파트");
    }
    public House(int price,int size){
        this(price,size,"상계동","아파트");
    }
    public House(int price,int size,String dong){
        this(price,size,dong,"아파트");
    }

    public House(int price, int size, String dong, String kind) {
        this.price = price;
        this.size = size;
        this.dong = dong;
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "House " +
                "price=" + price +
                ", dong='" + dong + '\'' +
                ", size=" + size +
                ", kind='" + kind + '\''
                ;
    }
}

