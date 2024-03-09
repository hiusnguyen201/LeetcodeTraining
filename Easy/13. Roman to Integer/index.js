/**
 * @param {string} s
 * @return {number}
 */

// My solution
var romanToInt = function (s) {
  const valueOfSymbol = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  const length = s.length;
  let result = 0;
  let minus = 0;
  for (let i = 0; i < length; i++) {
    if (!valueOfSymbol[s[i + 1]]) {
      result += valueOfSymbol[s[i]];
      continue;
    }

    if (valueOfSymbol[s[i]] >= valueOfSymbol[s[i + 1]]) {
      result += valueOfSymbol[s[i]];
    } else {
      if (
        (s[i] == "I" || s[i] == "X" || s[i] == "C") &&
        s[i] != s[i - 1] &&
        valueOfSymbol[s[i]] * 10 >= valueOfSymbol[s[i + 1]]
      ) {
        minus += valueOfSymbol[s[i]];
      } else {
        return false;
      }
    }
  }

  return result - minus;
};

/*
  Result:
  - Runtime: 107 - 132 ms
  - Memory: 55 - 55.9 MB
*/

console.log(romanToInt("LVIII"));
console.log(romanToInt("IXIX"));
console.log(romanToInt("IX"));
console.log(romanToInt("IV"));
console.log(romanToInt("IL"));
console.log(romanToInt("XXL"));

// Solution 2:
var romanToInt2 = function (s) {
  const valueOfSymbol = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  const length = s.length;
  let result = 0;
  for (let i = 0; i < length; i++) {
    if (i == length - 1) {
      result += valueOfSymbol[s[i]];
      break;
    }

    if (valueOfSymbol[s[i]] >= valueOfSymbol[s[i + 1]]) {
      result += valueOfSymbol[s[i]];
    } else {
      result += valueOfSymbol[s[i + 1]] - valueOfSymbol[s[i]];
      i++;
    }
  }

  return result;
};

console.log(romanToInt2("LVIII"));
console.log(romanToInt2("IXIX"));
console.log(romanToInt2("IX"));
console.log(romanToInt2("IV"));
console.log(romanToInt2("IL"));
console.log(romanToInt2("XXL"));

/*
  Result:
  - Runtime: 100 - 121 ms
  - Memory: 53.7 - 54.5 MB
*/
