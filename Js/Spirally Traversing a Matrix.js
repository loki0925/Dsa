function spirallyTraversingAMatrix(N, matrix){
    var spiralOrder = [];
  
      for (let l = 0, t = 0, r = matrix[0].length - 1, b = matrix.length - 1 ; l <= r && t <= b ; ++l, ++t, --r, --b)
      {
          for (let i = l; i <= r; ++i) 
              spiralOrder.push(matrix[t][i]);
  
          if (t + 1 > b) continue;
          for (let i = t + 1; i <= b; ++i) 
              spiralOrder.push(matrix[i][r]);
  
          if (r - 1 < l) continue;
          for (let i = r - 1; i >= l; --i)
              spiralOrder.push(matrix[b][i]);
  
          for (let i = b - 1; i > t; --i)
              spiralOrder.push(matrix[i][l]);
      }
  
      console.log(spiralOrder.join(" "));
  }
      