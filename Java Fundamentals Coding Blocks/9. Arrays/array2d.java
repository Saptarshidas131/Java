class array2d {
    public static void main(String argv[]) {
        int arr[][] = new int[3][3];
        init(arr);
        display(arr); 
    }

    public static void init(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i*2+j*3;
            }
        }
    }
    
    public static void display(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
