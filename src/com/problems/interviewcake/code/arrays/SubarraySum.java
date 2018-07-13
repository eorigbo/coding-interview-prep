package com.problems.interviewcake.code.arrays;

public class SubarraySum
{
    /* Returns true if the there is a subarray of arr[] with sum equal to
    'sum' otherwise returns false. Also, prints the result */
    public static boolean subArraySum(int arr[], int sum)
    {
        int curr_sum = arr[0], start = 0, i, arrayLength = arr.length;

        // Pick a starting point
        for (i = 1; i <= arrayLength; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum)
            {
                int subarrayLastIndex = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + subarrayLastIndex);
                return true;
            }

            // Add this element to curr_sum
            if (i < arrayLength)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return false;
    }
}

// This code has been contributed by Mayank Jaiswal(mayank_24)

