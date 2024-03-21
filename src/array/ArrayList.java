package array;

public class ArrayList {
    public static void main(String[] args) {
        int a[] = {1,2,7,12,15,5,-5,8,-2};
        int res[][] = new int[a.length][2];
        int cnt = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]+a[j] == 10){
                    res[cnt][0] = a[i];
                    res[cnt][1] = a[j];
                    cnt++;
                }
            }
        }

        for(int i=0; i<res.length;i++){
            for(int j=0; j<2; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
