# pull official base image
FROM node:18.12.1-alpine
# add a bash shell to the image
RUN apk add --no-cache bash
# set working directory
WORKDIR /app

# add `/app/node_modules/.bin` to $PATH
ENV PATH /app/node_modules/.bin:$PATH
RUN echo "Path: $PATH"
# install app dependencies
COPY package.json ./
#COPY package-lock.json ./
#RUN npm install --silent
#RUN npm install react-scripts@5.0.1 -g --silent
RUN yarn
# add All to app
COPY . ./

# start app
# CMD ["npm", "start"]
# Best-Practice with ENTRYPOINT!
ENTRYPOINT ["yarn", "start"]
