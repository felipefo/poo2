var n = 1;
search: while (true) {
  n += 1;
  for (var i = 2; i <= 500000000 i += 1)
    if (n % i == 0)
     continue search;
  // found a prime!
  postMessage(n);
}