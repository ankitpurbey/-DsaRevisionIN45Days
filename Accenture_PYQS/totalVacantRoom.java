package Accenture_PYQS;
public class totalVacantRoom {
    public static int countVacantRoom(int arr[], int total_room, int reserved_r){
        int vacantRoom =0;
        return vacantRoom = total_room -reserved_r;
        
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8};
        int total_room =10;
        int reserved_r =8;
        System.out.println(countVacantRoom(arr, total_room, reserved_r));
    }
}
