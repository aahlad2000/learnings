package august_26_2021;

public class TraverseMatrix {
    static void TraverseByRow(int arr[][]){
        System.out.println("Traversing by Rows");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(arr[i][j]++);
            }
        }
    }

    static void TraverseByCol(int arr[][]){
        System.out.println("Traversing by Cols");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println(arr[j][i]++);
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] ={{1,2,4},{3,5,6},{7,8,9}};
        int arr1[][] ={{9,4,0},{0,6,4},{6,7,9}};
        TraverseByRow(arr);
        TraverseByCol(arr1);
    }
}
