package com.codersfactory.task;

import com.codersfactory.task.dto.CreateTaskRequestDto;
import com.codersfactory.task.dto.CreateTaskResponseDto;
import com.codersfactory.task.dto.TaskResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tasks")
//@Validated
public class TaskController {
    private TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<CreateTaskResponseDto> createTask(@RequestBody @Valid CreateTaskRequestDto taskDto) {
        CreateTaskResponseDto createdTask = taskService.createTask(taskDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDto> getTask(@PathVariable Long id) {
        TaskResponseDto retrievedTask = taskService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(retrievedTask);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDto> updateTask(@PathVariable Long id, @Valid @RequestBody CreateTaskRequestDto taskDto) {
        TaskResponseDto updatedTask = taskService.updateTask(id, taskDto);
        return ResponseEntity.status(HttpStatus.OK).body(updatedTask);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id){
        taskService.deleteTaskById(id);
        return ResponseEntity.ok().build();
    }

}
