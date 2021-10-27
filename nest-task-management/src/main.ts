import { ValidationPipe } from '@nestjs/common';
import { NestFactory } from '@nestjs/core';
import { AppModule } from './app.module';

import Eureka from 'eureka-js-client';

// Or, if you're not using a transpiler:
const Eureka = require('eureka-js-client').Eureka;

// example configuration
const client = new Eureka({
  instance: {
    app: 'nestj-tesk-management',
    hostName: 'localhost',
    ipAddr: '127.0.0.1',
    port: {
      '$': 3000,
      '@enabled': 'true',
    },
    vipAddress: 'nestj-tesk-management',
    dataCenterInfo: {
      '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
      name: 'MyOwn',
    },
  },
  //retry 10 time for 3 minute 20 seconds.
  eureka: {
    host: 'localhost',
    port: '8761',
    servicePath: '/eureka/apps/',
    maxRetries: 10,
    requestRetryDelay: 2000,
  },
})


async function bootstrap() {
  const app = await NestFactory.create(AppModule);
  app.useGlobalPipes(new ValidationPipe())
  client.start();
  await app.listen(3000);
}
bootstrap();
