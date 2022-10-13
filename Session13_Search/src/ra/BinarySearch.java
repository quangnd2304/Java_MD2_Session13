package ra;

public class BinarySearch {
    public static void main(String[] args) {
        //Tim kiem nhi phan ap dung cho nhung mang da duoc sap xep
        int[] arrInt = {2,5,7,8,9,10};
        //Tim kiem nhi phan phan tu co gia tri la 9
        int key = 6;
        int low = 0;
        int high = arrInt.length-1;
        while (low!=high){
            int mid = (low+high)/2;
            if (arrInt[mid]==key){
                System.out.printf("Phan tu can tim kiem co chi so la: %d",mid);
                break;
            }else if(key<arrInt[mid]){
                //Tim o mang ben trai
                high = mid-1;
            }else{
                //Tim o mang ben phai
                low = mid+1;
            }
        }
        if (low==high) {
            if (key == arrInt[low]) {
                System.out.printf("Phan tu can tim kiem co chi so la: %d\n", low);
            } else {
                System.out.println("Khong tim thay phan tu co gia tri nhu gia tri tim kiem");
            }
        }
    }
}
