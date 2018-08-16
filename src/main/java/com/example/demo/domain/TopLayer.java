package com.example.demo.domain;

import lombok.Data;

import java.util.List;

/**
 * @author sunlei19
 * @create 2018/8/13
 */
@Data
public class TopLayer {
    private Integer topId;
    private List<OneLayer> oneLayer;
}
