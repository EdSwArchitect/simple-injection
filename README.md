# Simple Injection

The interface is Speak which defines the contract methods sayHi() and sayBye() that implementing classes have
to implement.

SpeakCreole is an implementing class that prints out hi and bye in patois. Many times this is called the service 
class or the worker.

SpeakEnglish is an implementing class that prints out hi and bye in English.

SimpleInjection "injects" the service class into the constructor.
When SimpleInjection method salutation() or weOut(),
it uses the service class.

SimpleSetterInjection does the same, however the service class is set
using a setter method.
