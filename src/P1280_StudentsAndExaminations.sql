SELECT
    Students.student_id,
    Students.student_name,
    Subjects.subject_name,
    IFNULL(E.c, 0) attended_exams
FROM Students JOIN Subjects ON student_id
LEFT JOIN (
    SELECT student_id, subject_name, COUNT(*) c
    FROM Examinations
    GROUP BY student_id, subject_name
) E USING (student_id, subject_name)
ORDER BY student_id, subject_name;