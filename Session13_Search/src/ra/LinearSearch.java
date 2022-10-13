package ra;

public class LinearSearch {
    public static void main(String[] args) {
        //Tim kiem tuyen tinh ap dung cho mang chua duoc sap xep
        int[] arrInt = {3,7,1,4,9,2};
        //Tim kiem phan tu co gia tri la 9 - key = 9
        int key = 5;
        //-B1. Duyet tung phan tu cua mang
        boolean existElement = false;
        for (int i = 0; i < arrInt.length; i++) {
            //-B2. So sanh gia tri phan tu voi key
            if (arrInt[i]==key){
                System.out.printf("Phan tu co chi so %d la phan tu can tim kiem\n",i);
                existElement = true;
            }
        }
        if (!existElement){
            System.out.println("Khong ton tai phan tu nao co gia tri nhu tim kiem");
        }
    }
}
