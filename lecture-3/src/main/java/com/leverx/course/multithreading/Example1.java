package com.leverx.course.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Example1 {

    private static volatile boolean done = false; //if it was not volatile 'Goodbye' thread might never see 'done' variable

    public static void main(String[] args) {

        Runnable hellos = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hello " + i);
            }
            done = true;
        };

        Runnable goodbyes = () -> {
            int i = 1;
            while (!done) {
                i++;
            }
            System.out.println("Goodbye " + i);
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
    }

}
/*
When multiple threads share variables, updates to those variables may not be immediately visible to other threads.
For example, if one thread sets done = true;, another thread might not see the update immediately due to:
1️⃣ Caching & Memory Synchronization
The processor may store frequently used values in registers or CPU caches, rather than updating main memory immediately.
Special synchronization mechanisms are required to ensure cached copies are updated.
2️⃣ Instruction Reordering
The compiler, JVM, and CPU may rearrange instructions for performance optimization, as long as program semantics remain unchanged. This can lead to unexpected behavior: while (!done) i++; could be reordered as: if (!done) while (true) i++; making it impossible to exit the loop, even if another thread updates done.

To make sure variable updates are immediately visible across threads:
✅ Final Variables (final)
Once initialized, a final variable remains visible to all threads.
✅ Static Variables (static)
The initial value of a static variable is always visible after its initialization.
✅ Volatile Variables (volatile)
Changes to a volatile variable are immediately visible to all threads.
Ensures no instruction reordering for that variable.
✅ Synchronized Blocks (synchronized)
Any changes before releasing a lock become visible to any thread acquiring the same lock.

 */