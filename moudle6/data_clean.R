# Load necessary libraries
library(dplyr)

# Function to load data from CSV file
load_data <- function(file_path) {
  data <- read.csv(file_path)
  return(data)
}

# Function to display summary statistics
display_summary <- function(data) {
  summary(data)
}

# Function to handle missing values
handle_missing_values <- function(data) {
  # Replace missing values with mean for numeric columns
  data_numeric <- data %>% select_if(is.numeric)
  data[data_numeric] <- lapply(data_numeric, function(x) ifelse(is.na(x), mean(x, na.rm = TRUE), x))
  
  # Replace missing values with mode for categorical columns
  data_factor <- data %>% select_if(is.factor)
  data[data_factor] <- lapply(data_factor, function(x) ifelse(is.na(x), as.character(stats::mode(x)), x))
  
  return(data)
}

# Function to preprocess data (example: scaling numeric columns)
preprocess_data <- function(data) {
  data_numeric <- data %>% select_if(is.numeric)
  data[data_numeric] <- lapply(data_numeric, function(x) (x - min(x, na.rm = TRUE)) / (max(x, na.rm = TRUE) - min(x, na.rm = TRUE)))
  return(data)
}

# Function to save cleaned data to a new CSV file
save_cleaned_data <- function(data, output_file) {
  write.csv(data, file = output_file, row.names = FALSE)
}

# Main script
file_path <- "messy_data.csv"

# Load data
data <- load_data(file_path)

# Display summary statistics
display_summary(data)

# Handle missing values
data_cleaned <- handle_missing_values(data)

# Preprocess data
data_preprocessed <- preprocess_data(data_cleaned)

# Save cleaned and preprocessed data to a new CSV file
output_file <- "cleaned_data.csv"
save_cleaned_data(data_preprocessed, output_file)
