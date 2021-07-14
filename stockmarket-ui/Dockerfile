# stage 1
FROM node:latest as node
WORKDIR /app
COPY . /app
RUN npm install
RUN npm run build --prod

# stage 2
FROM nginx:1.17.1-alpine
COPY /dist/stockmarket-ui /usr/share/nginx/html