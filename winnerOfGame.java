class winnerOfGame{
    static int maximumStonesUtil(int[] arr, int n,int i){
        if (i >= n)
            return 0;
        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans, arr[i] - maximumStonesUtil(arr, n, i + 1));
        if (i + 1 < n)
            ans = Math.max(ans, arr[i] + arr[i + 1] - maximumStonesUtil(arr, n, i + 2));
        if (i + 2 < n)
            ans = Math.max(ans,arr[i] + arr[i + 1] + arr[i + 2] - maximumStonesUtil(arr, n, i + 3));
        return ans;
    }
    static String maximumStones(int[] arr, int n){
        int res = maximumStonesUtil(arr, n, 0);
        if (res > 0)
            return "Player1";
        else if (res < 0)
            return "Player2";
        else
            return "Tie";
    }
    public static void main(String[] args){
        int arr[] = { 1, 2, 3, 7 };
        int n = arr.length;
        System.out.println(maximumStones(arr, n));
    }
    }