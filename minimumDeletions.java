class minimumDeletions{
	static int lps(String str){
		int n = str.length();
		int L[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			L[i][i] = 1;
		for (int cl = 2; cl <= n; cl++){
			for (int i = 0; i < n - cl + 1; i++){
				int j = i + cl - 1;
				if (str.charAt(i) == str.charAt(j) && cl == 2)
					L[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = Integer.max(L[i][j - 1],L[i + 1][j]);
			}
		}
		return L[0][n - 1];
	}
	static int minimumNumberOfDeletions(String str){
		int n = str.length();
		int len = lps(str);
		return (n - len);
	}
	public static void main(String[] args){
		String str = "geeksforgeeks";
		System.out.println("Minimum number " + "of deletions = "+
			minimumNumberOfDeletions(str));
	}
}