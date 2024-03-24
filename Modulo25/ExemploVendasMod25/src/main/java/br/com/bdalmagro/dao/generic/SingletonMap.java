package br.com.bdalmagro.dao.generic;

import br.com.bdalmagro.dao.Persistente;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe Singleton que garante que o <code>map</code> será único em toda a vita da aplicação.
 */
public class SingletonMap {

    private static SingletonMap singletonMap;

    /**
     * Contém todos os registros da aplicação.
     * Simula o banco de dados
     */
    protected Map<Class<?>, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }

    /**
     * Método que garante o retorno de apenas uma instância desse objeto
     *
     * @return SingletonMap
     */
    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public <E extends Serializable, T extends Persistente> Map<E, T> getMap(Class<T> clazz) {
        Map<E, T> classMap = (Map<E, T>) map.get(clazz);
        if (classMap == null) {
            classMap = new HashMap<>();
            map.put(clazz, classMap);
        }
        return classMap;
    }
}
