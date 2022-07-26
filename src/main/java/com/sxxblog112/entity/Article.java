package com.sxxblog112.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "article_id")
    private String articleId;

    private String articleTitle;

    private LocalDateTime articleAddTime;

    private String articleContext;

    private Integer articleGoodNumber;

    private Integer articleLookNumber;

    private Integer articleCollectionNumber;


}
