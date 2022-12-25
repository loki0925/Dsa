function runProgram(input) {
    input = input.trim().split("\n");
    var tc = input[0];
    var line = 1;
    
    var arr= input[line].trim().split(" ").map(Number).sort((a,b) => a-b);
    var arr1 = input[++line].trim().split(" ").map(Number).sort((a,b) => a-b);
    sum1=0;
  
     for(var i=0;i<arr.length;i++){
         sum1 = sum1+(arr[i]*arr1[i]);
         
     }  
     console.log(sum1);
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