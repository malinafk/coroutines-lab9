# Lab 9 - Coroutines

Each question is in its own package (q1 - q10), file `Main.kt`.

## Question 1
```
Order accepted
Coffee ready
```

## Question 2
With delay:
```
start espresso
start tea
start latte
end tea
end latte
end espresso
```
With Thread.sleep:
```
start espresso
end espresso
start tea
end tea
start latte
end latte
```

## Question 3
```
start
loading user
checking password
opening profile
profile is open
finish
```
## Question 4
Error:
```
suspend function 'suspend fun loadUser(): String' should be called only from a coroutine or another suspend function.
```

Output:
```
fix 1: Bob
fix 2: Bob
```

## Question 5
```
before: main
function returned: main
```

## Question 6
```
download 1 started, thread: main
download 2 started, thread: main
download 3 started, thread: main
download 4 started, thread: main
download 5 started, thread: main
download 6 started, thread: main
download 7 started, thread: main
download 8 started, thread: main
download 9 started, thread: main
download 10 started, thread: main
download 1 finished
download 2 finished
download 3 finished
download 4 finished
download 5 finished
download 6 finished
download 7 finished
download 8 finished
download 9 finished
download 10 finished
```

## Question 7
Prediction: 1 4 2 5 3
```
1
4
2
5
3
```

## Question 8
```
parent body done
child done
report completed
```

## Question 9
```
request 1 cleanup
request 2 cleanup
end
```

## Question 10
```
settings loaded
avatar loaded
Profile ready
end of main
extra coroutine done
```