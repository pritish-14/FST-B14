user1 = input("What is user 1's name? ")
user2 = input("What is user 2's name? ")

while True:
    user1_Answer = input(user1 + "do you want to choose rock,paper or scissors?").lower()
    user2_Answer = input(user2 + "do you want to choose rock,paper or scissors?").lower()
    
    if user1_Answer == user2_Answer:
        print("It's a tie!")
    elif user1_Answer == 'rock':
        if user2_Answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_Answer == 'scissors':
        if user2_Answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_Answer == 'paper':
        if user2_Answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit