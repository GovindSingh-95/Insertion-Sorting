# Insertion-Sorting
<h2>What is it</h2>
<p>
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time by making comparisons.It,is a stable sorting algorithm.<br>
<br>It works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.<br>
<br>The algorithm maintains two groups: the sorted cards and the unsorted cards.With,element at 0 index to be part of sorted Array<br>
<br>Similar to sorting playing cards in your hands, you pick a card from the unsorted group and insert it in the right place in the sorted group.<br>
<br>Time complexity in worst and average case is O(n^2),while in best case it is O(n)<br>
</p>
<h2>Algorithm</h2>
<p>
<br>Start with the second element of the array (since the first element is assumed to be sorted).<br>
<br>Compare the current element with the one before it. If the current element is smaller, swap them.<br>
<br>Move to the next element and repeat the comparison and swapping process until the entire array is sorted.<br>
<br>For example, consider the array: {23, 1, 10, 5, 2}<br>
<br>First Pass: Current element is 23. The sorted part until the 0th index is [23].<br>
<br>Second Pass: Compare 1 with 23. Since 1 is smaller, insert it before 23. The sorted part until the 1st index is [1, 23].<br>
<br>Third Pass: Compare 10 with 1 and 23. Since 10 is greater than 1 and smaller than 23, insert 10 between 1 and 23.<br>
<br>The sorted part until the 2nd index is [1, 10, 23].<br>
<br>Continue this process for the remaining elements.<br>
<br>As number of passes are 4 at max for an Array of 5 elements.Thus outer loop round will go from 0 to n-1.<br>
<br>Here as we are comparing the new element entering from unsorted to sorted Array and swapping them if arr[i]>arr[i+1]<br>
<br>So,we need to use a loop int i,from round-1 to 0 such that if arr[i]>arr[i+1] is only there then only swapping can be done.We can do it using both for and while loops.<br>
</p>

