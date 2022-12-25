intervals[N] // intervals array of N meetings

sort( intervals, intervals + N ); // sorting the array in non decreasing order of meeting's start time

flag = 0;

for( i from 1 to N - 1 ){

  if( intervals[i][1] > intervals[i+1][0] ){

    flag = 1;
    break;
  }

 if( flag == 1 )

    print("false");

 else

    print("true");
