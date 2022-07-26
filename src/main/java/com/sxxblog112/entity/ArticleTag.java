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
public class ArticleTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "article_tag_id")
    private String articleTagId;

    private String articleTagName;

    private LocalDateTime articleTagAddTime;


}
