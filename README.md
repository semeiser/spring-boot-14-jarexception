Run the app with

```
./mvnw clean package
target/jar-exception-demo-0.0.1-SNAPSHOT.jar
```

Example Output with Spring Boot 1.4.0:

```
 /
 /org/
 /org/springframework/
 /org/springframework/boot/
 /org/springframework/boot/loader/
 /org/springframework/boot/loader/archive/
 /org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator$EntryComparator.class
 /org/springframework/boot/loader/archive/Archive.class
 /org/springframework/boot/loader/archive/ExplodedArchive$FileEntry.class
 /org/springframework/boot/loader/archive/Archive$EntryFilter.class
 /org/springframework/boot/loader/archive/ExplodedArchive$1.class
 /org/springframework/boot/loader/archive/Archive$Entry.class
 /org/springframework/boot/loader/archive/JarFileArchive$EntryIterator.class
 /org/springframework/boot/loader/archive/ExplodedArchive.class
 /org/springframework/boot/loader/archive/ExplodedArchive$FileEntryIterator.class
 /org/springframework/boot/loader/archive/JarFileArchive.class
 /org/springframework/boot/loader/archive/JarFileArchive$JarFileEntry.class
 /org/springframework/boot/loader/PropertiesLauncher$FilteredArchive.class
 /org/springframework/boot/loader/ExecutableArchiveLauncher.class
 /org/springframework/boot/loader/PropertiesLauncher$FilteredArchive$1.class
 /org/springframework/boot/loader/PropertiesLauncher$1.class
 /org/springframework/boot/loader/WarLauncher.class
 /org/springframework/boot/loader/MainMethodRunner.class
 /org/springframework/boot/loader/jar/
 /org/springframework/boot/loader/jar/CentralDirectoryParser.class
 /org/springframework/boot/loader/jar/JarFile$3.class
 /org/springframework/boot/loader/jar/JarURLConnection$JarEntryName.class
 /org/springframework/boot/loader/jar/Handler.class
 /org/springframework/boot/loader/jar/JarURLConnection$1.class
 /org/springframework/boot/loader/jar/JarFile$1.class
 /org/springframework/boot/loader/jar/JarFile.class
 /org/springframework/boot/loader/jar/CentralDirectoryVisitor.class
 /org/springframework/boot/loader/jar/ZipInflaterInputStream.class
 /org/springframework/boot/loader/jar/JarFileEntries$EntryIterator.class
 /org/springframework/boot/loader/jar/JarFile$2.class
 /org/springframework/boot/loader/jar/CentralDirectoryEndRecord.class
 /org/springframework/boot/loader/jar/Bytes.class
 /org/springframework/boot/loader/jar/AsciiBytes.class
 /org/springframework/boot/loader/jar/JarEntry.class
 /org/springframework/boot/loader/jar/CentralDirectoryFileHeader.class
 /org/springframework/boot/loader/jar/JarFileEntries$1.class
 /org/springframework/boot/loader/jar/JarFileEntries.class
 /org/springframework/boot/loader/jar/JarFile$JarFileType.class
 /org/springframework/boot/loader/jar/FileHeader.class
 /org/springframework/boot/loader/jar/JarURLConnection.class
 /org/springframework/boot/loader/jar/JarEntryFilter.class
 /org/springframework/boot/loader/JarLauncher.class
 /org/springframework/boot/loader/LaunchedURLClassLoader.class
 /org/springframework/boot/loader/Launcher.class
 /org/springframework/boot/loader/LaunchedURLClassLoader$1.class
 /org/springframework/boot/loader/util/
 /org/springframework/boot/loader/util/SystemPropertyUtils.class
 /org/springframework/boot/loader/data/
 /org/springframework/boot/loader/data/RandomAccessData$ResourceAccess.class
 /org/springframework/boot/loader/data/RandomAccessDataFile.class
 /org/springframework/boot/loader/data/RandomAccessDataFile$FilePool.class
 /org/springframework/boot/loader/data/RandomAccessData.class
 /org/springframework/boot/loader/data/RandomAccessDataFile$DataInputStream.class
 /org/springframework/boot/loader/data/ByteArrayRandomAccessData.class
 /org/springframework/boot/loader/PropertiesLauncher.class
 /org/springframework/boot/loader/ExecutableArchiveLauncher$1.class
 /org/springframework/boot/loader/PropertiesLauncher$PrefixMatchingArchiveFilter.class
 /org/springframework/boot/loader/PropertiesLauncher$ArchiveEntryFilter.class
 /BOOT-INF/
 /BOOT-INF/lib/
 /BOOT-INF/lib/snakeyaml-1.17.jar
 /BOOT-INF/lib/log4j-over-slf4j-1.7.21.jar
 /BOOT-INF/lib/spring-boot-autoconfigure-1.4.0.RELEASE.jar
 /BOOT-INF/lib/spring-aop-4.3.2.RELEASE.jar
 /BOOT-INF/lib/jcl-over-slf4j-1.7.21.jar
 /BOOT-INF/lib/spring-core-4.3.2.RELEASE.jar
 /BOOT-INF/lib/logback-core-1.1.7.jar
 /BOOT-INF/lib/spring-context-4.3.2.RELEASE.jar
 /BOOT-INF/lib/spring-expression-4.3.2.RELEASE.jar
 /BOOT-INF/lib/spring-boot-1.4.0.RELEASE.jar
 /BOOT-INF/lib/logback-classic-1.1.7.jar
 /BOOT-INF/lib/spring-boot-starter-1.4.0.RELEASE.jar
 /BOOT-INF/lib/jul-to-slf4j-1.7.21.jar
 /BOOT-INF/lib/slf4j-api-1.7.21.jar
 /BOOT-INF/lib/spring-beans-4.3.2.RELEASE.jar
 /BOOT-INF/lib/spring-boot-starter-logging-1.4.0.RELEASE.jar
 /BOOT-INF/classes/
 Exception in thread "main" java.lang.reflect.InvocationTargetException
 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 	at java.lang.reflect.Method.invoke(Method.java:497)
 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48)
 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87)
 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50)
 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:58)
 Caused by: java.io.UncheckedIOException: java.util.zip.ZipException: loc: wrong sig ->20746168
 	at java.nio.file.FileTreeIterator.fetchNextIfNeeded(FileTreeIterator.java:88)
 	at java.nio.file.FileTreeIterator.hasNext(FileTreeIterator.java:104)
 	at java.util.Iterator.forEachRemaining(Iterator.java:115)
 	at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
 	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
 	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
 	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
 	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
 	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
 	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
 	at com.example.FilesWalkJarExceptionApplication.main(FilesWalkJarExceptionApplication.java:18)
 	... 8 more
 Caused by: java.util.zip.ZipException: loc: wrong sig ->20746168
 	at com.sun.nio.zipfs.ZipFileSystem$Entry.readExtra(ZipFileSystem.java:2277)
 	at com.sun.nio.zipfs.ZipFileSystem$Entry.cen(ZipFileSystem.java:1903)
 	at com.sun.nio.zipfs.ZipFileSystem$Entry.readCEN(ZipFileSystem.java:1871)
 	at com.sun.nio.zipfs.ZipFileSystem.getEntry0(ZipFileSystem.java:1329)
 	at com.sun.nio.zipfs.ZipFileSystem.getFileAttributes(ZipFileSystem.java:317)
 	at com.sun.nio.zipfs.ZipPath.getAttributes(ZipPath.java:664)
 	at com.sun.nio.zipfs.ZipFileSystemProvider.readAttributes(ZipFileSystemProvider.java:294)
 	at java.nio.file.Files.readAttributes(Files.java:1737)
 	at java.nio.file.FileTreeWalker.getAttributes(FileTreeWalker.java:219)
 	at java.nio.file.FileTreeWalker.visit(FileTreeWalker.java:276)
 	at java.nio.file.FileTreeWalker.next(FileTreeWalker.java:372)
 	at java.nio.file.FileTreeIterator.fetchNextIfNeeded(FileTreeIterator.java:84)
```


If you change the version of Spring Boot to 1.3.7 no exception is thrown.