package com.theokanning.openai.vector.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * https://platform.openai.com/docs/api-reference/vector-stores-file-batches/batch-object
 *
 * @author LiangTao
 * @date 2024年04月19 15:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VectorStoreFilesBatchRequest {

    /**
     * file_ids
     * array
     * <p>
     * Required
     * A list of File IDs that the vector store should use. Useful for tools like file_search that can access files.
     */

    @JsonProperty("file_ids")
    List<String> fileIds;


}
