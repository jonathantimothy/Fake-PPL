import java.util.list

public class Produk (
    private String P_ID ;
    private String P_nama ;
    private String P_deskripsi ;
    private int P_stok ;
    private int P_harga ;

    public Produk(String P_ID, String P_nama, String P_deskripsi, int P_stok, int P_harga){
        this.P_ID = P_ID ;
        this.P_nama = P_nama ;
        this.P_deskripsi = P_deskripsi ;
        this.P_stok = P_stok ;
        this.P_harga = P_harga ;
    }
    public void display(){
    }

    public void addProduct(){
    }
    
    public void editProduct(String P_ID){
        this.P_ID = P_ID ;
    }
    
    public void deleteProduct(String P_ID){
        this.P_ID = P_ID ;
    }
)