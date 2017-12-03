### This project just consumes GeoIPservice

It's created in order to lear more about SOAP and how to use it.

Here is how I tested it:

```
ping abv.bg
```

Then I copied one of the IPs and passed it as a cmd argument to the program.


I used the following command in order to generate the communication files from the WSDL.

```
wsimport -keep -s /home/biso/workspace/ideaWorkspace/SOAPonsumerExample/src/main/java http://www.webservicex.net/geoipservice.asmx?WSDL
```