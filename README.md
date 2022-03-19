# sample-qrcode

A very simple QR code generator

## Run Standalone

~~~
$ mvn clean verify
$ java -cp 'target/lib/*:target/sample-qrcode.jar' \
  com.github.phoswald.sample.qrcode.Generator "https://phoswald.ch" output.png 128
$ file output.png
$ xdg-open output.png &
~~~
