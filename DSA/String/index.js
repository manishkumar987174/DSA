function add(...y) {
  console.log(y);
  var sum = 0;
  for (let i = 0; i < y.length; i++) {
    sum += y[i];
  }
  return sum;
}

console.log(add(2, 3, 4, 5, 56, 6));
