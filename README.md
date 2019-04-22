# TryCatchBlockExceptionHandling

- practice on try/catch and try/catch block exception handling
- create custom exception using


                    try {
                        throw (new Exception("custom message/literal string"));
                    } catch (Exception e) {
                      System.out.println(e.printMessage());
                    }
      
      
- if the code encounters the throw statement, that path of execution will shift to the catch blocks, and Java will look for the catch block that catches this exception. If it doesn't find one, then the exception will be fatal (error that causes a program to abort/application encountered a condition it cannot resolve.)
