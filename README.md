# Binary-Search
Binary search is an algorithm used to find the position of a target value within a sorted array. It works by repeatedly dividing in half the portion of the array that could contain the target value, until the target is found or the remaining portion of the array is empty.

## example of how binary search works:

Suppose we want to search for the number 7 in the following sorted array:

[1, 3, 4, 5, 7, 9, 11]

- We start by setting the left pointer to the beginning of the array (index 0) and the right pointer to the end of the array (index 6).
- We calculate the middle index by taking the average of the left and right pointers: middle = (0 + 6) / 2 = 3.
- We compare the value at the middle index (5) to the target value (7). Since 5 < 7, we discard the left half of the array and set the left pointer to the middle index + 1 (4).
- We calculate the new middle index: middle = (4 + 6) / 2 = 5.
- We compare the value at the middle index (9) to the target value (7). Since 9 > 7, we discard the right half of the array and set the right pointer to the middle index 1 (4).
- We calculate the new middle index: middle = (4 + 3) / 2 = 3.
- We compare the value at the middle index (5) to the target value (7). Since 5 < 7, we discard the left half of the array and set the left pointer to the middle index + 1 (4).
- We calculate the new middle index: middle = (4 + 3) / 2 = 3.
- We compare the value at the middle index (7) to the target value (7). Since they are equal, we have found the target value.

The position of the target value (7) in the array is 4.
## Time complexity 
Binary search is a very efficient algorithm for searching sorted arrays, with a worst-case time complexity of O(log n), where n is the size of the array. It is commonly used in many programming languages and applications.
