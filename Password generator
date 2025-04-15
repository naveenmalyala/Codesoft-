import random

import string



def generate_password(length=12):

    # Define the characters to use in the password

    characters = string.ascii_letters + string.digits + string.punctuation



    # Randomly select characters to form the password

    password = ''.join(random.choice(characters) for i in range(length))



    return password



# Set the length of the password

password_length = int(input("Enter the desired password length: "))



# Generate the password

password = generate_password(password_length)



# Print the generated password

print(f"Generated Password: {password}")
