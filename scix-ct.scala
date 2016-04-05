val scix_raw = sc.textFile("C:/Users/Kizmet/Documents/rgd/scix/scix-raw.txt")
val wc = scix_raw.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b).sortBy(_._2, false)
wc.saveAsTextFile("C:/Users/Kizmet/Documents/rgd/scix/out/scix-counts")
