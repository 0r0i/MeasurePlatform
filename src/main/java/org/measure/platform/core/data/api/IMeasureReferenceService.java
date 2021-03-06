package org.measure.platform.core.data.api;

import java.util.List;

import org.measure.platform.core.data.entity.MeasureInstance;
import org.measure.platform.core.data.entity.MeasureReference;

/**
 * Service Interface for managing MeasureReference.
 */
public interface IMeasureReferenceService {
    /**
     * Save a measureReference.
     * @param measureReference the entity to save
     * @return the persisted entity
     */
    MeasureReference save(MeasureReference measureReference);

    /**
     * Get all the measureProperties.
     * @return the list of entities
     */
    List<MeasureReference> findAll();

    /**
     * Get the "id" measureReference.
     * @param id the id of the entity
     * @return the entity
     */
    MeasureReference findOne(Long id);

    /**
     * Delete the "id" measureReference.
     * @param id the id of the entity
     */
    void delete(Long id);

    List<MeasureReference> findByInstance(MeasureInstance instance);

}
