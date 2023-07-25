from random import randint
import time
time.clock=time.time
from numpy.random import randint 
import matplotlib.pyplot as plt


def bubblesort(arr):
    n=len(arr)
    for i in range(n):
        for j in range(n-i-1):
            if(arr[j]>arr[j+1]):
                arr[j],arr[j+1]=arr[j+1],arr[j]


def selectionsort(arr):
    n=len(arr)
    for i in range(n):
        min=i
        for j in range(i+1,n):
            if(arr[j]<arr[min]):
                min=j
        arr[i],arr[min]=arr[min],arr[i]


def insertionSort(arr):
    n=len(arr)
    for i in range(1,n):
        key=arr[i]
        j=i-1
        while(arr[j]>key and j>=0):
            arr[j+1]=arr[j]
            j=j-1
    arr[j+1]=key

# merge sort functions start from here


def merge(arr,lb,mid,ub):
    n1=mid-lb+1
    n2=ub-mid

    l=[0]* (n1)
    r=[0]*(n2)

    for i in range(0,n1):
        l[i] = arr[lb+i]
    
    for j in range(0,n2):
        r[j]=arr[mid+1+j]

    i=0
    j=0
    k=lb

    while i < n1 and j < n2:
        if l[i] <= r[j]:
            arr[k] = l[i]
            i += 1
        else:
            arr[k] = r[j]
            j += 1
        k += 1    

    while i<n1:
        arr[k]=l[i]
        i+=1
        k+=1

    while j<n2:
        arr[k]=r[j]
        j+=1
        k+=1

def mergesort(arr,lb,ub):
    if lb<ub:
        mid=lb+(ub-lb)//2
        mergesort(arr,lb,mid)
        mergesort(arr,mid+1,ub)
        merge(arr,lb,mid,ub)

# merge sort ends here


#quick sort starts from here
def partition(arr,low,high):
    
    pivot=arr[low]
    i=low+1
    j=high 

    while True:
        while(i<=j and arr[i]<=pivot):
            i=i+1
        while(i<=j and arr[j]>=pivot):
            j-=1
        if(i>j):
            break
        arr[i],arr[j]=arr[j],arr[i]
        i+=1
        j-=1
    arr[low],arr[j]=arr[j],arr[low]
    return j

def quicksort(arr,low,high):
    if(low<=high):
        p=partition(arr,low,high)

        quicksort(arr,low,p-1)
        quicksort(arr,p+1,high)

elements = list()
time_bs=list()
time_ss=list()
time_is=list()
time_ms=list()
time_qs=list()
for i in range(1,5):
    a=randint(0,100*i,100*i)
    start=time.clock()
    bubblesort(a)
    end=time.clock()
    time_bs.append(end-start)
    print(len(a),"Elements sorted in bubble sort in ",end-start)

    start=time.clock()
    selectionsort(a)
    end=time.clock()
    time_ss.append(end-start)
    print(len(a),"Elements are sorted in selection sort in ",end-start)


    start=time.clock()
    insertionSort(a)
    end=time.clock()
    time_is.append(end-start)
    print(len(a),"Elements are sorted in insertion sort in ",end-start)
    
    
    start=time.clock()
    mergesort(a,0,len(a)-1)
    end=time.clock()
    time_ms.append(end-start)
    print(len(a),"Elements are sorted in merge sort in ",end-start)

    start=time.clock()
    quicksort(a,0,len(a)-1)
    end=time.clock()
    time_qs.append(end-start)
    print(len(a),"Elements are sorted in quick sort in ",end-start)

    elements.append(len(a))


plt.xlabel('List length')
plt.ylabel('Time Complexity')
plt.plot(elements,time_bs,label="Bubble sort")
plt.plot(elements,time_ss,label="Selection sort")
plt.plot(elements,time_is,label="insertion sort")
plt.plot(elements,time_ms,label="merge sort")
plt.plot(elements,time_qs,label="Quick sort")

plt.grid()
plt.legend()
plt.show()
