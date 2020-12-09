package ua.com.terminals.service;

import org.springframework.stereotype.Service;
import ua.com.terminals.entity.Terminal;
import ua.com.terminals.exception.TerminalsNotFoundException;
import ua.com.terminals.repo.TerminalsRepo;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Service
public class TerminalsService {

    private TerminalsRepo repo;

    public TerminalsService(TerminalsRepo terminalsRepo) {
        this.repo = terminalsRepo;
    }

    public List<Terminal> getAllTerminals() {
        return repo.findAll();
    }


    public Terminal getTerminalById(long id) {
        return repo.findById(id);
    }

    public void addTerminal(Terminal terminal) {
        repo.save(terminal);
    }

    public Terminal updateTerminalById(Terminal terminal, long id) {
        Terminal current = repo.findById(id);
        current.setCity(terminal.getCity());
        current.setHouse(terminal.getHouse());
        current.setName(terminal.getName());
        current.setStreet(terminal.getStreet());
        current.setStatus(terminal.getStatus());
        repo.save(current);
        return current;
    }

    public void deleteTerminalById(long id) {
        repo.deleteById(id);
    }
}
