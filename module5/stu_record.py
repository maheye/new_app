import sqlite3
from datetime import datetime

# Create a connection to the SQLite database (or create a new one if it doesn't exist)
conn = sqlite3.connect('student_records.db')

# Create a cursor object to interact with the database
cursor = conn.cursor()

# Create tables for students and courses if they don't exist
cursor.execute('''

    CREATE TABLE IF NOT EXISTS students (
        id INTEGER PRIMARY KEY,
        name TEXT,
        grade INTEGER
    )

''')

cursor.execute('''

    CREATE TABLE IF NOT EXISTS courses (
        id INTEGER PRIMARY KEY,
        course_name TEXT,
        student_id INTEGER,
        date_completed DATE,
        FOREIGN KEY (student_id) REFERENCES students(id)
    )

''')

# Function to add a new student
def add_student(name, grade):

    # Insert a new student into the 'students' table
    cursor.execute('INSERT INTO students (name, grade) VALUES (?, ?)', (name, grade))
    conn.commit()
    print(f"Student {name} added successfully!")

# Function to add a new course for a student
def add_course(course_name, student_id, date_completed):

    # Insert a new course into the 'courses' table
    cursor.execute('INSERT INTO courses (course_name, student_id, date_completed) VALUES (?, ?, ?)', (course_name, student_id, date_completed))
    conn.commit()
    print(f"Course {course_name} added successfully!")

# Function to update a student's grade
def update_grade(student_id, new_grade):

    # Update the grade for a specific student
    cursor.execute('UPDATE students SET grade = ? WHERE id = ?', (new_grade, student_id))
    conn.commit()
    print(f"Grade updated for student with ID {student_id}.")

# Function to delete a student and associated courses
def delete_student(student_id):

    # Delete a student and all associated courses
    cursor.execute('DELETE FROM students WHERE id = ?', (student_id,))
    cursor.execute('DELETE FROM courses WHERE student_id = ?', (student_id,))
    conn.commit()
    print(f"Student with ID {student_id} and associated courses deleted.")

# Function to retrieve all students and their courses
def retrieve_data():

    # Retrieve data by joining 'students' and 'courses' tables
    cursor.execute('''
        SELECT students.id, students.name, students.grade, courses.course_name, courses.date_completed
        FROM students
        LEFT JOIN courses ON students.id = courses.student_id
    ''')
    data = cursor.fetchall()

    print("Student Records:")

    for row in data:
        print(f"ID: {row[0]}, Name: {row[1]}, Grade: {row[2]}, Course: {row[3]}, Date Completed: {row[4]}")


# Example usage
add_student('John Doe', 85)

add_student('Jane Smith', 92)

add_course('Math 101', 1, datetime.now().strftime("%Y-%m-%d"))

update_grade(1, 90)

retrieve_data()

# Delete a student and associated courses
delete_student(2)

retrieve_data()

# Close the database connection
conn.close()
