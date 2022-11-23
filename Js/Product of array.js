function runProgram(input){
    input = input.trim().split("\n");
    //console.log(input);
    var tc = +input[0];
    var line = 1;
    
    for(var i=0;i<tc;i++){
        var N =input[line].trim().split(" ");
        line++;
         var arr =input[line].trim().split(" ");
         line++;
        num(N,arr);
        
    }
    
  }
  function num(N,nums){
    const result = [];
    let prefix = 1
 
    for (let i=0; i<nums.length; i++) {
        result[i] = prefix
        prefix *= nums[i]
    }
    let suffix = 1

    for (let i=nums.length - 1; i>=0; i--) {
        result[i] *= suffix
        suffix *= nums[i]
    }

    console.log(result.join(" "));
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