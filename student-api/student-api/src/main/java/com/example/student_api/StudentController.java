package com.example.student_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    // READ: give me everyone
    @GetMapping
    public List<Student> getAll() {
        return repo.findAll();
    }

    // CREATE: add a new student
    @PostMapping
    public Student add(@RequestBody Student student) {
        return repo.save(student);
    }

    // UPDATE: change a student
    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student newData) {
        return repo.findById(id).map(existing -> {
            existing.setName(newData.getName());
            existing.setEmail(newData.getEmail());
            existing.setCourse(newData.getCourse());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE: remove a student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
