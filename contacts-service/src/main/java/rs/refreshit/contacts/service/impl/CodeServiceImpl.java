package rs.refreshit.contacts.service.impl;

import org.springframework.stereotype.Service;
import rs.refreshit.contacts.model.code.AbstractCode;
import rs.refreshit.contacts.service.CodeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/10/2016.
 */
@Service("codeService")
public class CodeServiceImpl implements CodeService {

    @Override
    public <T extends AbstractCode> List<T> fetchAll(Class<T> type) {
        return new ArrayList<>();
    }
}
