function runProgram(input){
    input = input.trim().split("\n");
    //console.log(input);
    var tc = +input[0];
    var line = 1;
    var arr =input[line].trim().split(" ").map(Number);
   
    num(tc,arr);
    
        
   
    
  }
  function num(N,arr){
   var sum1 =0;
   var flag = true;
   var max = 0;
    
  
  
    for(var i=0;i<arr.length;i++){
        sum1 = sum1+arr[i];
        
      var sum2 =0;
      for(var j=i+2;j<arr.length;j++){
          sum2 = sum2+arr[j];
         
         
      } //console.log(sum1,sum2);
      
      if(sum1 ==sum2 ){
          max = i+2;
           flag = false;
           break;
          
       }  
       
    }
    if(flag == false){
        console.log(max);
    }
    else{
        console.log(-1);
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