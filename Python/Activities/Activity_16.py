class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
            print(self.manufacturer + " " + self.model + " has started moving")
        
    def stop(self):
            print(self.manufacturer + " " + self.model + " has stopped")

        
Car1 = Car("Hundai","i20",2010,"Manual","Red")
Car2 = Car("Suzuki","alto K10",2013,"Automatic","White")
Car3 = Car("Renault","Duster",2007,"Manual","Brown")

Car1.accelerate()
Car1.stop()