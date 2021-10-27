FROM node:14
WORKDIR /app
ADD package.json /app/package.json
RUN npm config set registry http://registry.npmjs.org
RUN npm install
RUN npm install -g @nestjs/cli
ADD . /app
EXPOSE 3000
CMD ["npm", "run", "start"]