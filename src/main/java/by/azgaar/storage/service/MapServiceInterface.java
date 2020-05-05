package by.azgaar.storage.service;

import by.azgaar.storage.entity.Map;
import by.azgaar.storage.entity.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MapServiceInterface {

    Map create(Map map);

    Page<Map> getAllByOwner(User owner, Pageable pageable);

    Map getOneById(String id);

    Map getOneByOwner(User owner, String id);

    Map getOneByOwnerAndFilename(User owner, String filename);

    Map update(User owner, Map oldMap, Map newMap);

    String delete(User owner, String id);

    void saveMapData(User owner, Map map);

}