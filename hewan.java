package belajar;

// //polimorfisme
// package belajar;

// class hewan {
//     void suara(){
//     System.out.println("suara hewan biasa");
//     }

//     }

// class kucing extends hewan {
//         void suara(){
//             System.out.println("meong");
//         }
// }
// class anjing extends hewan {
//         void suara(){
//             System.out.println("guk guk");
//         }
// }

// class demo{
//     public static void main(String[] args) {
        
//         hewan h = new hewan();
//         h.suara();
    
//         hewan k = new kucing();
//         k.suara();

//         hewan a = new anjing();
//         a.suara();
//     }
// }

class hewan{
    private int tinggi;
    // private String warna;

    public int get_tinggi(){
        return tinggi;
    }
    void set_tinggi(int tinggi){
        this.tinggi = tinggi;
    }
}

class demo{
    public static void main(String[] args) {
        hewan h = new hewan();

        h.set_tinggi(120);
        System.out.println(h.get_tinggi());
    }
}