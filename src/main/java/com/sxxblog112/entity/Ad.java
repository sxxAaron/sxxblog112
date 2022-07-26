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
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ad_id")
    private String adId;

    private String adTypeId;

    private String adTitle;

    private String adUrl;

    private Integer adSort;

    private LocalDateTime adBeginTime;

    private LocalDateTime adEndTime;

    private LocalDateTime adAddTime;


}
