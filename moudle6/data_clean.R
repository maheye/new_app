# Function to clean and preprocess data
clean_data <- function(data) {

  # Display output to the screen
  cat("Cleaning and preprocessing data...\n")
  
  # Use different R datatypes
  numeric_var <- 10

  character_var <- "Hello"

  logical_var <- TRUE

  vector_var <- c(1, 2, 3)

  matrix_var <- matrix(1:9, nrow = 3, ncol = 3)
  
  # Loop that works with lists or arrays
  for (i in 1:length(vector_var)) {

    cat("Element", i, "of vector_var:", vector_var[i], "\n")

  }
  
  # Create a dataframe
  df <- data.frame(ID = 1:5, Name = c("John", "Jane", "Alice", "Bob", "Eve"), Age = c(25, 30, NA, 40, 35))
  
  # Handle missing values in the dataframe
  df <- df %>% 

    mutate(Age = ifelse(is.na(Age), mean(Age, na.rm = TRUE), Age))
  
  # Display the cleaned dataframe
  cat("\nCleaned dataframe:\n")
  
  print(df)
  
  # Send a message to the process
  message("Data cleaning and preprocessing completed!")
  
  # Return the cleaned dataframe
  return(df)
}

# Function to analyze data
analyze_data <- function(data) {

  # Display output to the screen
  cat("Analyzing data...\n")
  
  # Extract the Name column from the dataframe
  names <- data$Name
  
  # Loop over the names
  for (name in names) {

    cat("Analyzing", name, "\n")

  }
  
  # Perform some analysis on the data
  # ...
  
  # Send a message to the process
  message("Data analysis completed!")
}

# Function to visualize data
visualize_data <- function(data) {
  # Display output to the screen
  cat("Visualizing data...\n")
  
  # Create a scatter plot of Age vs ID
  plot(data$ID, data$Age, main = "Age vs ID", xlab = "ID", ylab = "Age")
  
  # Send a message to the process
  message("Data visualization completed!")
}

# Main function
run_script <- function() {

  # Load required libraries
  library(dplyr)

  library(ggplot2)
  
  # Load and clean data
  data <- read.csv("data.csv")

  cleaned_data <- clean_data(data)
  
  # Analyze and visualize the cleaned data
  analyze_data(cleaned_data)

  visualize_data(cleaned_data)
}

# Call the main function
run_script()