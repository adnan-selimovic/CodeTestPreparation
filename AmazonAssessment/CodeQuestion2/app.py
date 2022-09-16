#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'findMaximumSustainableClusterSize' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER_ARRAY processingPower
#  2. INTEGER_ARRAY bootingPower
#  3. LONG_INTEGER powerMax
#
#5
#2
#1
#3
#4
#5
#5
#3
#6
#1
#3
#4
#25
def findMaximumSustainableClusterSize(processingPower, bootingPower, powerMax):
    # Write your code here
    print(bootingPower)
    print(processingPower)
    print(powerMax)
    sustainable_cluster = list()
    threashold = False
    saved_processor = 0

    j = 0
    k = 2
    net_power_consumption = 0

    for i in range(len(bootingPower)):
        if (i < k):
            sustainable_cluster.append(processingPower[i])
            continue
        
        k = k + 1
        max_booting_power = max(bootingPower[j:k])
        print(max_booting_power)
        sustainable_cluster.append(processingPower[i])
        print("Curr cluster: " + ' '.join(str(f) for f in sustainable_cluster))

        net_power_consumption = max_booting_power + sum(sustainable_cluster) * k

        if (net_power_consumption > powerMax):
            if (saved_processor > 0):
                sustainable_cluster.insert(0, saved_processor)
                sustainable_cluster.pop()
                print("sustainable cluster found" + ' '.join(str(f) for f in sustainable_cluster))
                return len(sustainable_cluster)
            else:
                k = k - 1

            if (i == len(bootingPower) - 1):
                return len(sustainable_cluster)

            print("threashold reached")
            j = j + 1
            threashold = True
            saved_processor = sustainable_cluster.pop(0)
            continue

        #k = k + 1

    return 0

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    processingPower_count = int(input().strip())

    processingPower = []

    for _ in range(processingPower_count):
        processingPower_item = int(input().strip())
        processingPower.append(processingPower_item)

    bootingPower_count = int(input().strip())

    bootingPower = []

    for _ in range(bootingPower_count):
        bootingPower_item = int(input().strip())
        bootingPower.append(bootingPower_item)

    powerMax = int(input().strip())

    result = findMaximumSustainableClusterSize(processingPower, bootingPower, powerMax)

    fptr.write(str(result) + '\n')

    fptr.close()