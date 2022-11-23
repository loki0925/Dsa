function runProgram(input) {
    input=input.trim().split('\n');
    var tc = +input[0];
    var line=1;
    var mat=[];
    for(var i=0;i<tc;i++){
        mat.push(input[line++].trim().split(" ").map(Number));
    }
    
    num(tc,mat);
}


function num(n,mat){
    var top=0;
    var bottom=n-1;
    var left=0;
    var right=n-1;
    
    while(top<bottom && left<right){
        
        var last =mat[top+1][left];
        
       for(var i=left ; i<=right ; i++){
           var temp=mat[top][i];
            mat[top][i]=last;
            last =temp;
       }
       top++;
        for(var j=top ; j<=bottom ; j++){
            var temp=mat[j][right]
            mat[j][right]=last;
            last =temp;
       }
       right--;
         for(var k=right ; k>=left ; k--){
            var temp=mat[bottom][k]
            mat[bottom][k]=last;
            last =temp;
       }
       bottom--;
         for(var l=bottom ; l>=top ; l--){
            var temp=mat[l][left]
            mat[l][left]=last ;
            last=temp;
       }
       left++;
        
    }
    
    for( var y=0;y<n;y++){
    bag="";
       for(var z=0;z<n;z++)
       {
        bag+=mat[y][z]+" ";
    }
    console.log(bag);
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