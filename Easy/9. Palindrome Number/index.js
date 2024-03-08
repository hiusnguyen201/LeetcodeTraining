/**
 * @param {number} x
 * @return {boolean}
 */

// ------------ My solution ---------- //
// Solution 1:
var isPalindrome1 = function (x) {
  if (x < 0) return false;

  x += "";
  const length = x.length;

  for (let i = 0; i < length / 2; i++) {
    if (i != length - i - 1) {
      if (x[i] != x[length - i - 1]) {
        return false;
      }
    } else {
      return true;
    }
  }
  return true;
};

console.log(isPalindrome1(121));
console.log(isPalindrome1(-121));
console.log(isPalindrome1(10));
console.log(isPalindrome1(1));
console.log(isPalindrome1(21013 - 1));

/*
    Result:
    - Runtime: 120 - 150 ms;
    - Memory: 56 - 58 MB;
*/

console.log("\n----------------------------------\n");

// // Solution 2:
var isPalindrome2 = function (x) {
  if (x < 0) return false;

  let reversed = 0;
  let temp = x;

  while (temp != 0) {
    const digit = temp % 10;
    reversed = reversed * 10 + digit;
    temp = ~~(temp / 10); // ~~ : Bitwise Not operator -> Math.floor()
  }

  return reversed == x;
};

console.log(isPalindrome2(121));
console.log(isPalindrome2(-121));
console.log(isPalindrome2(10));
console.log(isPalindrome2(1));
console.log(isPalindrome2(21013 - 1));

/*
    Result:
    - Runtime: 120 - 130 ms;
    - Memory: 56 - 58 MB;
*/
