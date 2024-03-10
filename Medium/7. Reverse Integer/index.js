/**
 * @param {number} x
 * @return {number}
 */

// ------------ My solution ---------- //
// 1: Common
var reverse = function (x) {
  if (!x) return 0;

  let result = 0;
  while (x != 0) {
    result = result * 10 + (x % 10);
    x = ~~(x / 10);
  }

  if (result >= Math.pow(2, 31) - 1 || result <= Math.pow(-2, 31)) return 0;

  return result;
};

console.log(reverse(123));
console.log(reverse(-123));
console.log(reverse(1534236469));

/*
    Result:
    - Runtime: 69 - 79 ms;
    - Memory: 53.1 - 53.3 MB
*/
