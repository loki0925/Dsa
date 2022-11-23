BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        
        while(tc-->0){
            int n = Integer.parseInt(br.readLine());
            int [] arr= Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(twice(n,arr));
        }