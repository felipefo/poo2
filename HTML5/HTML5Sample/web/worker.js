var n = 1;
search: while (true) {  
  for (var i = 2; i <= 500000; i += 1){
      n++;
      console.log(n);
      postMessage(n);
  }     
}