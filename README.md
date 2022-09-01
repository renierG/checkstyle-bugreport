```bash
java -jar checkstyle-10.3.3-all.jar -c checkstyle_lineWrappingIndentation4.xml Test.java
Starting audit...
[ERROR] /Users/mgrein/Downloads/checkstyle/Test.java:6:9: 'annotation array initialization' child has incorrect indentation level 8, expected level should be 4. [Indentation]
[ERROR] /Users/mgrein/Downloads/checkstyle/Test.java:7:9: 'annotation array initialization' child has incorrect indentation level 8, expected level should be 4. [Indentation]
Audit done.
Checkstyle ends with 2 errors.
```

```bash
java -jar checkstyle-10.3.3-all.jar -c checkstyle_lineWrappingIndentation8.xml Test.java
Starting audit...
Audit done.
```

