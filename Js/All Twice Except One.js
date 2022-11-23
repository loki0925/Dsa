function runProgram(input){
    input = input.trim().split("\n");
    //console.log(input);
    var tc = +input[0];
    var line = 1;
    
    for(var i=0;i<tc;i++){
        var N =input[line].trim().split(" ").sort();
        line++;
         var arr =input[line].trim().split(" ").sort();
         line++;
        (num(N,arr));
        
    }
    
  }
  function num(N,arr){
    //console.log(arr);
    if(arr.length>= 2){
    for(var i=0;i<arr.length;i=i+2){
        if(arr[i] != arr[i+1]){
            console.log(arr[i]);
            break;
        }
    }
   }else{
        console.log(arr[0]);
    }
      
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