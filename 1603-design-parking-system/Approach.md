## The given code implements a simple parking system class that can manage parking spaces for three types of vehicles: big, medium, and small. It allows you to add a car of a specific type to the parking lot and returns whether there is available space for that type of car. Here's an explanation of the approach used in the code:

1. **Initialization of Parking Spaces:**
   - The class `ParkingSystem` has a constructor that takes three parameters: `big`, `medium`, and `small`. These parameters represent the initial number of available parking spaces for each vehicle type.
   - The constructor initializes an instance variable `vehicleCount` as an array of integers with three elements. Each element corresponds to the number of available parking spaces for the respective vehicle type (big, medium, and small).

2. **Adding Cars:**
   - The `addCar` method takes an integer parameter `carType` representing the type of car being added to the parking lot (1 for big, 2 for medium, and 3 for small).
   - Inside the `addCar` method, the code checks whether there is an available parking space for the specified car type.
   - It does this by decrementing the count of available parking spaces for the given car type using the `vehicleCount` array.
   - The expression `vehicleCount[carType-1]-- > 0` first decrements the count and then checks whether the result is greater than zero. If the result is greater than zero, it means there was at least one available parking space, and the method returns `true`. Otherwise, it returns `false`, indicating that there are no available parking spaces for the specified car type.

3. **Private Instance Variable:**
   - The `vehicleCount` array is declared as a private instance variable. This encapsulates the parking space management logic within the class and prevents external access to modify the parking space counts directly.

4. **Usage:**
   - To use this parking system, you would create an instance of the `ParkingSystem` class by providing the initial counts of parking spaces for each vehicle type.
   - You can then call the `addCar` method with the appropriate car type whenever a vehicle arrives at the parking lot. The method will return `true` if there's an available space and `false` otherwise.

## Overall, the approach relies on maintaining an array to keep track of available parking spaces for different vehicle types and efficiently checking and updating these counts when cars are added to the parking lot.
