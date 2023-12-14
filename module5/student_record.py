import sqlite3

# Create a database and connect to it
conn = sqlite3.connect('student_records.db')
cursor = conn.cursor()

# Create a table to store student data
cursor.execute('''
    CREATE TABLE IF NOT EXISTS students (
        id INTEGER PRIMARY KEY,
        name TEXT,
        grade REAL
    )
''')

# Function to add a new student
def add_student():

    # Get student details from user
    name = input("Enter student name: ")
    grade = float(input("Enter grade: "))
    
    # Insert student data into the database
    cursor.execute('''
        INSERT INTO students (name, grade)
        VALUES (?, ?)
    ''', (name, grade))
    
    conn.commit()
    print("Student added successfully!")

# Function to update a student's grade
def update_grade():

    # Get student ID and new grade from user
    student_id = int(input("Enter student ID: "))
    new_grade = float(input("Enter new grade: "))
    
    # Update student's grade in the database
    cursor.execute('''
        UPDATE students
        SET grade = ?
        WHERE id = ?
    ''', (new_grade, student_id))
    
    conn.commit()
    print("Grade updated successfully!")

# Function to generate a report
def generate_report():
    # Perform a join between students and courses tables
    cursor.execute('''
        SELECT s.name, s.grade, c.course_name
        FROM students s
        JOIN courses c ON s.id = c.student_id
    ''')
    
    report_data = cursor.fetchall()
    
    # Display the report
    print("Report:")
    for row in report_data:

        print(f"Student Name: {row[0]}")

        print(f"Grade: {row[1]}")

        print(f"Course: {row[2]}")

        print()
        
# Main program loop
while True:
    # Display menu options
    print("1. Add a new student")

    print("2. Update a student's grade")

    print("3. Generate a report")

    print("4. Quit")
    
    # Get user's choice
    choice = int(input("Enter your choice: "))
    
    if choice == 1:
        add_student()

    elif choice == 2:
        update_grade()

    elif choice == 3:
        generate_report()

    elif choice == 4:
        break
    
    else:
        print("Invalid choice. Please try again.")

# Close the database connection
conn.close()