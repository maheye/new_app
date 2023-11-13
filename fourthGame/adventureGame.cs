using System;

class Program
{
    static void Main()
    {
        // Welcome message
        Console.WriteLine("Welcome to the Adventure Game!");
        Console.WriteLine("You find yourself in a dark cave...");

        // Initial game state
        int playerHealth = 100;
        int playerCoins = 0;
        int playerLevel = 1;

        // Game loop - continues until player runs out of health
        while (playerHealth > 0)
        {
            // Display available actions
            Console.WriteLine("\nChoose your action:");
            Console.WriteLine("1. Explore the cave");
            Console.WriteLine("2. Rest");
            Console.WriteLine("3. Visit the shop");
            Console.WriteLine("4. Quit");

            // Get user input
            string userInput = Console.ReadLine();

            // Process user input
            switch (userInput)
            {
                case "1":
                    // Call ExploreCave method
                    ExploreCave(ref playerHealth, ref playerCoins, ref playerLevel);
                    break;
                case "2":
                    // Call Rest method
                    Rest(ref playerHealth);
                    break;
                case "3":
                    // Call VisitShop method
                    VisitShop(ref playerCoins, ref playerLevel);
                    break;
                case "4":
                    // Quit the game
                    Console.WriteLine("Thanks for playing! Goodbye.");
                    return;
                default:
                    // Invalid input
                    Console.WriteLine("Invalid choice. Try again.");
                    break;
            }
        }

        // Player has run out of health
        Console.WriteLine("Game over. You have run out of health!");
    }

    // Method to handle exploring the cave
    static void ExploreCave(ref int health, ref int coins, ref int level)
    {
        Console.WriteLine("You venture deeper into the cave...");

        // Implement adventure logic here
        // For simplicity, deduct some health and gain some coins
        health -= 10;
        coins += 5;

        // Display current status
        Console.WriteLine($"Health: {health}, Coins: {coins}, Level: {level}");

        // Check if player leveled up
        if (health > 0 && coins >= 20 * level)
        {
            level++;
            Console.WriteLine($"Congratulations! You leveled up to level {level}!");
        }
    }

    // Method to handle resting
    static void Rest(ref int health)
    {
        Console.WriteLine("You decide to take a rest...");

        // Implement rest logic here
        // For simplicity, restore some health
        health += 20;

        // Display current status
        Console.WriteLine($"Health restored! Current health: {health}");
    }

    // Method to handle visiting the shop
    static void VisitShop(ref int coins, ref int level)
    {
        Console.WriteLine("You enter a mysterious shop...");

        // Implement shop logic here
        // For simplicity, allow the player to buy health potions
        Console.WriteLine($"Welcome! Health Potion - 10 coins. Your current coins: {coins}");

        Console.WriteLine("Do you want to buy a Health Potion? (Y/N)");
        string buyChoice = Console.ReadLine();

        if (buyChoice.ToUpper() == "Y" && coins >= 10)
        {
            // Deduct coins and provide a health potion
            coins -= 10;
            Console.WriteLine("You bought a Health Potion! Use it wisely.");
        }
        else if (buyChoice.ToUpper() == "Y" && coins < 10)
        {
            Console.WriteLine("You don't have enough coins to buy a Health Potion.");
        }
        else
        {
            Console.WriteLine("You decide not to buy anything. Maybe next time!");
        }

        // Display current status
        Console.WriteLine($"Remaining coins: {coins}, Level: {level}");
    }
}
