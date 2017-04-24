# primes
Java pocket implementation of a prime numbers seeker within a range, used to support the teaching of Concurrent Programming to my Computer Science students.

The repository holds actually 3 applications:
* **sequential**: search for prime numbers within a range with only one main thread at the job.
* **concurrent-nosync**: starts *n* worker threads that will split the range within which prime numbers will be searched and each worker thread takes care of a partition; problem is that the main thread does NOT wait for the workers to synchronize before finishing execution.
* **concurrent-sync**: starts *n* worker threads that will split the range within which prime numbers will be searched and each worker thread takes care of a partition; the main thread does wait for the workers to synchronize before finishing execution.

The goal of this project is to teach students about the benefits of concurrent programming, even though some overhead might still be considered due to threads synchronization and management in order to achieve a correct and functional solution.

It is pretty basic, I know. But maybe you can help me impove it. Take a look into the License section further below.

## Usage
First compile the applications using ``javac`` and then execute their main class on terminal:
```
java Buscador
```

The applications request for the input parameters they need right on terminal, such as beginning and end of the seeking interval, and number of worker threads whenever applied.
The messages are all in Brazilian Portuguese, which I appologize for... well, at least if you are not a Brazilian Portuguese speeker. On the other hand, this may represent a first improvement opportunity. If you also have interest on didactic concurrent programming, perhaps you want to help me develop this project. In this case, please create a pull request and start a branch so we can start working together.

## License
Feel free to fork it, improve it and share it independently as you wish. Or maybe you'd rather go further and create a pull request so we can work together.

## Support
No support will be provided. Use it at your own risk. But if you need to get in touch for any other reason or you have significant improvement advices to share, please open an issue and I promise I'll try to respond it as soon as possible.