print  "Start Batch Operation!"

import os
import random

os.chdir('generated_file/')

fo = open("list_int", 'w')

num = 0

for num in range(0,5):
	print "generating iteration "+str(num)
	array = random.sample(range(1, 10000000), 3000000)
	random.shuffle(array)

	# fo.write(str(array))
	for int in array:
	   fo.write(str(int)+'\n')
	num += 1;
fo.close()

print "Finish generating data to the file!"
