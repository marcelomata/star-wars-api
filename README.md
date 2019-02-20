# Starwars api

This api allows to manage planets that appears on Starwars. It can add new Planets and also get planets from [swapi.co](https://swapi.co/). 

# Running tests 
In order to perform some tests it is required to have docker ce installed in your Linux distribution. Link to [Ubuntu installation](https://docs.docker.com/v17.12/install/linux/docker-ce/ubuntu/#install-docker-ce-1). 

The file run.sh inside the folder docker starts a flow where an mysql database will be setup in a docker container and the api in another container. Some curl commands are performed to test the api and after that both applications running in the containers are shutdown:

```
	# if you are in the root of maven project
	cd docker && ./run.sh
```
