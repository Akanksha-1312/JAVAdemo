package longest_Increasing_Subsequence;

public class LongestIncreasingSubsequence {

		static int longest(int arr[], int n)
		{
			int lis[] = new int[n];
			int i, j, max = 0;
			for (i = 0; i < n; i++)
				lis[i] = 1;
			for (i = 1; i < n; i++)
				for (j = 0; j < i; j++)
					if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
						lis[i] = lis[j] + 1;

			for (i = 0; i < n; i++)
				if (max < lis[i])
					max = lis[i];

			return max;
		}

		public static void main(String args[])
		{
			int arr[] = { 16,34,45,67,43,63,22,56,69,87 };
			int n = arr.length;
			System.out.println("Length of longest increasing sequence is " + longest(arr, n) + "\n");
		}
	}

