user1 = input("What is user 1's name? ")
user2 = input("What is user 2's name? ")

user1_Answer = input(user1 + "do you want to choose rock,paper or scissors?").lower()
user2_Answer = input(user2 + "do you want to choose rock,paper or scissors?").lower()

if user1_Answer == user2_Answer:
    print("it's a tie")
elif user1_Answer == "rock":
    if user2_Answer == "scissors":
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user1_Answer == "scissors":
    if user2_Answer == "paper":
        print("Scissor wins!")
    else:
        print("Rock wins!")
elif user1_Answer == 'paper':
    if user2_Answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")