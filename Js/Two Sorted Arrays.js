function runProgram(input){
    input = input.trim().split("\n");
    //console.log(input);
    var tc = +input[0];
    var line = 1;
    
    for(var i=0;i<tc;i++){
        var N =input[line]
        line++;
         var arr =input[line].trim().split(" ").map(Number);
         line++;
      
         var arr2 =input[line].trim().split(" ").map(Number);
         line++;
        num(N,arr,arr2);
        
        
    }
    
  }
  function num(N,arr,arr2){
  
  
  var l =0;
  var r = arr.length-1;
  var count=0;
  while(l<arr.length && r>=0){
              if (arr[l] < arr2[r])
              l++;
              else if (arr[l] > arr2[r])
              r--;
              else{
                  count++;
                  l++;
                  r--;
              }
  }
        
    console.log(count);
      
      
  }
  
   
  
  if (process.env.USER === "") {
    runProgram(``);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0);
    });
  }