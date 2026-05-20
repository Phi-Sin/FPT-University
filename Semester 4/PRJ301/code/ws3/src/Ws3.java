from datetime import datetime
import pickle

class Pet:
    def __init__(self, id, description, import_date, unit_price, category):
        self.id = id
        self.description = description
        self.import_date = import_date
        self.unit_price = unit_price
        self.category = category

class OrderHeader:
    def __init__(self, id, order_date, customer_name):
        self.id = id
        self.order_date = order_date
        self.customer_name = customer_name

class OrderDetail:
    def __init__(self, id, pet_id, quantity, pet_cost):
        self.id = id
        self.pet_id = pet_id
        self.quantity = quantity
        self.pet_cost = pet_cost

class Order:
    def __init__(self, order_header, order_details):
        self.order_header = order_header
        self.order_details = order_details

class PetStore:
    def __init__(self):
        self.pets = {}
        self.orders = {}

    def add_pet(self, id, description, import_date, unit_price, category):
        # Implement data validation rules
        if id in self.pets:
            print("Error: pet ID already exists")
            return
        if len(description) < 3 or len(description) > 50:
            print("Error: description must be between 3 and 50 characters")
            return
        try:
            import_date = datetime.strptime(import_date, '%Y-%m-%d').date()
        except ValueError:
            print("Error: invalid date format")
            return
        if unit_price <= 0:
            print("Error: unit price must be a positive number")
            return
        if category not in ['Cat', 'Dog', 'Parrot']:
            print("Error: category must be one of Cat, Dog, or Parrot")
            return

        # Add the pet to the collection
        pet = Pet(id, description, import_date, unit_price, category)
        self.pets[id] = pet
        print("Pet added successfully")

    def find_pet(self, id):
        if id not in self.pets:
            print("Error: pet not found")
            return
        pet = self.pets[id]
        print(f"ID: {pet.id}\nDescription: {pet.description}\nImport date: {pet.import_date}\n
