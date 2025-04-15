# Contact Book Python Program



# Dictionary to store contact name and phone number

contact_book = {}



def add_contact():

    name = input("Enter the contact's name: ")

    phone_number = input("Enter the contact's phone number: ")

    contact_book[name] = phone_number

    print(f"Contact for {name} added successfully.")



def view_contacts():

    if contact_book:

        print("\nContact List:")

        for name, phone_number in contact_book.items():

            print(f"Name: {name}, Phone Number: {phone_number}")

    else:

        print("No contacts available.")



def search_contact():

    name = input("Enter the contact's name to search: ")

    if name in contact_book:

        print(f"Contact Found: Name: {name}, Phone Number: {contact_book[name]}")

    else:

        print("Contact not found.")



def delete_contact():

    name = input("Enter the contact's name to delete: ")

    if name in contact_book:

        del contact_book[name]

        print(f"Contact for {name} deleted successfully.")

    else:

        print("Contact not found.")



def menu():

    while True:

        print("\nContact Book Menu:")

        print("1. Add a Contact")

        print("2. View All Contacts")

        print("3. Search for a Contact")

        print("4. Delete a Contact")

        print("5. Exit")

        

        choice = input("Choose an option (1/2/3/4/5): ")



        if choice == '1':

            add_contact()

        elif choice == '2':

            view_contacts()

        elif choice == '3':

            search_contact()

        elif choice == '4':

            delete_contact()

        elif choice == '5':

            print("Exiting the Contact Book. Goodbye!")

            break

        else:

            print("Invalid option! Please try again.")



# Run the contact book program

menu()
