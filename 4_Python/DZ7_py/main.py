import menu
import phonebook


number = -1
phonebook.initialization()
while number != 0:
    number = menu.view()
    if number == 1:
        phonebook.show()
    if number == 2:
        phonebook.new_record()
    if number == 3:
        phonebook.remove_record()
    if number == 4:
        phonebook.save_file()
    print()
