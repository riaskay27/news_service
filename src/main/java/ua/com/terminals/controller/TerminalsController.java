package ua.com.terminals.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.terminals.entity.Terminal;
import ua.com.terminals.service.TerminalsService;

@RestController
@RequestMapping(value = "/app",
        produces = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "http://localhost:3000")
public class TerminalsController {

    private TerminalsService service;

    public TerminalsController(TerminalsService terminalsService) {
        this.service= terminalsService;
    }

    @GetMapping("terminals")
    public ResponseEntity<Object> getAllTerminals() {
        return new ResponseEntity<>(service.getAllTerminals(), HttpStatus.OK);
    }

    @GetMapping("terminal/{id}")
    public ResponseEntity<Object> getTerminalById(@PathVariable(value = "id") long id) {
        return new ResponseEntity<>(service.getTerminalById(id), HttpStatus.OK);
    }

    @PostMapping("terminal")
    public ResponseEntity<Object> addTerminal(@RequestBody Terminal terminal) {
        service.addTerminal(terminal);
        return new ResponseEntity<>("Terminal is created successfully"+ terminal.toString(), HttpStatus.OK);
    }

    @PutMapping("terminal/{id}")
    public ResponseEntity<Object> updateTerminalById(@PathVariable(value = "id") long id,
                                                 @RequestBody Terminal terminal) {
        Terminal terminal_new = service.updateTerminalById(terminal,id);
        return new ResponseEntity<>("Terminal is updated successfully"+ terminal_new.toString(), HttpStatus.OK);
    }

    @DeleteMapping("terminal/{id}")
    public ResponseEntity<Object> deleteTerminalById(@PathVariable(value = "id") long id) {
        service.deleteTerminalById(id);
        return new ResponseEntity<>("Terminal is deleted", HttpStatus.OK);
    }
}
