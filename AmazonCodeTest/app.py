#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'maxSetSize' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY riceBags as parameter.
#

def maxSetSize(riceBags):
    # Write your code here
    riceBags_sorted = sorted(riceBags)
    perfect_set = []
    perfect_set_max = []
    max_set_size = 0
    found = False

    print(riceBags_sorted)

    # perfect[i] * perfect[i] = perfect[i + 1], 1 <= i < n
    for i in range(len(riceBags_sorted)):
        rice_bag = riceBags_sorted[i]
        j = i + 1
        perfect_set.append(rice_bag)

        for j in range(len(riceBags_sorted)):
            if (rice_bag * rice_bag == riceBags_sorted[j]):
                perfect_set.append(riceBags_sorted[j])
                rice_bag = riceBags_sorted[j]
                i = j
                found = True
                
        if (not found):
            perfect_set.pop()
        else:
            found = False

        print(perfect_set)

        if (len(perfect_set) > len(perfect_set_max)):
            perfect_set_max = perfect_set.copy()

        perfect_set.clear()

    m = len(perfect_set_max)
    print(m)
    return m if m > 0 else -1

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    riceBags_count = int(input().strip())

    riceBags = []

    for _ in range(riceBags_count):
        riceBags_item = int(input().strip())
        riceBags.append(riceBags_item)

    result = maxSetSize(riceBags)

    fptr.write(str(result) + '\n')

    fptr.close()