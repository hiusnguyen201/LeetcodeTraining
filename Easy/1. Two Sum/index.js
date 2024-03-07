/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// ------------ My solution ---------- //
// 1: Common
var twoSum1 = function (nums, target) {
  const length = nums.length;
  for (let i = 0; i < length - 1; i++) {
    for (let j = i + 1; j < length; j++) {
      if (nums[i] + nums[j] == target) {
        return [i, j];
      }
    }
  }
};

// console.log(twoSum1([2, 7, 11, 15], 9));
// console.log(twoSum1([3, 2, 4], 6));
// console.log(twoSum1([3, 2, 3], 6));
// console.log(twoSum1([2, 5, 5, 10], 10));

/*
    Result: 
    - Runtime: 111ms;
    - Memory: 49.3 MB
*/

// 2: Use Hash Table
var twoSum2 = function (nums, target) {
  const map = new Map();
  const length = nums.length;

  for (let i = 0; i < length; i++) {
    map.set(nums[i], i);
  }

  for (let i = 0; i < length - 1; i++) {
    let x = target - nums[i];
    if (map.get(x) && map.get(x) != i) {
      return [i, map.get(x)];
    }
  }
};

console.log(twoSum2([2, 7, 11, 15], 9));
console.log(twoSum2([3, 2, 4], 6));
console.log(twoSum2([3, 2, 3], 6));
console.log(twoSum2([2, 5, 5, 10], 10));

/*
    Result:
    - Runtime: 63 ms;
    - Memory: 53 MB
*/
