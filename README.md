# CHAIN OF RESPONSABILITY
Chain of responsability pattern using 5 different patterns

Se usa el singleton pattern para restringir la creación de objetos pertenecientes a la clase *MclarenCar*.__
El factory pattern se utiliza como clase constructora de los auto moviles de las clases *AudiCar, MercedesCar,MclarenCar*.__
El decorator pattern se utiliza para añadir la funcionalidad de rin y spoiler a las clases implementades de *Car*, con los decoradores *RinDecorator, SpoilerDecorator*.__
Se utiliza template pattern en el decorador para hacer el esqueleto del metodo de poner la funcionalidad en la clase *CarDecorator*.__
Finalmente se utiliza el chain of responsability pattern para mostrar informacion de los procesos en consola.__
