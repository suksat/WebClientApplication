# ChatGPT Spring Boot program v1

ChatGPT Spring Boot program v1 deals with sending POST request to 
```https://api.openai.com/v1/completions``` 

with following JSON: -

```
{
  "model": "text-davinci-003",
  "prompt": "temperature of Nagpur",
  "temperature": 1,
  "max_tokens": 256,
  "top_p": 1,
  "frequency_penalty": 0,
  "presence_penalty": 0
}
```
## Output
"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.3\lib\idea_rt.jar=55933:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\AANYA\Downloads\demo9i\target\classes;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-starter-webflux\2.7.13\spring-boot-starter-webflux-2.7.13.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-starter\2.7.13\spring-boot-starter-2.7.13.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot\2.7.13\spring-boot-2.7.13.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-context\5.3.28\spring-context-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-aop\5.3.28\spring-aop-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-expression\5.3.28\spring-expression-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.7.13\spring-boot-autoconfigure-2.7.13.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.7.13\spring-boot-starter-logging-2.7.13.jar;C:\Users\AANYA\.m2\repository\ch\qos\logback\logback-classic\1.2.12\logback-classic-1.2.12.jar;C:\Users\AANYA\.m2\repository\ch\qos\logback\logback-core\1.2.12\logback-core-1.2.12.jar;C:\Users\AANYA\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.17.2\log4j-to-slf4j-2.17.2.jar;C:\Users\AANYA\.m2\repository\org\apache\logging\log4j\log4j-api\2.17.2\log4j-api-2.17.2.jar;C:\Users\AANYA\.m2\repository\org\slf4j\jul-to-slf4j\1.7.36\jul-to-slf4j-1.7.36.jar;C:\Users\AANYA\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\AANYA\.m2\repository\org\yaml\snakeyaml\1.30\snakeyaml-1.30.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.7.13\spring-boot-starter-json-2.7.13.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.5\jackson-databind-2.13.5.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.5\jackson-annotations-2.13.5.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.5\jackson-core-2.13.5.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.13.5\jackson-datatype-jdk8-2.13.5.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.13.5\jackson-datatype-jsr310-2.13.5.jar;C:\Users\AANYA\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.13.5\jackson-module-parameter-names-2.13.5.jar;C:\Users\AANYA\.m2\repository\org\springframework\boot\spring-boot-starter-reactor-netty\2.7.13\spring-boot-starter-reactor-netty-2.7.13.jar;C:\Users\AANYA\.m2\repository\io\projectreactor\netty\reactor-netty-http\1.0.33\reactor-netty-http-1.0.33.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-codec-http\4.1.94.Final\netty-codec-http-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-common\4.1.94.Final\netty-common-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-buffer\4.1.94.Final\netty-buffer-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-transport\4.1.94.Final\netty-transport-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-codec\4.1.94.Final\netty-codec-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-handler\4.1.94.Final\netty-handler-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-codec-http2\4.1.94.Final\netty-codec-http2-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-resolver-dns\4.1.94.Final\netty-resolver-dns-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-resolver\4.1.94.Final\netty-resolver-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-codec-dns\4.1.94.Final\netty-codec-dns-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-resolver-dns-native-macos\4.1.94.Final\netty-resolver-dns-native-macos-4.1.94.Final-osx-x86_64.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-resolver-dns-classes-macos\4.1.94.Final\netty-resolver-dns-classes-macos-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-transport-native-epoll\4.1.94.Final\netty-transport-native-epoll-4.1.94.Final-linux-x86_64.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-transport-native-unix-common\4.1.94.Final\netty-transport-native-unix-common-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-transport-classes-epoll\4.1.94.Final\netty-transport-classes-epoll-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\projectreactor\netty\reactor-netty-core\1.0.33\reactor-netty-core-1.0.33.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-handler-proxy\4.1.94.Final\netty-handler-proxy-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\io\netty\netty-codec-socks\4.1.94.Final\netty-codec-socks-4.1.94.Final.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-web\5.3.28\spring-web-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-beans\5.3.28\spring-beans-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-webflux\5.3.28\spring-webflux-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-core\5.3.28\spring-core-5.3.28.jar;C:\Users\AANYA\.m2\repository\org\springframework\spring-jcl\5.3.28\spring-jcl-5.3.28.jar;C:\Users\AANYA\.m2\repository\io\projectreactor\reactor-core\3.4.30\reactor-core-3.4.30.jar;C:\Users\AANYA\.m2\repository\org\reactivestreams\reactive-streams\1.0.4\reactive-streams-1.0.4.jar" com.example.demo9i.Demo9iApplication

22:20:08.717 [main] DEBUG reactor.util.Loggers - Using Slf4j logging framework
22:20:08.782 [main] DEBUG io.netty.util.internal.logging.InternalLoggerFactory - Using SLF4J as the default logging framework
22:20:08.788 [main] DEBUG io.netty.util.internal.PlatformDependent0 - -Dio.netty.noUnsafe: false
22:20:08.789 [main] DEBUG io.netty.util.internal.PlatformDependent0 - Java version: 8
22:20:08.792 [main] DEBUG io.netty.util.internal.PlatformDependent0 - sun.misc.Unsafe.theUnsafe: available
22:20:08.793 [main] DEBUG io.netty.util.internal.PlatformDependent0 - sun.misc.Unsafe.copyMemory: available
22:20:08.794 [main] DEBUG io.netty.util.internal.PlatformDependent0 - sun.misc.Unsafe.storeFence: available
22:20:08.795 [main] DEBUG io.netty.util.internal.PlatformDependent0 - java.nio.Buffer.address: available
22:20:08.796 [main] DEBUG io.netty.util.internal.PlatformDependent0 - direct buffer constructor: available
22:20:08.797 [main] DEBUG io.netty.util.internal.PlatformDependent0 - java.nio.Bits.unaligned: available, true
22:20:08.797 [main] DEBUG io.netty.util.internal.PlatformDependent0 - jdk.internal.misc.Unsafe.allocateUninitializedArray(int): unavailable prior to Java9
22:20:08.797 [main] DEBUG io.netty.util.internal.PlatformDependent0 - java.nio.DirectByteBuffer.<init>(long, {int,long}): available
22:20:08.797 [main] DEBUG io.netty.util.internal.PlatformDependent - sun.misc.Unsafe: available
22:20:08.798 [main] DEBUG io.netty.util.internal.PlatformDependent - -Dio.netty.tmpdir: C:\Users\AANYA\AppData\Local\Temp (java.io.tmpdir)
22:20:08.798 [main] DEBUG io.netty.util.internal.PlatformDependent - -Dio.netty.bitMode: 64 (sun.arch.data.model)
22:20:08.799 [main] DEBUG io.netty.util.internal.PlatformDependent - Platform: Windows
22:20:08.801 [main] DEBUG io.netty.util.internal.PlatformDependent - -Dio.netty.maxDirectMemory: 1853358080 bytes
22:20:08.801 [main] DEBUG io.netty.util.internal.PlatformDependent - -Dio.netty.uninitializedArrayAllocationThreshold: -1
22:20:08.803 [main] DEBUG io.netty.util.internal.CleanerJava6 - java.nio.ByteBuffer.cleaner(): available
22:20:08.803 [main] DEBUG io.netty.util.internal.PlatformDependent - -Dio.netty.noPreferDirect: false
22:20:08.893 [main] DEBUG io.netty.util.internal.InternalThreadLocalMap - -Dio.netty.threadLocalMap.stringBuilder.initialSize: 1024
22:20:08.893 [main] DEBUG io.netty.util.internal.InternalThreadLocalMap - -Dio.netty.threadLocalMap.stringBuilder.maxSize: 4096
22:20:09.017 [main] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.level: simple
22:20:09.018 [main] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.targetRecords: 4
22:20:10.073 [main] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv4Stack: false
22:20:10.074 [main] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv6Addresses: false
22:20:10.298 [main] DEBUG io.netty.util.NetUtilInitializations - Loopback interface: lo (Software Loopback Interface 1, 127.0.0.1)
22:20:10.299 [main] DEBUG io.netty.util.NetUtil - Failed to get SOMAXCONN from sysctl and file \proc\sys\net\core\somaxconn. Default: 200
22:20:10.348 [main] DEBUG org.springframework.web.reactive.function.client.ExchangeFunctions - [67f639d3] HTTP POST https://api.openai.com/v1/completions
22:20:10.400 [main] DEBUG io.netty.handler.ssl.OpenSsl - netty-tcnative not in the classpath; OpenSslEngine will be unavailable.
22:20:11.452 [main] DEBUG io.netty.handler.ssl.JdkSslContext - Default protocols (JDK): [TLSv1.3, TLSv1.2]
22:20:11.453 [main] DEBUG io.netty.handler.ssl.JdkSslContext - Default cipher suites (JDK): [TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, TLS_RSA_WITH_AES_128_GCM_SHA256, TLS_RSA_WITH_AES_128_CBC_SHA, TLS_RSA_WITH_AES_256_CBC_SHA, TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384]
22:20:11.496 [main] DEBUG reactor.netty.tcp.TcpResources - [http] resources will use the default LoopResources: DefaultLoopResources {prefix=reactor-http, daemon=true, selectCount=4, workerCount=4}
22:20:11.496 [main] DEBUG reactor.netty.tcp.TcpResources - [http] resources will use the default ConnectionProvider: reactor.netty.resources.DefaultPooledConnectionProvider@291a7e3c
22:20:11.498 [main] DEBUG reactor.netty.resources.DefaultLoopIOUring - Default io_uring support : false
22:20:11.523 [main] DEBUG reactor.netty.resources.DefaultLoopEpoll - Default Epoll support : false
22:20:11.524 [main] DEBUG reactor.netty.resources.DefaultLoopKQueue - Default KQueue support : false
22:20:11.533 [main] DEBUG io.netty.channel.MultithreadEventLoopGroup - -Dio.netty.eventLoopThreads: 8
22:20:11.565 [main] DEBUG io.netty.util.concurrent.GlobalEventExecutor - -Dio.netty.globalEventExecutor.quietPeriodSeconds: 1
22:20:11.582 [main] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.noKeySetOptimization: false
22:20:11.582 [main] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.selectorAutoRebuildThreshold: 512
22:20:11.594 [main] DEBUG io.netty.util.internal.PlatformDependent - org.jctools-core.MpscChunkedArrayQueue: available
22:20:11.645 [main] DEBUG io.netty.resolver.dns.DnsNameResolver - Default ResolvedAddressTypes: IPV4_PREFERRED
22:20:11.646 [main] DEBUG io.netty.resolver.dns.DnsNameResolver - Localhost address: localhost/127.0.0.1
22:20:11.669 [main] DEBUG io.netty.resolver.dns.DnsNameResolver - Windows hostname: DESKTOP-RS34BKE
22:20:11.674 [main] DEBUG io.netty.resolver.dns.DnsNameResolver - Default search domains: []
22:20:11.679 [main] DEBUG io.netty.resolver.dns.DnsNameResolver - Default UnixResolverOptions{ndots=1, timeout=5, attempts=16}
22:20:11.695 [main] DEBUG io.netty.resolver.DefaultHostsFileEntriesResolver - -Dio.netty.hostsFileRefreshInterval: 0
22:20:11.731 [main] DEBUG io.netty.resolver.dns.DefaultDnsServerAddressStreamProvider - Default DNS servers: [/192.168.29.1:53] (sun.net.dns.ResolverConfiguration)
22:20:11.749 [main] DEBUG reactor.netty.resources.PooledConnectionProvider - Creating a new [http] client pool [PoolFactory{evictionInterval=PT0S, leasingStrategy=fifo, maxConnections=500, maxIdleTime=-1, maxLifeTime=-1, metricsEnabled=false, pendingAcquireMaxCount=1000, pendingAcquireTimeout=45000}] for [api.openai.com:443]
22:20:11.820 [main] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.processId: 19052 (auto-detected)
22:20:11.836 [main] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.machineId: 50:2f:9b:ff:fe:80:b3:f8 (auto-detected)
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numHeapArenas: 8
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numDirectArenas: 8
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.pageSize: 8192
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxOrder: 9
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.chunkSize: 4194304
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.smallCacheSize: 256
22:20:11.873 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.normalCacheSize: 64
22:20:11.874 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxCachedBufferCapacity: 32768
22:20:11.874 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.cacheTrimInterval: 8192
22:20:11.874 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.cacheTrimIntervalMillis: 0
22:20:11.874 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.useCacheForAllThreads: false
22:20:11.874 [main] DEBUG io.netty.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxCachedByteBuffersPerChunk: 1023
22:20:11.942 [main] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.allocator.type: pooled
22:20:11.943 [main] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.threadLocalDirectBufferSize: 0
22:20:11.943 [main] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.maxThreadLocalCharBufferSize: 16384
22:20:12.003 [reactor-http-nio-2] DEBUG reactor.netty.resources.PooledConnectionProvider - [79806237] Created a new pooled channel, now: 0 active connections, 0 inactive connections and 0 pending acquire requests.
22:20:12.061 [reactor-http-nio-2] DEBUG reactor.netty.tcp.SslProvider - [79806237] SSL enabled using engine sun.security.ssl.SSLEngineImpl@1c7317a4 and SNI api.openai.com:443
22:20:12.100 [reactor-http-nio-2] DEBUG io.netty.buffer.AbstractByteBuf - -Dio.netty.buffer.checkAccessible: true
22:20:12.100 [reactor-http-nio-2] DEBUG io.netty.buffer.AbstractByteBuf - -Dio.netty.buffer.checkBounds: true
22:20:12.103 [reactor-http-nio-2] DEBUG io.netty.util.ResourceLeakDetectorFactory - Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@30679904
22:20:12.124 [reactor-http-nio-2] DEBUG reactor.netty.transport.TransportConfig - [79806237] Initialized pipeline DefaultChannelPipeline{(reactor.left.sslHandler = io.netty.handler.ssl.SslHandler), (reactor.left.sslReader = reactor.netty.tcp.SslProvider$SslReadHandler), (reactor.left.httpCodec = io.netty.handler.codec.http.HttpClientCodec), (reactor.left.httpDecompressor = io.netty.handler.codec.http.HttpContentDecompressor), (reactor.right.reactiveBridge = reactor.netty.channel.ChannelOperationsHandler)}
22:20:12.191 [reactor-http-nio-1] DEBUG io.netty.resolver.dns.DnsQueryContext - -Dio.netty.resolver.dns.idReuseOnTimeoutDelayMillis: 10000
22:20:12.198 [reactor-http-nio-1] DEBUG io.netty.util.ResourceLeakDetectorFactory - Loaded default ResourceLeakDetector: io.netty.util.ResourceLeakDetector@c3c7a06
22:20:12.201 [reactor-http-nio-1] DEBUG io.netty.resolver.dns.DnsQueryContext - [id: 0x8c1e921c] WRITE: UDP, [2400: /192.168.29.1:53], DefaultDnsQuestion(api.openai.com. IN A)
22:20:12.211 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.maxCapacityPerThread: 4096
22:20:12.211 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.ratio: 8
22:20:12.212 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.chunkSize: 32
22:20:12.212 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.blocking: false
22:20:12.212 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.batchFastThreadLocalOnly: true
22:20:12.225 [reactor-http-nio-1] DEBUG io.netty.resolver.dns.DnsQueryContext - [id: 0x8c1e921c] WRITE: UDP, [40840: /192.168.29.1:53], DefaultDnsQuestion(api.openai.com. IN AAAA)
22:20:12.255 [reactor-http-nio-1] DEBUG io.netty.resolver.dns.DnsNameResolver - [id: 0x8c1e921c] RECEIVED: UDP [2400: /192.168.29.1:53], DatagramDnsResponse(from: /192.168.29.1:53, to: /0:0:0:0:0:0:0:0:63554, id: 2400, QUERY(0), NoError(0), RD RA)
DefaultDnsQuestion(api.openai.com. IN A)
DefaultDnsRawRecord(api.openai.com. 49 IN A 4B)
DefaultDnsRawRecord(api.openai.com. 49 IN A 4B)
DefaultDnsRawRecord(OPT flags:0 udp:1280 0B)
22:20:12.259 [reactor-http-nio-2] DEBUG reactor.netty.transport.TransportConnector - [79806237] Connecting to [api.openai.com/104.18.6.192:443].
22:20:12.260 [reactor-http-nio-1] DEBUG io.netty.resolver.dns.DnsNameResolver - [id: 0x8c1e921c] RECEIVED: UDP [40840: /192.168.29.1:53], DatagramDnsResponse(from: /192.168.29.1:53, to: /0:0:0:0:0:0:0:0:63554, id: 40840, QUERY(0), NoError(0), RD RA)
DefaultDnsQuestion(api.openai.com. IN AAAA)
DefaultDnsRawRecord(api.openai.com. 273 IN SOA 71B)
DefaultDnsRawRecord(OPT flags:0 udp:1280 0B)
22:20:12.290 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Registering pool release on close event for channel
22:20:12.290 [reactor-http-nio-2] DEBUG reactor.netty.resources.PooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Channel connected, now: 1 active connections, 0 inactive connections and 0 pending acquire requests.
22:20:12.607 [reactor-http-nio-2] DEBUG io.netty.handler.ssl.SslHandler - [id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] HANDSHAKEN: protocol:TLSv1.3 cipher suite:TLS_AES_128_GCM_SHA256
22:20:12.608 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}, [connected])
22:20:12.626 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(GET{uri=null, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [configured])
22:20:12.629 [reactor-http-nio-2] DEBUG reactor.netty.http.client.HttpClientConnect - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Handler is being applied: {uri=https://api.openai.com/v1/completions, method=POST}
22:20:12.632 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(POST{uri=/v1/completions, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [request_prepared])
22:20:12.663 [reactor-http-nio-2] DEBUG org.springframework.core.codec.CharSequenceEncoder - [67f639d3] Writing "{<EOL>  "model": "text-davinci-003",<EOL>  "prompt": "temperature of nagpur",<EOL>  "temperature": 1,<EOL>  "max_tok (truncated)..."
22:20:12.691 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(POST{uri=/v1/completions, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [request_sent])
22:20:15.760 [reactor-http-nio-2] DEBUG io.netty.handler.codec.compression.ZlibCodecFactory - -Dio.netty.noJdkZlibDecoder: false
22:20:15.761 [reactor-http-nio-2] DEBUG io.netty.handler.codec.compression.ZlibCodecFactory - -Dio.netty.noJdkZlibEncoder: false
22:20:15.807 [reactor-http-nio-2] DEBUG reactor.netty.http.client.HttpClientOperations - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Received response (auto-read:false) : RESPONSE(decodeResult: success, version: HTTP/1.1)
HTTP/1.1 200 OK
Date: <filtered>
Content-Type: <filtered>
Transfer-Encoding: <filtered>
Connection: <filtered>
access-control-allow-origin: <filtered>
Cache-Control: <filtered>
openai-model: <filtered>
openai-organization: <filtered>
openai-processing-ms: <filtered>
openai-version: <filtered>
strict-transport-security: <filtered>
x-ratelimit-limit-requests: <filtered>
x-ratelimit-limit-tokens: <filtered>
x-ratelimit-remaining-requests: <filtered>
x-ratelimit-remaining-tokens: <filtered>
x-ratelimit-reset-requests: <filtered>
x-ratelimit-reset-tokens: <filtered>
x-request-id: <filtered>
CF-Cache-Status: <filtered>
Server: <filtered>
CF-RAY: <filtered>
alt-svc: <filtered>
22:20:15.807 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(POST{uri=/v1/completions, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [response_received])
22:20:15.827 [reactor-http-nio-2] DEBUG org.springframework.web.reactive.function.client.ExchangeFunctions - [67f639d3] [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Response 200 OK
22:20:15.921 [reactor-http-nio-2] DEBUG reactor.netty.channel.FluxReceive - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] [terminated=false, cancelled=false, pending=0, error=null]: subscribing inbound receiver
22:20:15.946 [reactor-http-nio-2] DEBUG reactor.netty.http.client.HttpClientOperations - [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Received last HTTP packet
22:20:15.954 [reactor-http-nio-2] DEBUG org.springframework.core.codec.StringDecoder - [67f639d3] [79806237-1, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Decoded "{<EOL>  "id": "cmpl-7W6BJEcTL3K0uDJ8Ve0kEAb777Uwh",<EOL>  "object": "text_completion",<EOL>  "created": 16878846 (truncated)..."
22:20:15.955 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(POST{uri=/v1/completions, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [response_completed])
22:20:15.955 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] onStateChange(POST{uri=/v1/completions, connection=PooledConnection{channel=[id: 0x79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443]}}, [disconnecting])
22:20:15.956 [reactor-http-nio-2] DEBUG reactor.netty.resources.DefaultPooledConnectionProvider - [79806237, L:/192.168.29.4:55952 - R:api.openai.com/104.18.6.192:443] Releasing channel
```
{
"id": "cmpl-7W6BJEcTL3K0uDJ8Ve0kEAb777Uwh",
"object": "text_completion",
"created": 1687884613,
"model": "text-davinci-003",
"choices": [
{
"text": "\n\nThe average temperature in Nagpur is 28°C (82°F). The months of December, January and February are the coldest months with an average temperature of 15°C-20°C (59°F-68°F), while the summer months of April, May and June are the hottest with an average temperature of 35°C-45°C (95°F-113°F).",
"index": 0,
"logprobs": null,
"finish_reason": "stop"
}
],
"usage": {
"prompt_tokens": 6,
"completion_tokens": 85,
"total_tokens": 91
}
}
```

Process finished with exit code 0
